package com.coderhouse.objetos;

public class Producto {
	
	//Crea una clase Producto con atributos nombre y precio, y un método para calcular el precio con impuestos.

	// Atributos de la clase
    private String nombre;
    private double precio;
    
    
	
	
    // Constructor para inicializar los atributos
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
	
    }
    
    //Metodo para calcular precio con impuestos
    public double calcularPrecioConImpuestos(double tasaImpuesto) {
    	return precio + (precio * tasaImpuesto / 100);
    }
    
    
    //Metodo para mostrar los detalles del producto
    
    public void mostrarDetalles() {
    	 System.out.println("Nombre del producto: " + nombre);
         System.out.println("Precio original: $" + precio);
    }
    
    
    
}
