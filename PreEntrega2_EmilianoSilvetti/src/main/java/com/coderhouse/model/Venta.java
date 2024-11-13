package com.coderhouse.model;

import jakarta.persistence.*;
import java.util.Date;

import com.coderhouse.model.Cliente;
import com.coderhouse.model.Producto;

@Entity
public class Venta 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int cantidad;
    private Date fecha;

    
    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;

    
    @Column(nullable = false)
    private double total;

    

    public Venta() {}

    public Venta(int cantidad, Date fecha, Cliente cliente, Producto producto, double total) {
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.cliente = cliente;
        this.producto = producto;
        this.total = total;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", cantidad=" + cantidad + ", fecha=" + fecha + ", cliente=" + cliente
				+ ", producto=" + producto + ", total=" + total + "]";
	}

  
}
