package com.coderhouse.model.request;

import com.coderhouse.model.Producto;

public class LineaComprobanteDTO {

    private Producto producto;  // producto asociado a esta lonea
    private int cantidad;       	// cantidad del producto en esta línea

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

    // metodo para obtener el precio del producto
    public double getPrecio() {
        return producto != null ? producto.getPrecio() : 0.0;
    }
} 