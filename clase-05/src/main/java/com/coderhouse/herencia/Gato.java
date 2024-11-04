package com.coderhouse.herencia;

public class Gato extends Animal {
	
	@Override
	public void hacerSonido() {
		System.out.println(getNombre() + " está mauyando");
	}
	
	public void dormir() {
		System.out.println(getNombre() + " está durmiendo");
	}
}