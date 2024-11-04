package com.coderhouse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Clase03 {

	public static void main(String[] args) {
		
		//Arrays
		
		
		/*
		int [] arrayInt = new int[7];
		arrayInt[0] = 1;
		arrayInt[1] = 2;
		arrayInt[2] = 3;
		arrayInt[3] = 4;
		arrayInt[4] = 5;
		arrayInt[5] = 6;
		
		
		System.out.println("La cantidad de elementos del array es: " + arrayInt.length);
		
		
		System.out.println("El elemento del array con posicion/indice 0: " + arrayInt[0]);
		System.out.println("El elemento del array con posicion/indice 1: " + arrayInt[1]);
		System.out.println("El elemento del array con posicion/indice 2: " + arrayInt[2]);
		System.out.println("El elemento del array con posicion/indice 3: " + arrayInt[3]);
		System.out.println("El elemento del array con posicion/indice 4: " + arrayInt[4]);
		System.out.println("El elemento del array con posicion/indice 5: " + arrayInt[5]);
		System.out.println("El elemento del array con posicion/indice 6: " + arrayInt[6]);
		
		
		System.out.println(Arrays.toString(arrayInt));
		
		//Otra forma de declaracion
		
		
		String[] palabras = {
				"Hola",
				"Mundo",
				"Coder",
				"Chau"
				
		};
		
		
		System.out.println("La cantidad de elementos del array es: " + palabras.length);
		System.out.println(Arrays.toString(palabras));
		
		/*
		 * 
		 */
		
		
		//Lista
		
		//List<String> listaDeNombres = new ArrayList<>();
		
		//listaDeNombres.add("Steve");
		//listaDeNombres.add("Bruno");
		//listaDeNombres.add("Jerry");
		
		
		//System.out.println(listaDeNombres);
		
		//List<String> listaDeNombres2 = new ArrayList<>();
		
		//listaDeNombres2.add("Coscu");
		//listaDeNombres2.add("Momo");
		//listaDeNombres2.add("Tevez");
		
		//List<String> listaDeNombres3 = new ArrayList<>();
		//System.out.println(listaDeNombres2);
		
		//listaDeNombres.addAll(listaDeNombres2);
		
		//Unir los dos Arrays
		
		//System.out.println("Despues de agregar fusionar listas " + listaDeNombres );
		
		//for(String nombre: listaDeNombres) {
			
			//System.out.println("Nombre: " + nombre);
		//}
		
		
		//for(String nombre: listaDeNombres2) {
			
		//	System.out.println("Nombre: " + nombre);
			
		//}
		
		//if (listaDeNombres3.isEmpty()) {
			
		//	System.out.println("El array listaDeNombres3 esta vacio");
		//}
		
		//Revisar posiciones
		//int indice = 5;
		//System.out.println("El nombre de la posicion " + indice + " es el " + listaDeNombres.get(indice));
		
		//listaDeNombres.set(indice, "Herny");
		//System.out.println(listaDeNombres);
		
		//REMOVE
		//listaDeNombres.remove(0);
		//System.out.println(listaDeNombres);
		//listaDeNombres.removeAll(listaDeNombres2);
		//System.out.println(listaDeNombres);
		
		
		//String fede = "Federico";
		
		//System.out.println(listaDeNombres.indexOf(fede));
		
		
		
		
		
		//listaDeNombres.add("Bruno");
		//listaDeNombres.add("Alejandro");
		//listaDeNombres.add("Federico");
		//listaDeNombres.add("Daniel");
		
	
		
		
		//Ciclos por condicion 
		/*System.out.println("La cantidad de elementos de listaDeNombres antes de es: " + listaDeNombres.size());
		
		Iterator<String> iterator = listaDeNombres.iterator();
		
		while(iterator.hasNext()) {
			String nombre = iterator.next();
			System.out.println("Nombre: " + nombre);
			iterator.remove();
			
		}
		System.out.println("La cantidad de elementos de listaNombres luego de iterar es: " + listaDeNombres.size());
		*/
		
		//for(String nombre: listaDeNombres) {
			//System.out.println("Nombre: " + nombre);
		}
		//Ciclos While
		
		//int contador = 1;
		/*
		while(contador < 5) {
			System.out.println("El contador vale: " + contador);
			contador++;
		}
		
		do {
				//System.out.println("El contador actual: " + contador);
				//contador++;
		}while(contador < 0);
		
		
		for(int contador = 1; contador <= 10; contador++) {
			System.out.println("El contador actual valr: " + contador);
		}
		
		//ForEach
		*/
		List<String> listaDeNombres = new ArrayList<>();
		listaDeNombres.add("Bruno");
		listaDeNombres.add("Alejandro");
		listaDeNombres.add("Federico");
		listaDeNombres.add("Gabriel");
	
		
		listaDeNombres.forEach(nombre ->{
			String nombre;
			System.out.println("Nombre: " + nombre);
		});
		
		
	}
	
}
