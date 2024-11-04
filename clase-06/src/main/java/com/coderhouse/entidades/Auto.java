package com.coderhouse.entidades;

import com.coderhouse.abstractas.Vehiculo;

public class Auto extends Vehiculo {

	@Override
	public void enciende() {
		System.out.println("El auto enciende");

	}

	@Override
	public void apagar() {
		System.out.println("El auto apaga");


	}

	@Override
	public void mover() {
		System.out.println("El auto se mueve");
	}
	
	

	
	

}
