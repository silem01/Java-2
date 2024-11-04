import java.util.Random;
import java.util.Scanner;

public class Clase01_Ejercicios {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	  // Utilizar operadores lógicos para verificar si un número está entre 1 y 10
    
    /*int num1 = 5;
    if (num1 >= 1 && num1 <= 10) {
        System.out.println(num1 + " está entre 1 y 10.");
    } else {
        System.out.println(num1 + " no está entre 1 y 10.");
    }
	*/
		
		/*Ejercicios de Integración
		
		2-Crear un programa que determine si un número es primo utilizando operadores relacionales y bucles.
		3-Desarrollar un pequeño sistema de gestión de notas que almacene las notas de varios estudiantes y calcule su promedio.
		4-Crear una calculadora simple que permita sumar, restar, multiplicar y dividir dos números.
		5-Implementar un programa que reciba un String y cuente la cantidad de vocales que tiene.
		*/
		
	
		//1-Escribir un programa que calcule el área de un círculo usando una constante para PI.
		
		       // final double PI = 3.14159;  // Constante para PI
		      

		  
		        //double radio = 2;

		       // double area = PI * Math.pow(radio, 2);
		       // System.out.println("El área del círculo es: " + area);
		        
		        
		        
		     /*   int numero = 47;
		        boolean esPrimo = true;

		        if (numero <= 1) {
		            esPrimo = false;  // Los números menores o iguales a 1 no son primos
		        } else {
		            for (int i = 2; i <= Math.sqrt(numero); i++) {
		                if (numero % i == 0) {
		                    esPrimo = false;
		                    break;
		                }
		            }
		        }

		        if (esPrimo) {
		            System.out.println(numero + " es un número primo.");
		        } else {
		            System.out.println(numero + " no es un número primo.");
		        }

		    */
		
