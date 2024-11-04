package com.coderhouse.objetos;

public class Persona {
	
	 // Atributos privados
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para edad
    public int getEdad() {
        return edad;
    }

    // Setter para edad
    public void setEdad(int edad) {
        if (edad >= 0) { // Validación para que la edad no sea negativa
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        
        
        }
        }
        }
