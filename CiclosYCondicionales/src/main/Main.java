package main;

public class Main {

	public static void main(String[] args) {
		// Condiciones
		
		String colorLuz = "verde";
		
		if (colorLuz.equals("verde")) {
			System.out.println("Puede continuar");
		} else if (colorLuz.equals("amarillo")){
			System.out.println("Alto parcial");
		} else if (colorLuz.equals("rojo")) {
			System.out.println("Alto total");
		} else {
			System.out.println("Color no válido");
		}
		//--------------------------------------------------------------------//
		
		//Condiciones anidadas
		
		int promedio = 9;
		
		if (promedio >= 7) {
			if (promedio == 10) {
				System.out.println("Muchas felicidades!!");
			} else {
				System.out.println("Felicidades!");
			}
		} else {
			System.out.println("Hay que repasar!");
		}
		//--------------------------------------------------------------------//
		
		// Scope (alcance que posee una variable)
		
		// Switch (mejor alternativa a grandes condiciones de else if)
		
		String luz = "rojo";
		
		switch(luz) {
		case("verde") :
			System.out.println("Puede continuar");
			break; // palabra reservada que termina un flujo (en este caso, el switch)
			
		case("amarillo") : 
			System.out.println("Alto parcial");
			break;
			
		case("rojo") : 
			System.out.println("Alto total");
			break;
			
		default: 
			System.out.println("Color no válido");
			//no es necesario el break porque es el último bloque 
		}
			
		//Otro ejemplo	
		char calificacion = 'B';	
			
		switch(calificacion) {
		case 'A' : 
			System.out.println("Excelente");
			break;
			
		case 'B' :
		case 'C' :	
			System.out.println("Bien");  //Dos casos pueden compartir la salida
			break;
			
		case 'D' : 
			System.out.println("Puedes mejorar");
			break;	
			
		default: 
			System.out.println("Calificación no válida");
		}
		//--------------------------------------------------------------------//
		
		// While --> repetimos el bloque siempre que la condición se cumpla
		
		int contador = 0;
		int unNumero = 654683;
		
		while(unNumero > 0) {
			unNumero /= 10;
			contador++;
		}
		
		System.out.println("El número posee " + contador + " dígitos");
		//--------------------------------------------------------------------//
		
		// Do while --> debe ejecutarse por lo menos una vez, primero se ejecuta el bloque y luego se evalua la condición
		
		int contador2 = 10;
		
		do {
			System.out.println(contador2);	
			contador2++;
		} while (contador2 < 10);
		//--------------------------------------------------------------------//
		
		// Ciclo For
			
		// for (inicialización; condición; iteración) {}
		
		for(int numero = 9, x = 1; x < 11; x++) {
			
			int resultado = numero * x;
			String mensaje = numero + " * " + x + " = " + resultado;
			
			System.out.println(mensaje);
		}
		
		//Otro ejemplo --> numeros pares del 1 al 21
		
		for(int numero = 1; numero < 21; numero++) {
			if(numero % 2 == 0) {
				System.out.println(numero);
			}
		}
		//--------------------------------------------------------------------//
		
		// Break and Continue
		
		// Break --> nos permite detener una secuencia de instrucciones o terminar un ciclo
		// Continue --> nos permite saltar a la siguiente iteración
		
		for(int numero = 1; numero < 21; numero++) {
			if(numero % 2 == 0) {
				if(numero == 6) {
					continue;
				}
				if(numero > 12) {
					break;
				}
				System.out.println(numero);
			}
		}
		//--------------------------------------------------------------------//
		
		// Única Sentencia
		// podemos omitir el uso de llaves siempre y cuando la condición o el ciclo, ejecute una sola línea de código
		
	}

}
