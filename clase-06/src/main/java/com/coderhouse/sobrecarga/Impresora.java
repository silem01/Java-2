package com.coderhouse.sobrecarga;

public class Impresora {
	
	public void imprimir(int numero) {
		System.out.println("Imprimiendo el numero " + numero);
	}
	
	
	public void imprimir(int numeroA, int numeroB) {
		System.out.println("Imprimiendo el numero " + numeroA + " Y el numero "+ numeroB);
	}
	
	public void imprimir(String texto) {
		System.out.println("Imprimiendo el texto " + texto);
	}
		
	public void imprimir(int[] numeros) {
		System.out.println("Imprimiendo el array: " );
		for(int numero : numeros) {
				System.out.println(numero + " \n");
			
			
			}
		
		
		
		
		
		
		
		
		
		
		
		
		}
	

}
