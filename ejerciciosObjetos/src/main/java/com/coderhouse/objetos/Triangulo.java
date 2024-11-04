package com.coderhouse.objetos;

public class Triangulo {
	
	 // Atributos para almacenar la base y la altura del triángulo
    private double base;
    private double altura;

    // Constructor para inicializar la base y la altura
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área del triángulo
    public double calcularArea() {
        return (base * altura) / 2;
    }

}
