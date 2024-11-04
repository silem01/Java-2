//import com.coderhouse.banco.Persona;
//import com.coderhouse.banco.Cuenta;
//import com.coderhouse.banco.CuentaCorriente;
//import com.coderhouse.banco.CajaDeAhorro;




public class Main {

	public static void main(String[] args) {
		
		/*Perro unPerro = new Perro();
		Gato unGato = new Gato();
		
		unPerro.setNombre("Jerry");
		unPerro.setEdad(4);
		unPerro.setMamifero(true);
		unPerro.setRaza("Dogo");
		unPerro.setAlimentacion("Carne");
		
		
		System.out.println(unPerro);
		unPerro.comer();
		unPerro.caminar();
		unPerro.hacerSonido();
		
		
		unGato.setNombre("Carol");
		unGato.setEdad(2);
		unGato.setMamifero(true);
		unGato.setRaza("Siames");
		unGato.setAlimentacion("Carne");
		
		
		System.out.println(unGato);
		unGato.caminar();
		unGato.comer();
		unGato.hacerSonido();
		
		
		
		Persona unaPersona = new Persona();
		 unaPersona.setTitular("Arnold");
		 unaPersona.setDni(42722383);
		 
		 System.out.println(unaPersona);
		
		 Cuenta cuentaCorriente = new CuentaCorriente();
		 cuentaCorriente.setTitular(unaPersona);
		 cuentaCorriente.setNumero(12345);
		 cuentaCorriente.setSaldo(1200.5d);
		 cuentaCorriente.abrirCuenta();
		 
		 System.out.println(cuentaCorriente);
		 
		 Cuenta cajaDeAhorro = new CajaDeAhorro();
		 cuentaCorriente.setTitular(unaPersona);
		 cuentaCorriente.setNumero(12645345);
		 cuentaCorriente.setSaldo(120878770.5d);
		 cuentaCorriente.abrirCuenta();
		 
		 System.out.println(cajaDeAhorro);
		 */
		try {
		
			double resultado = 10 / 1;
			
			System.out.println("El resultado es:  "+ resultado);
		}catch(ArithmeticException e) {
			System.err.println("Error, No se puede dividir por Cero");
		}
		 
		 
	}

}
