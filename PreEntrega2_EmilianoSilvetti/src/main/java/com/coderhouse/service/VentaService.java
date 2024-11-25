package com.coderhouse.service;

import com.coderhouse.model.Cliente;
import com.coderhouse.model.Producto;
import com.coderhouse.model.Venta;
import com.coderhouse.model.request.ComprobanteRequest;
import com.coderhouse.repository.ClienteRepository;
import com.coderhouse.repository.ProductoRepository;
import com.coderhouse.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProductoRepository productoRepository;

    private static final String WORLD_CLOCK_API = "http://worldclockapi.com/api/json/utc/now";

    /**
     * Método para guardar una venta con validaciones.
     */
    public Venta crearComprobante(ComprobanteRequest request) throws Exception {
        // Validar si el cliente existe
        Cliente cliente = clienteRepository.findById(request.getCliente().getClienteid())
                .orElseThrow(() -> new Exception("Cliente no encontrado con ID: " + request.getCliente().getClienteid()));

        double precioTotal = 0;
        int cantidadTotalProductos = 0;

        // Procesar las líneas de productos
        for (var linea : request.getLineas()) {
            Producto producto = productoRepository.findById(linea.getProducto().getProductoid())
                    .orElseThrow(() -> new Exception("Producto no encontrado con ID: " + linea.getProducto().getProductoid()));

            // Validar stock disponible
            if (linea.getCantidad() > producto.getStock()) {
                throw new Exception("Stock insuficiente para el producto: " + producto.getNombre());
            }

            // Actualizar stock
            producto.setStock(producto.getStock() - linea.getCantidad());
            productoRepository.save(producto);

            // Calcular precio total y cantidad total
            precioTotal += producto.getPrecio() * linea.getCantidad();
            cantidadTotalProductos += linea.getCantidad();
        }

        // Obtener la fecha del comprobante
        Date fechaComprobante = obtenerFechaDesdeServicioExterno();

        // Crear y guardar la venta
        Venta venta = new Venta();
        venta.setCliente(cliente);
        venta.setFecha(fechaComprobante);
        venta.setTotal(precioTotal);
        venta.setCantidadProductos(cantidadTotalProductos);
        venta.setLineas(request.getLineas());
        return ventaRepository.save(venta);
    }

    /**
     * Obtener la fecha desde un servicio externo o local en caso de error.
     */
    private Date obtenerFechaDesdeServicioExterno() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String response = restTemplate.getForObject(WORLD_CLOCK_API, String.class);
            String fechaString = response.split(":")[1].replace("\"", "").replace("}", "");
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(fechaString);
        } catch (Exception e) {
            return new Date(); // Si falla, usar la fecha local
        }
    }

    /**
     * Métodos existentes, sin modificaciones.
     */
    public Venta guardarVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    public Optional<Venta> buscarVentaPorId(Long id) {
        return ventaRepository.findById(id);
    }

    public List<Venta> listarVentas() {
        return ventaRepository.findAll();
    }

    public void eliminarVenta(Long id) {
        ventaRepository.deleteById(id);
    }
}
