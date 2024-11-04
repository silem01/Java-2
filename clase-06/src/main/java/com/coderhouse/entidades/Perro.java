package com.coderhouse.entidades;

public class Perro extends AnimalTerrestre{
	
	@Override
	public void emitirSonido() {
		System.out.println(getNombre() + "Emitio sonido");
	}
	@Override
	public void moverse() {
		System.out.println(getNombre() + "El animal camino");
	}
	@Override
	public void comer() {
		System.out.println(getNombre() + "El animal comio");
	}
	
	
	public boolean amigable() {
		return true;
	}
	
}
