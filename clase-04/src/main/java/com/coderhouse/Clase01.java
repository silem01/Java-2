package com.coderhouse;

import com.coderhouse.objetos.Perro;

public class Clase01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		//Perro primerPerro = new Perro (); //Instancio la clase perro
		
		/*primerPerro.nombre = "Jerry";
		primerPerro.color = "Marron";
		primerPerro.edad = 3;
		primerPerro.raza = "Dogo";
		primerPerro.tamaño = "Grande";
		
		
		primerPerro.setNombre("Jerry");
		primerPerro.setColor("Rojo");
		
		primerPerro.ladrar();
		primerPerro.caminar();
		
		
		
		
		String[] nombres = new String[] {
				"Lorena",
				"Alejandro",
				"Luis",
				"Tevez",
				"Vito"
		};
		
		imprimirListaDeNombres(nombres);
		sumarNumeros(1,4);
		*/
		
		Perro primerPerro = new Perro ();
		
		try {
		
		primerPerro.setNombre("Jerry");
		primerPerro.setColor("Blanco");
		primerPerro.setRaza("Dogo");
		primerPerro.setTamaño("Grande");
		primerPerro.setEdad(15);
		
		System.out.println("Nombre: " + primerPerro);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
		
	private static void imprimirListaDeNombres(String[] nombres) {
		for (String nombre : nombres) {
			System.out.println("Nombre: " + nombre);
		}
		
		
	}
	
	private static void sumarNumeros(int numeroA, int numeroB) {
		
		System.out.println("La suma entre " + numeroA + " y " + numeroB + " es de " + (numeroA + numeroB));
	}; 
	

}
