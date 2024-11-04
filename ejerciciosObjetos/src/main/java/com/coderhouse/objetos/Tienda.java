package com.coderhouse.objetos;

public class Tienda {
	
	 // Constante
    private static final double DESCUENTO = 0.10; // 10% de descuento

    // Método para calcular el precio final aplicando el descuento
    public double calcularPrecioFinal(double precioOriginal) {
        double descuentoAplicado = precioOriginal * DESCUENTO;
        double precioFinal = precioOriginal - descuentoAplicado;
        return precioFinal;
    }

    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        double precioOriginal = 100.0;
        double precioConDescuento = tienda.calcularPrecioFinal(precioOriginal);
        
        System.out.println("Precio original: $" + precioOriginal);
        System.out.println("Precio con descuento: $" + precioConDescuento);
    }
    
    

}
