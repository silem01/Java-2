package com.coderhouse.objetos;

public class Persona1 {
	
	private String nombre;
	
	//Constructor
	public Persona1(String nombre) {
		this.nombre = nombre;
	}

	
	  // Método para saludar con el nombre de la persona
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + "!");
    }
	
	
}
