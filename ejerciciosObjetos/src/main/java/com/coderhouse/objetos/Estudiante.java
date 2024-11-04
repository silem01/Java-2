package com.coderhouse.objetos;

public class Estudiante {
	
	//Crea un método en una clase Estudiante que calcule la calificación promedio de tres materias.
	
	 // Atributos para almacenar las calificaciones de tres materias
    private double materia1;
    private double materia2;
    private double materia3;
    
    
 // Constructor para inicializar las calificaciones
    public Estudiante(double materia1, double materia2, double materia3) {
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
        
        
    }
    
    

    // Método para calcular el promedio de las tres materias
    public double calcularPromedio() {
        return (materia1 + materia2 + materia3) / 3;
    }
    
    
}
