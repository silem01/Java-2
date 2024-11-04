package com.coderhouse.entidades;

import com.coderhouse.interfaces.AccionesInterfaces;
import com.coderhouse.interfaces.SerVivoInterface;

public class AnimalTerrestre implements SerVivoInterface, AccionesInterfaces{
	
	private boolean vivo;
	
	private String nombre;
	
	private String raza;
	
	private Integer edad;
	
	public void emitirSonido() {
		
	}
	
	public void moverse() {
		
	}
	
	public void comer() {
		
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return this.raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Integer getEdad() {
		return this.edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Animal [vivo=" + vivo + ", nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + "]";
	}

	@Override
	public boolean estaVivo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
