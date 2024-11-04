package com.coderhouse.banco;

public class Cuenta {
	
	private int numero;
	private double saldo;
	private Persona titular;
	
	
	public void verSaldo() {
		System.out.println("El saldo es: " + getSaldo());
	}
	
	public void transferir() {
		System.out.println("Hizo una transferencia" + getTitular());

	}
	
	public void abrirCuenta() {
		System.out.println("Abrio una cuenta" + getTitular());

	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", saldo=" + saldo + ", titular=" + titular + "]";
	}
	
	
}
