package com.coderhouse.banco;

public class Persona {
	
	
	private String titular;
	private int dni;
	
	
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	@Override
	public String toString() {
		return "Persona [titular=" + titular + ", dni=" + dni + "]";
	}
	
	
	
}