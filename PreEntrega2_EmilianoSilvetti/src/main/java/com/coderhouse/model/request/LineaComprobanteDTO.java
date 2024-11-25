package com.coderhouse.model.request;

import com.coderhouse.model.Producto;

public class LineaComprobanteDTO {

    private Producto producto;  // El producto asociado a esta línea
    private int cantidad;       // La cantidad del producto en esta línea

    // Constructor
    public LineaComprobanteDTO(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // Getters y setters
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Opcional: Un método para obtener el precio del producto
    public double getPrecio() {
        return producto != null ? producto.getPrecio() : 0.0;
    }
} 