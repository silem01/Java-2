import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicios_Array {
	
	
public static void main(String[] args) {
	
	
	
	//Suma todos los elementos de un array de enteros y muestra el resultado.
		Scanner sc = new Scanner(System.in);
		
	/*int numeros[] =  {1000000000,100000,10000,100,10};
	
	int suma = 0;
	
	for(int i = 0; i < numeros.length; i++) {
		suma += numeros[i];
	}
		
		System.out.println("La suma de los numeros es: " + suma);
		
		
	
		
	
		 int[] numeros = {5, 12, 74, 20, 3};

	        
	        int mayor = numeros[0];

	        
	        for (int i = 1; i < numeros.length; i++) {
	            if (numeros[i] > mayor) {
	                mayor = numeros[i]; // Actualiza el mayor si se encuentra un número más grande
	            }
	        }

		
		System.out.println("El numero mayor es: " + mayor);
		
			
		
		
		//Encuentra el número menor en un array de enteros.
		
		int numeros [] = {2,2,3,4,5};
		
		
		int menor = numeros[0];
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros [i] < menor) {
				menor = numeros[i];
			}
			
		}
		System.out.println("menor: " + menor );
		
		
		
		//Cuenta cuántos números pares hay en un array.
		
		
		int numeros [] = {1,2};
		
		
		int pares = 0;
		
		
		for(int i = 0; i < numeros.length; i ++) {
			if(numeros[i] % 2 == 0) {
				pares++;
			}
		}
		
		System.out.println("Los numeros pares son: " + pares);

		
		
		
		//Invierte los elementos de un array de enteros.
		
		int numeros [] = {1,2,3,4,5};
		
		System.out.println("Array Original: ");
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] + " ");
		}
		
		System.out.println();
		
		//Invertir elementos del array
		
		
		for(int i = 0; i < numeros.length/2; i++) {
			int temp = numeros[i];
			 numeros[i] = numeros[numeros.length - 1 - i];
	         numeros[numeros.length - 1 - i] = temp;
		}
		
		System.out.println("Array invertido: ");
		 for (int i = 0; i < numeros.length; i++) {
	            System.out.print(numeros[i] + " ");
		 }
		
		
		
		//Crea un array de cadenas y muestra sus elementos.
		
		// Crea un array de cadenas y asigna algunos valores
        String[] nombres = {"Jerry", "Herny", "Arnold", "Tevez", "Armand"};

        // Recorre el array y muestra cada elemento
        System.out.println("Elementos del array:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    
		
		
		//Ordena un array de enteros en orden ascendente.
		
		 
        int[] numeros = {3, 4, 1, 2, 5};

        // Ordena el array en orden ascendente
        Arrays.sort(numeros);

        // Imprime el array ordenado
        System.out.println("Array ordenado en orden ascendente:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

		
		//9-Encuentra si un número está en un array y muestra su índice.
		
		int[] numeros = {74, 2, 12, 1, 3};

        // Número a buscar
        int numeroBuscado = 8;

        // Variable para almacenar el índice del número encontrado
        int indice = -1;

        // Recorre el array para buscar el número
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                indice = i; // Guarda el índice del número encontrado
                break; // Sale del bucle una vez encontrado
            }
        }

        // Verifica si el número fue encontrado
        if (indice != -1) {
            System.out.println("El número " + numeroBuscado + " está en el índice " + indice + ".");
        } else {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el array.");
        }
        
		
		
		
		//Ejercicios de Listas
        
		 // Crea una List de números enteros
        List<Integer> numeros = new ArrayList<>();

        // Añade cinco valores a la List
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        // Muestra los elementos de la List
        System.out.println("Elementos de la List:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        
       
		//Elimina el primer elemento de una List de enteros.
		 List<Integer> numeros = new ArrayList<>();

	        // Añade algunos valores a la List
	        numeros.add(10);
	        numeros.add(20);
	        numeros.add(30);
	        numeros.add(40);
	        numeros.add(50);

	        // Muestra la List original
	        System.out.println("Lista original: " + numeros);

	        // Verifica si la List no está vacía antes de eliminar el primer elemento
	        if (!numeros.isEmpty()) {
	            numeros.remove(0); // Elimina el elemento en la posición 0
	        }

	        // Muestra la List después de eliminar el primer elemento
	        System.out.println("Lista después de eliminar el primer elemento: " + numeros);
        
         
		
		//Suma todos los elementos de una List de enteros.
		
		   // Crea una List de números enteros
        List<Integer> numeros = new ArrayList<>();

        // Añade algunos valores a la List
        numeros.add(1);
        numeros.add(1);
        numeros.add(1);
        numeros.add(1);
        numeros.add(1);

        // Variable para almacenar la suma de los elementos
        int suma = 0;

        // Recorre la List y suma los elementos
        for (int numero : numeros) {
            suma += numero;
        }

        // Muestra el resultado de la suma
        System.out.println("La suma de los elementos es: " + suma);
        
      
		
		//Encuentra el número mayor en una List de enteros.
		
		  List<Integer> numeros = new ArrayList<>();

	        // Añade algunos valores a la List
	        numeros.add(10);
	        numeros.add(20);
	        numeros.add(300);
	        numeros.add(40);
	        numeros.add(50);

	        // Verifica si la List no está vacía
	        if (!numeros.isEmpty()) {
	            // Inicializa el mayor con el primer elemento de la List
	            int mayor = numeros.get(0);

	            // Recorre la List para encontrar el número mayor
	            for (int numero : numeros) {
	                if (numero > mayor) {
	                    mayor = numero;
	                }
	            }

	            // Muestra el número mayor
	            System.out.println("El número mayor en la List es: " + mayor);
	        } else {
	            System.out.println("La List está vacía.");
	        }
        
		
		//Verifica si un valor está presente en una List de enteros.
		
		        // Crea una List de números enteros
		        List<Integer> numeros = new ArrayList<>();

		        // Añade algunos valores a la List
		        numeros.add(10);
		        numeros.add(20);
		        numeros.add(30);
		        numeros.add(40);
		        numeros.add(50);

		        // Valor a buscar en la List
		        int valorBuscado = 45;

		        // Verifica si el valor está presente en la List
		        if (numeros.contains(valorBuscado)) {
		            System.out.println("El valor " + valorBuscado + " está presente en la List.");
		        } else {
		            System.out.println("El valor " + valorBuscado + " no está presente en la List.");
		        }
		    
		 
		
		//
		
		 List<Integer> numeros = new ArrayList<>();

	        // Añade algunos valores a la List
	        numeros.add(10);
	        numeros.add(20);
	        numeros.add(30);
	        numeros.add(40);
	        numeros.add(50);

	        // Convierte la List en un array
	        Integer[] arrayNumeros = numeros.toArray(new Integer[0]);

	        // Muestra los elementos del array
	        System.out.println("Elementos del array:");
	        for (int numero : arrayNumeros) {
	            System.out.println(numero);
	        }

	        
		
		//Crea una List de cadenas y añade nombres de frutas.
		
		
		List<String> frutas = new ArrayList<>();

        // Añade nombres de frutas a la List
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Uva");
        frutas.add("Pera");

        // Muestra los elementos de la List
        System.out.println("Lista de frutas:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        
     
		
		//Recorre una List de cadenas y muestra cada elemento.
		
		// Crea una List de cadenas
        List<String> frutas = new ArrayList<>();

        // Añade algunos nombres de frutas a la List
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Uva");
        frutas.add("Pera");

        // Recorre la List y muestra cada elemento
        System.out.println("Elementos de la lista de frutas:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
         
        //Elimina todos los elementos de una List
        
        
        
        List<String> frutas = new ArrayList<>();

        // Añade algunos nombres de frutas a la List
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Uva");
        frutas.add("Pera");

        // Muestra los elementos de la List antes de eliminar
        System.out.println("Lista de frutas antes de eliminar: " + frutas);

        // Elimina todos los elementos de la List
        frutas.clear();

        // Muestra la List después de eliminar todos los elementos
        System.out.println("Lista de frutas después de eliminar: " + frutas);
      
		
		
		
		//ITERABLE
		
		//Crea una List de números y utiliza Iterable para recorrerla.
		
		List<Integer> numeros = new ArrayList<>();

        // Añade algunos números a la List
        numeros.add(1);
        numeros.add(2);
        numeros.add(3000);
        numeros.add(404444);
        numeros.add(5045);

        // Utiliza Iterable para recorrer la List
        System.out.println("Elementos de la lista de números:");
        Iterator<Integer> iterador = numeros.iterator();
        while (iterador.hasNext()) {
            Integer numero = iterador.next();
            System.out.println(numero);
        }
        
		
		//Utiliza Iterable para recorrer una colección de cadenas y mostrar los elementos. - Pendiente
		//Crea una clase que tenga un método que devuelva un Iterable de enteros. - Pendiente
		
		// Convierte una List en un Iterable y úsala en un ciclo for. - pendiente
		
		 
		//Implementa un Iterable que permita recorrer un array de enteros. - Pendiente
		//Crea un Iterable de números impares y recorre los valores. - Pendiente
		//Usa un Iterable para recorrer una lista de palabras y contar cuántas tienen más de 5 letras. - Pendiente
		//Crea una colección de números y úsala en un Iterable para encontrar cuántos son pares. - Pendiente 
		//Implementa un Iterable para recorrer una matriz bidimensional. - Pendiente
		
		
		
		//Imprime los números del 1 al 10 usando un ciclo for.
		for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
     
		
		//Imprime los números pares del 2 al 20 usando un ciclo for
		
		// Usar un ciclo for para imprimir los números pares del 2 al 20
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
        
      
        //Recorre un array de enteros con un ciclo for y muestra cada valor.
        
        // Crear un array de enteros
        int[] numeros = {10, 20, 30, 40, 50};

        // Usar un ciclo for para recorrer el array y mostrar cada valor
        System.out.println("Elementos del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
         
		
		//Imprime los múltiplos de 5 del 5 al 50 usando un ciclo for.
		
		 System.out.println("Múltiplos de 5 del 5 al 50:");
	        for (int i = 5; i <= 50; i += 5) {
	            System.out.println(i);
	        }
	        
	        //
			 
		
		 // Crear un array de enteros
        int[] numeros = {10, 20, 355, 5, 60, 25};

        // Variable para almacenar el mayor número, inicializada al primer elemento del array
        int mayor = numeros[0];

        // Usar un ciclo for para recorrer el array y encontrar el número mayor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i]; // Actualizar el mayor número
            }
        }

        // Mostrar el número mayor encontrado
        System.out.println("El número mayor en el array es: " + mayor);
    	
		
		//Crea un programa que imprima los primeros 10 números de la secuencia Fibonacci usando for.
		
		int n = 10;

        // Variables para almacenar los dos últimos números de la secuencia
        int num1 = 0, num2 = 1;

        System.out.println("Los primeros " + n + " números de la secuencia Fibonacci son:");

        // Usar un ciclo for para generar los números de Fibonacci
        for (int i = 0; i < n; i++) {
            System.out.print(num1 + " "); // Imprimir el número actual de Fibonacci

            // Calcular el siguiente número de Fibonacci
            int siguienteNum = num1 + num2;

            // Actualizar los números para la próxima iteración
            num1 = num2;
            num2 = siguienteNum;
        }
        
        //Multiplica todos los elementos de un array de enteros por 2 usando un ciclo for.
        
        // Crear un array de enteros
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Array original:");

        // Imprimir el array original
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        // Multiplicar cada elemento del array por 2
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= 2; // Multiplica el elemento por 2
        }

        System.out.println("\nArray después de multiplicar por 2:");

        // Imprimir el array modificado
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
		
        
		
		//Imprime las letras de una cadena de texto usando un ciclo for.
		
		// Definir una cadena de texto
        String texto = "Hola, mundo!";

        System.out.println("Las letras de la cadena son:");

        // Usar un ciclo for para recorrer la cadena
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i); // Obtener el carácter en la posición i
            System.out.print(letra + " "); // Imprimir la letra
        }
        
        
      
		
		
		//
		
		// Imprimir la tabla de multiplicar del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j; // Multiplicar i por j
                System.out.println(i + " x " + j + " = " + resultado); // Mostrar el resultado
            }
            System.out.println(); // Línea en blanco para separar las tablas
        }
        
       
		
		//ForEach
		
		  // Definir un array de enteros
        int[] numeros = {10, 20, 30, 40, 50};

        // Usar foreach para recorrer el array
        System.out.println("Elementos del array:");
        for (int numero : numeros) {
            System.out.println(numero); // Mostrar cada valor
        }
        
       
		
		//

	        // Crear una List de cadenas
	        List<String> frutas = new ArrayList<>();
	        frutas.add("Manzana");
	        frutas.add("Naranja");
	        frutas.add("Plátano");
	        frutas.add("Fresa");
	        frutas.add("Kiwi");

	        // Usar foreach para recorrer la List y mostrar cada elemento
	        System.out.println("Elementos de la lista de frutas:");
	        for (String fruta : frutas) {
	            System.out.println(fruta); // Mostrar cada fruta
	        }
          
		
		//Crea un array de enteros y suma sus elementos usando un ciclo foreach.
		
		 // Crear un array de enteros
        int[] numeros = {5, 10, 150, 20, 25};

        // Variable para almacenar la suma
        int suma = 0;

        // Usar foreach para recorrer el array y sumar los elementos
        for (int numero : numeros) {
            suma += numero; // Sumar el elemento actual a la suma total
        }

        // Mostrar el resultado
        System.out.println("La suma de los elementos del array es: " + suma);
    
		
		//Recorre una lista de enteros y elimina los menores de 10 usando foreach.
		
		
		   // Crear una lista de enteros
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(5);
        numeros.add(8);
        numeros.add(20);
        numeros.add(2);
        numeros.add(12);

        // Usar un iterador para eliminar los elementos menores de 10
        Iterator<Integer> iterador = numeros.iterator();
        while (iterador.hasNext()) {
            int numero = iterador.next();
            if (numero < 10) {
                iterador.remove(); // Eliminar el número si es menor que 10
            }
        }

        // Mostrar la lista resultante
        System.out.println("Lista después de eliminar los menores de 10: " + numeros);
    

		//Recorre una lista de cadenas y concatena todas las palabras usando foreach.
		
        
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add("mundo");
        palabras.add("esto");
        palabras.add("es");
        palabras.add("Java");

        // Variable para almacenar la concatenación
        StringBuilder resultado = new StringBuilder();

        // Usar foreach para recorrer la lista y concatenar las palabras
        for (String palabra : palabras) {
            resultado.append(palabra).append(" "); // Concatenar la palabra y un espacio
        }

        // Mostrar el resultado
        System.out.println("Cadena concatenada: " + resultado.toString().trim());
        
        
        
		
		//Imprime los números del 1 al 10 usando un ciclo while.
		
		   int numero = 1; // Inicializamos el contador en 1

	        // Usar un ciclo while para imprimir los números del 1 al 10
	        while (numero <= 10) {
	            System.out.println(numero); // Imprimir el número actual
	            numero++; // Incrementar el contador
	        }
        
        
       
		//Encuentra el número mayor en un array usando while.
		
		int[] numeros = {34, 12, 67, 23, 89, 450}; // Array de enteros
        int mayor = numeros[0]; // Suponemos que el primer elemento es el mayor
        int i = 1; // Inicializamos el contador en 1

        // Usar un ciclo while para encontrar el número mayor
        while (i < numeros.length) {
            if (numeros[i] > mayor) {
                mayor = numeros[i]; // Actualizamos el mayor si encontramos un número más grande
            }
            i++; // Incrementar el contador
        }

        // Mostrar el resultado
        System.out.println("El número mayor en el array es: " + mayor);
    
        
         
		
		//Recorre una lista de enteros usando while y muestra cada elemento.
		
		  // Crear una lista de enteros
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        // Inicializar el índice para el ciclo while
        int i = 0;

        // Usar un ciclo while para recorrer la lista
        while (i < numeros.size()) {
            System.out.println("Elemento en el índice " + i + ": " + numeros.get(i));
            i++; // Incrementar el índice
        }
        
        
        
		
        //Recorre un array de enteros y encuentra el menor valor usando while.
        
		 int[] numeros = {34, 12, 67, 3, 89, 45}; // Array de enteros
	        int menor = numeros[0]; // Suponemos que el primer elemento es el menor
	        int i = 1; // Inicializamos el contador en 1

	        // Usar un ciclo while para encontrar el número menor
	        while (i < numeros.length) {
	            if (numeros[i] < menor) {
	                menor = numeros[i]; // Actualizamos el menor si encontramos un número más pequeño
	            }
	            i++; // Incrementar el contador
	        }

	        // Mostrar el resultado
	        System.out.println("El número menor en el array es: " + menor);
	    
      
		int numero1 = 7;
		boolean esPositivoYPar = (numero1 > 0) && (numero1 % 2 == 0);
		System.out.println("El número es positivo y par: " + esPositivoYPar);
        
          */
		//Determina si un número no es par usando !.
		
		int numero4 = 4;
		boolean noEsPar = !(numero4 % 2 == 0);
		System.out.println("El número no es par: " + noEsPar);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}

}