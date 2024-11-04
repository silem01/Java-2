package com.coderhouse.objetos;

public class Vehiculo {
	
	//Crea una clase Vehiculo con atributos velocidad y combustible, y un método que disminuya el combustible.
	
	 private int velocidad;
	    private double combustible;

	    // Constructor para inicializar los atributos
	    public Vehiculo(int velocidad, double combustible) {
	        this.velocidad = velocidad;
	        this.combustible = combustible;
	    }
	    
	    public void disminuirCombustible(double cantidad) {
	    	if(combustible >= cantidad) {
	    		combustible -= cantidad;
	    		System.out.println("Combustible disminuido en cantidad " + cantidad + " litros" + " Combustible restante: " + combustible + " listros");
	    		
	    	}else {
	    		System.out.println("No hay suficiente combustible para disminuir esa cantidad");
	    	}
	    }
	    
	    //Metodo para mostrar estado actual del vehiculo 
	    
	    public void mostrarEstado() {
	    	System.out.println("La velocidad actual del auto es " + velocidad + "Km/h");
	    	System.out.println("Combustible restante: " + combustible + " litros");
	    }

}
