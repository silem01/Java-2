package com.coderhouse;

public class Clase02 {

	public static void main(String[] args) {
	/*
	int numeroA = 70;
	int numeroB = 200;
	String operacion = "";
	float resultado;
	
	if(numeroA > numeroB) {
		System.out.println(numeroA + " es mayor que " + numeroB);
	}
	else {
		System.out.println("El numero " + numeroB + " es mayor que " + numeroA);
	}
	
	//Calculadora	
	float numeroA = 1;
	float numeroB = 1;
	float resultado = numeroA / numeroB;
	
	
	if(numeroB !=0) {
		System.out.println("El resultado es: " + resultado);
		
	}else {
		System.out.println("No se puede dividir por 0");
	}
	
		
	 int ingreseSuNumero = -1;
	 
	 if(ingreseSuNumero > 0) {
		 
		 System.out.println("El numero " + ingreseSuNumero + " es positivo");
	 }
	 else if(ingreseSuNumero < 0) {
		 System.out.println("El numero " + ingreseSuNumero + " es negativo");
	 }
	 else if(ingreseSuNumero == 0) {
		 System.out.println("El numero " + ingreseSuNumero + " es 0");
	 }
	 else {
		 System.out.println(ingreseSuNumero + "no es un numero valido");
	 }
	
		//Validar dia de la semana usando if - else if
		
		int numeroDeDia = 7;
		
		
		if(numeroDeDia ==1) {
			System.out.println("Lunes");
		}
		
		else if(numeroDeDia ==2) {
			System.out.println("Martes");
		}
		else if(numeroDeDia ==3) {
			System.out.println("Miercoles");
		}
		else if(numeroDeDia ==4) {
			System.out.println("Jueves");
		}
		else if(numeroDeDia ==5) {
			System.out.println("Viernes");
		}
		else if(numeroDeDia ==6) {
			System.out.println("Sabado");
		}
		else if(numeroDeDia ==7) {
			System.out.println("Domingo");
		}
		else  {
			System.out.println("El numero ingresado no coincide con ningun numero de la semana");
		}
		
		
		//Switch 
		int numeroDeDia = 55;
		String nombreDelDia;
		
		switch(numeroDeDia) { 
			case 1: nombreDelDia = "Lunes";
			break;
			case 2: nombreDelDia = "Martes";
			break;
			case 3: nombreDelDia = "Miercoles";
			break;
			case 4: nombreDelDia = "Jueves";
			break;
			case 5: nombreDelDia = "Viernes";
			break;
			case 6: nombreDelDia = "Sabado";
			break;
			case 7: nombreDelDia = "Domingo";
			break;
			default: nombreDelDia = "Dia invalido";
			break;
		   }
		System.out.println("El dia de la semana correspondiente al numero " + numeroDeDia + " es el " + nombreDelDia);
		
		
		
		
		String dia = "LUNES";
		
		switch (dia.toLowerCase()) {
		case "lunes":
			System.out.println("Hoy es " + dia);
		break;
		case "martes":
		System.out.println("Hoy es " + dia);
		break;
		case "miercoles":
			System.out.println("Hoy es " + dia);
			break;
		case "jueves":
			System.out.println("Hoy es " + dia);
			break;
		case "viernes":
			System.out.println("Hoy es " + dia);
			break;
		case "sabado":
			System.out.println("Hoy es " + dia);
			break;
		case "domingo":
			System.out.println("Hoy es " + dia);
			break;
		default: System.out.println("Dia invalido, ingreso: " + dia);
		break;
	   }
	*/
		
		
		//Operador Ternario
		
		int numeroA = 10;
		int numeroB = 2;
		
		boolean condicion = numeroA < numeroB;
		boolean resultado = condicion ? true : false;
		System.out.println("La condicion es " + resultado);
		
		
		String mensaje = (numeroA < numeroB)? "mensaje true" : "mensaje false";
		System.out.println(mensaje);
		}
	
	
		
	}