		//Desarrollar un pequeño sistema de gestión de notas que almacene las notas de varios 
		//estudiantes y calcule su promedio.
		
		
		/*double[] notas = new double[10];
        double suma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa la nota del estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            suma += notas[i];
        }

        double promedio = suma / cantidadEstudiantes;
        System.out.println("El promedio de las notas es: " + promedio);

        sc.close();
		
		
		
		//Crear una calculadora simple que permita sumar, restar, multiplicar y dividir dos números.
		
		
		
        double num1 = 10;
        double num2 = 5;

        System.out.println("Selecciona la operación: (+, -, *, /)");
        char operacion = '*';
        double resultado;

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: División por cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }
	
		
		//2. Determinar si una persona puede votar (mayor de 18 años) o no:
		
		//Ejercicos Clase 2 
				//1. Verificar si un número es par o impar y mostrar un mensaje correspondiente:
				
				
				
				
				 System.out.print("Ingrese la edad de la persona: ");
				 
				 int edad = sc.nextInt();
				 
				 if(edad <= 18) {
					 System.out.println("Es menor de edad, tiene " + edad + " años");
				 }else {
					 System.out.println("Es mayor de edad, tiene " + edad + " años");
				 }
				
				 
				 sc.close();
				 
				
				 
				 //Determina si un año es bisiesto. (Pista: un año es bisiesto si es divisible por 4 y no por 100, excepto si es divisible por 400).
				 
				  System.out.print("Ingresa un año: ");
			        int año = sc.nextInt();

			        // Verifica si el año es bisiesto
			        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
			            System.out.println("El año " + año + " es bisiesto.");
			        } else {
			            System.out.println("El año " + año + " no es bisiesto.");
			        }

			        sc.close();
				
		
		
		  System.out.print("Ingresa la edad de la persona: ");
	        int edad = sc.nextInt();

	       
	        if (edad < 2) {
	            System.out.println("La persona es un bebé.");
	        } else if (edad >= 2 && edad <= 12) {
	            System.out.println("La persona es un niño.");
	        } else if (edad >= 13 && edad <= 18) {
	            System.out.println("La persona es un adolescente.");
	        } else if (edad >= 19 && edad <= 74) {
	            System.out.println("La persona es un adulto.");
	        } else if (edad >= 75) {
	            System.out.println("La persona es un anciano.");
	        } else {
	            System.out.println("Edad no válida.");
	        }

	        sc.close();
		 
		
		//Verifica si un número es par o impar usando un operador ternario.
		
	

        System.out.print("Ingresa un número entero: ");
        int numero = sc.nextInt();

        // Verifica si el número es par o impar usando el operador ternario
        String resultado = (numero % 2 == 0) ? "El número es par." : "El número es impar.";

        // Muestra el resultado
        System.out.println(resultado);

        sc.close();
		
	
		
		
		

        System.out.print("Ingresa el primer número: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = sc.nextInt();

        // Calcula el mayor de los dos números usando el operador ternario
        int mayor = (numero1 > numero2) ? numero1 : numero2;

        // Muestra el resultado
        System.out.println("El mayor de los dos números es: " + mayor);

        sc.close();
		
			
		
		
		// Genera un número aleatorio entre 1 y 10
		let numeroAleatorio = Math.floor(Math.random() * 10) + 1;

		// Verifica si el número es mayor que 5
		if (numeroAleatorio > 5) {
		    console.log(`El número ${numeroAleatorio} es mayor que 5.`);
		} else {
		    console.log(`El número ${numeroAleatorio} no es mayor que 5.`);
		}

		
		
		
		  Random random = new Random();

	        // Genera un número aleatorio entre 1 y 10
	        int numeroAleatorio = random.nextInt(10) + 1;

	        // Verifica si el número es mayor que 5
	        if (numeroAleatorio > 5) {
	            System.out.println("El número " + numeroAleatorio + " es mayor que 5.");
	        } else {
	            System.out.println("El número " + numeroAleatorio + " no es mayor que 5.");
	        }
		
		
		
		 // Simula el lanzamiento de un dado (número aleatorio entre 1 y 6)
        int resultadoDado = (int)(Math.random() * 6) + 1;

        // Muestra el resultado del lanzamiento
        System.out.println("El resultado del lanzamiento del dado es: " + resultadoDado);
		
       
		
		//Simula una moneda (cara o cruz) usando Math.random()
		
		
		
		// Simula el lanzamiento de una moneda
        double resultadoMoneda = Math.random(); // Genera un número aleatorio entre 0.0 y 1.0

        // Determina si el resultado es cara o cruz
        String caraOcruz;
        if (resultadoMoneda < 0.5) {
            caraOcruz = "Cara"; // Si el número es menor que 0.5, es cara
        } else {
            caraOcruz = "Cruz"; // Si el número es 0.5 o mayor, es cruz
        }

        // Muestra el resultado del lanzamiento
        System.out.println("El resultado del lanzamiento de la moneda es: " + caraOcruz);
		
		
		
		
		
		
		 // Crea una instancia de la clase Random
        Random random = new Random();

        // Genera un número aleatorio entre 1 y 3
        int estadoSemaforo = random.nextInt(3) + 1; // 1: Verde, 2: Amarillo, 3: Rojo

        // Determina el estado del semáforo según el número aleatorio
        String estado;
        if (estadoSemaforo == 1) {
            estado = "Verde"; // Si el número es 1, el semáforo está en verde
        } else if (estadoSemaforo == 2) {
            estado = "Amarillo"; // Si el número es 2, el semáforo está en amarillo
        } else {
            estado = "Rojo"; // Si el número es 3, el semáforo está en rojo
        }

        // Muestra el estado del semáforo
        System.out.println("El semáforo está en: " + estado);
		
		
		 System.out.print("Ingresa el tipo de cliente (1: Normal, 2: Miembro, 3: VIP): ");
	        int tipoCliente = sc.nextInt();

	        System.out.print("Ingresa el precio del producto: ");
	        double precio = sc.nextDouble();

	        double descuento = 0;

	        // Determina el descuento según el tipo de cliente
	        if (tipoCliente == 1) {
	            descuento = 0; // Sin descuento
	        } else if (tipoCliente == 2) {
	            descuento = 0.10 * precio; // 10% de descuento
	        } else if (tipoCliente == 3) {
	            descuento = 0.20 * precio; // 20% de descuento
	        } else {
	            System.out.println("Tipo de cliente no válido.");
	            sc.close();
	            return; // Termina el programa si el tipo de cliente es inválido
	        }

	        // Calcula el precio final después del descuento
	        double precioFinal = precio - descuento;

	        // Muestra el resultado
	        System.out.println("El descuento aplicado es: " + descuento);
	        System.out.println("El precio final es: " + precioFinal);

	        sc.close();
	
		//Crea un programa que asigne una beca: si la nota es >= 85 y la edad < 25, el estudiante recibe una beca.
		
		System.out.print("Ingresa la nota del estudiante: ");
        double nota = sc.nextDouble();

        System.out.print("Ingresa la edad del estudiante: ");
        int edad = sc.nextInt();

        // Verifica si el estudiante recibe una beca
        if (nota >= 85 && edad < 25) {
            System.out.println("El estudiante recibe una beca.");
        } else {
            System.out.println("El estudiante no recibe una beca.");
        }

        sc.close();
		
			
		
		
		//Crea un array de enteros de tamaño 5 y asigna valores a cada elemento.
		
		int[] numeros = new int[5];
		
		//Asignar valores a los elementos del array
		
		numeros [0] = 10;
		numeros [1] = 5;
		numeros [2] = 5;
		numeros [3] = 12;
		numeros [4] = 22;
		 */ 
	//Ejercicios clase 4 - Clases/Objetos
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
		
		
}

			
			
				
		
		
		
		