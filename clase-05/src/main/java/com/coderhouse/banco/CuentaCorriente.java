package com.coderhouse.banco;

public class CuentaCorriente extends Cuenta {
	
	@Override
	public void abrirCuenta() {
		System.out.println("Abrio una cuenta corriente" + getTitular());

	}
	
}
