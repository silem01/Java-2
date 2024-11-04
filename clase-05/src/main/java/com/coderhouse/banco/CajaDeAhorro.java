package com.coderhouse.banco;

public class CajaDeAhorro extends Cuenta {

	@Override
	public void abrirCuenta() {
		System.out.println("Abrio una caja de ahorro" + getTitular());

	}
	
	
}
