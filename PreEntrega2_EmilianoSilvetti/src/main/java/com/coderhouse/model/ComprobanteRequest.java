package com.coderhouse.model;

import java.util.List;

public class ComprobanteRequest {

    private Cliente cliente;
    private List<LineaComprobanteRequest> lineas;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<LineaComprobanteRequest> getLineas() {
        return lineas;
    }

    public void setLineas(List<LineaComprobanteRequest> lineas) {
        this.lineas = lineas;
    }

    public static class LineaComprobanteRequest {
        private Integer cantidad;
        private Producto producto;

        public Integer getCantidad() {
            return cantidad;
        }

        public void setCantidad(Integer cantidad) {
            this.cantidad = cantidad;
        }

        public Producto getProducto() {
            return producto;
        }

        public void setProducto(Producto producto) {
            this.producto = producto;
        }
    }
}