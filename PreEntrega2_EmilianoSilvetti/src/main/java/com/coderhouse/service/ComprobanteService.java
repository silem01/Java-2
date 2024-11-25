package com.coderhouse.service;

import com.coderhouse.dto.ComprobanteDTO;
import com.coderhouse.model.Cliente;
import com.coderhouse.model.Comprobante;
import com.coderhouse.model.LineaComprobante;
import com.coderhouse.model.Producto;
import com.coderhouse.repository.ClienteRepository;
import com.coderhouse.repository.ComprobanteRepository;
import com.coderhouse.repository.LineaComprobanteRepository;
import com.coderhouse.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ComprobanteService {

    @Autowired
    private ComprobanteRepository comprobanteRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private LineaComprobanteRepository lineaComprobanteRepository;

    @Transactional
    public Comprobante guardarComprobante(ComprobanteDTO comprobanteDTO) {
        // Validar cliente
        Cliente cliente = clienteRepository.findById(comprobanteDTO.getCliente().getClienteId())
                .orElseThrow(() -> new IllegalArgumentException("Cliente no encontrado"));

        // Crear comprobante
        Comprobante comprobante = new Comprobante();
        comprobante.setCliente(cliente);
        comprobante.setFecha(LocalDateTime.now());

        double total = 0;
        int cantidadTotal = 0;
        List<LineaComprobante> lineas = new ArrayList<>();

        for (var lineaDTO : comprobanteDTO.getLineas()) {
            Producto producto = productoRepository.findById(lineaDTO.getProducto().getProductoId())
                    .orElseThrow(() -> new IllegalArgumentException("Producto no encontrado"));

            if (lineaDTO.getCantidad() > producto.getStock()) {
                throw new IllegalArgumentException("Stock insuficiente para el producto " + producto.getNombre());
            }

            producto.setStock(producto.getStock() - lineaDTO.getCantidad());
            productoRepository.save(producto);

            LineaComprobante linea = new LineaComprobante();
            linea.setComprobante(comprobante);
            linea.setProducto(producto);
            linea.setCantidad(lineaDTO.getCantidad());
            linea.setPrecioUnitario(producto.getPrecio());
            total += lineaDTO.getCantidad() * producto.getPrecio();
            cantidadTotal += lineaDTO.getCantidad();

            lineas.add(linea);
        }

        comprobante.setLineas(lineas);
        comprobante.setTotal(total);
        comprobante.setCantidadProductos(cantidadTotal);

        return comprobanteRepository.save(comprobante);
    }

    public List<Comprobante> listarComprobantes() {
        return comprobanteRepository.findAll();
    }

    public Comprobante buscarComprobantePorId(Long id) {
        return comprobanteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Comprobante no encontrado"));
    }
}
