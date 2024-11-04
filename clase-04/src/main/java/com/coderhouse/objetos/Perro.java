package com.coderhouse.objetos;

public class Perro {

	private static final int EDAD_MAXIMA = 15; //Constante
	
	
	//Atributos
	private String nombre;
	private String raza;
	private String color;
	private int edad;
	private String tamaño;
	
	
	//Metodos
	public void ladrar() {
		System.out.println(nombre + " está ladrando");
	}
	
	public void caminar() {
		System.out.println(nombre + " está caminando.!");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	
	
	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) throws Exception{//Arrojar excepcion
		String mensajeDeError = "El perro no vive mas de " + EDAD_MAXIMA + " años de edad";
		if(edad >= EDAD_MAXIMA) {
			throw new Exception(mensajeDeError);
		} else {
			this.edad = edad;
		
	}	

		
		
	}

	//Metodo que imprima todos los datos 
	
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", edad=" + edad + ", tamaño="
				+ tamaño + "]";
	}


	
	
	
		
	
	
	
	
	
	
	 
}
