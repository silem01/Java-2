package com.coderhouse;

import com.coderhouse.entidades.AnimalTerrestre;
import com.coderhouse.entidades.Auto;
import com.coderhouse.entidades.Perro;
import com.coderhouse.interfaces.SerVivoInterface;
import com.coderhouse.sobrecarga.Impresora;

public class Main {

	public static void main(String[] args) {
		
//		Perro miPerro = new Perro();
//		
//		miPerro.setNombre("Firulay");
//		miPerro.setEdad(5);
//		
//		System.out.println(miPerro);
//		
//		miPerro.amigable();
//		miPerro.comer();
//		miPerro.emitirSonido();
//		miPerro.moverse();
//		
//		System.out.println("La ubicacion de " + miPerro.getNombre() +
//				" esta en el "+ SerVivoInterface.UBICACION);
//		
//		
//		String ubicacion = AnimalTerrestre.UBICACION;
//		
//		Auto miAuto = new Auto();
//		
//		miAuto.apagar();
//		miAuto.enciende();
//		miAuto.mover();
//		miAuto.setRuedas(4);
//		miAuto.mostrarCantidaDeRuedas();
//		
//		//int cantidadDeRuedas = miAuto.mostrarCantidaDeRuedas();
//		
//		//System.out.println("Mi auto tiene " + cantidadDeRuedas + " ruedas");
	
		Impresora miImpresora = new Impresora();
		
		miImpresora.imprimir(10);
		miImpresora.imprimir(10, 20);
		miImpresora.imprimir("Jerry");
		
		int[] enteros = {1,2,3,4};
		miImpresora.imprimir(enteros);
		
		
	}
	
	
	
	}


