package com.coderhouse.herencia;

public class Perro extends Animal {
	
	public void hacerSonido() {
		System.out.println(getNombre() + " está Ladrando");
	}
	
	
	public void saltar() {
		System.out.println(getNombre() + " está Saltando");
	}
}
