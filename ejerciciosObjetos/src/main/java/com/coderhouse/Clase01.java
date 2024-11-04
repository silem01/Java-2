package com.coderhouse;

import com.coderhouse.objetos.Calculadora;
import com.coderhouse.objetos.Coche;
import com.coderhouse.objetos.CuentaBancaria;
import com.coderhouse.objetos.Estudiante;
import com.coderhouse.objetos.Libro;
import com.coderhouse.objetos.Persona;
import com.coderhouse.objetos.Persona1;
import com.coderhouse.objetos.Producto;
import com.coderhouse.objetos.Tienda;
import com.coderhouse.objetos.Vehiculo;

public class Clase01 {

	public static void main(String[] args) {
		//Crear un objeto/Instanciar
		/*Persona persona1 = new Persona("Jerry", 78);
		
		//Imprimir datos de la persona
		persona1.imprimirDatos();
		
		
		
		//Instancia objeto Coche
		
		Coche coche1 = new Coche("Fiat", "Cronos", 2022);
		
		//Imprimir datos
		coche1.imprimirDatos();
		
		
		//Instanciar objeto
		
		Libro libro1 = new Libro("Cortazar", "100 años de Soledad");
		
		//Mostrar datos del libro
		
		libro1.imprimirDatos();

		
		
		
		//Instanciar objeto cuenta bancaria
		
		CuentaBancaria cuenta1 = new CuentaBancaria("Emi Silvetti", 45000);
		
		//Imprimir datos
		
		cuenta1.mostrarSaldo();
		
	
		
		// Crear un objeto Producto
        Producto producto1 = new Producto("Laptop", 1000.00);

        // Mostrar los detalles del producto
        producto1.mostrarDetalles();

        // Calcular el precio con impuestos (por ejemplo, una tasa del 21%)
        double precioConImpuestos = producto1.calcularPrecioConImpuestos(21);

        // Mostrar el precio con impuestos
        System.out.println("Precio con impuestos: $" + precioConImpuestos);
		
		
		//Crear objeto vehiculo
		Vehiculo vehiculo1 = new Vehiculo(80, 50.0);
		
		//Mostrar estado actual del vehiculo
		
		vehiculo1.mostrarEstado();
		
		//Disminuir Combustible
		
		vehiculo1.disminuirCombustible(10.0);
		
		//Mostrar el estado despues de disminuir el combustible
		
		vehiculo1.mostrarEstado();
		
		// Intentar disminuir más combustible del disponible
        vehiculo1.disminuirCombustible(45.0);
			
		
		// Crear un objeto Calculadora
        Calculadora calculadora = new Calculadora();

        // Sumar dos números usando el método sumar
        int resultado = calculadora.sumar(5, 10);

        // Mostrar el resultado de la suma
        System.out.println("La suma de 5 y 10 es: " + resultado);
		
		
		Persona1 persona1 = new Persona1("Jerry");
		
		
		//Saludar
		
		persona1.saludar();
		
		
		 // Crear un objeto Estudiante con calificaciones para tres materias
        Estudiante estudiante = new Estudiante(8.50, 9.50, 7.25);

        // Calcular el promedio y mostrarlo
        double promedio = estudiante.calcularPromedio();
        System.out.println("El promedio de calificación del estudiante es: " + promedio);
   
		

		// Crear un objeto Calculadora
        Calculadora calculadora = new Calculadora();

        // Sumar dos números usando el método sumar
        int resultado = calculadora.sumar(5, 10);

        // Mostrar el resultado de la suma
        System.out.println("La suma de 5 y 10 es: " + resultado);
		
		
		
		// Crear un objeto de la clase Tienda
        Tienda tienda = new Tienda();
        
        // Definir un precio original
        double precioOriginal = 150.0;
        
        // Calcular el precio final usando el método de la clase Tienda
        double precioConDescuento = tienda.calcularPrecioFinal(precioOriginal);
        
        // Mostrar los resultados
        System.out.println("Precio original: $" + precioOriginal);
        System.out.println("Precio con descuento: $" + precioConDescuento);
        
        
         */
        
     // Crear un objeto de la clase Persona
        Persona persona = new Persona("Juan", 25);

        // Acceder a los atributos usando los métodos getters
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

        // Modificar los atributos usando los métodos setters
        persona.setNombre("Carlos");
        persona.setEdad(30);

        // Imprimir los valores modificados
        System.out.println("Nombre modificado: " + persona.getNombre());
        System.out.println("Edad modificada: " + persona.getEdad());

        // Intentar establecer una edad negativa
        persona.setEdad(-5); // Esto mostrará un mensaje de error
        
        
        
    }
		
		
		
	}


