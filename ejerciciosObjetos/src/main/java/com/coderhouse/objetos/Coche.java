package com.coderhouse.objetos;

public class Coche {

//Crea un objeto Coche con atributos marca, modelo y año e imprime los valores.
	
//Atributos de la clase

	private String marca;
	private String modelo;
	private int año;
	
	
	//Constructor para inicializar los atributos
	public Coche(String marca,String modelo,int año  ) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
	}
	
	//Metodo imprimir datos del auto
	
	public void imprimirDatos() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Año: " + año);
	}

}
