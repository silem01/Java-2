package com.coderhouse.objetos;

public class CuentaBancaria {
	
	//Atributos de la clase 
	private double saldo;
	private String titular;
	
	// Constructor para inicializar los atributos
	
	public CuentaBancaria(String titular, double saldoInicial) {
		this.titular = titular;
		this.saldo = saldoInicial;
		
	}
	
	
	
	
	
//Metodo para mostrar el saldo

	public void mostrarSaldo() {
		System.out.println("Titular: " + titular);
		System.out.println("Saldo actual: " + saldo);

}
	
	
	
	
	
	
}