package com.coderhouse.objetos;

public class Libro {

	//Atributos
	
	private String autor;
	private String titulo;
	
	//Constructor

	public Libro(String autor, String titulo) {
		this.autor = autor;
		this.titulo = titulo;
	} 
	
	
	
	//Metodo para imprimir los datos
	
	public void imprimirDatos() {
		System.out.println("Autor: " + autor);
		System.out.println("Titulo: " + titulo);
	}
}

