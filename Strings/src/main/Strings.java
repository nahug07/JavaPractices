package main;

public class Strings {

	public static void main(String[] args) {
		// Strings = NO es un tipo primitivo, es una Clase
		
		String mensaje = "Hola, soy un String";
		
		// Otra forma de declarar una variable tipo string
		String mensaje2 = new String("El mensaje");
		
		System.out.println(mensaje);
		
		//Métodos de los string
		
		int cantidad = mensaje.length(); // numero entero con la cantidad de caracteres que contiene el string
		System.out.println(cantidad);
		
		boolean contiene = mensaje.contains("Hola"); //Nos retorna un valor booleano si el substring se encuentra en el string
		System.out.println(contiene);
		
		boolean comienzaCon = mensaje.startsWith("Hola"); //Nos retorna un valor booleano si el string comienza con el substring
		boolean terminaCon = mensaje.endsWith("Hola"); //Nos retorna un valor booleano si el string termina con el substring
		//boolean terminaCon = mensaje.endsWith("g");
		System.out.println(comienzaCon);
		System.out.println(terminaCon);
		
		String nuevoMensaje = mensaje.concat("!!"); //Retorna un nuevo string con los dos concatenados
		System.out.println(nuevoMensaje);
		
		//Para estandarizar textos
		String mensajeMayuscula = mensaje.toUpperCase(); // Retorna un nuevo string en mayusculas
		String mensajeMinuscula = mensaje.toLowerCase(); // Retorna un nuevo string en minusculas
		System.out.println(mensajeMayuscula);
		System.out.println(mensajeMinuscula);
		
		String mensajeSinEspacios = mensaje.trim(); //remueve los espacios del principio o final de nuestro string
		System.out.println(mensajeSinEspacios);
		
		/*Concatenación de métodos
		String mensajeMayuscula = mensaje.toUpperCase().trim();*/
		
		//Format --> retorna un nuevo string
		String mensaje3 = "";
		String curso = "Java";
		mensaje3 = String.format("Bienvenido al curso de %s", curso);
		System.out.println(mensaje3);
		
		float valor = 10.872040f;
		mensaje3 = String.format("%.4f", valor); //le doy formato a la variable, en este caso cuatro decimales
		System.out.println(mensaje3);
		
		mensaje3 = String.format("El total es de %.2f %s", valor, "pesos"); //el primer % es reeplazado por "valor" y el segundo por "pesos"
		System.out.println(mensaje3);
		
		mensaje3 = String.format("El total de %d es de %.2f %s", 3, valor, "pesos"); //el primer % es reeplazado por "3" y el segundo por "valor" y el tercero por "pesos"
		System.out.println(mensaje3);
		
		/*
		 * %d --> variables tipo enteros
		 * %f --> variables tipo flotante (podemos especificar la cantidad de dígitos)
		 * %s --> variables tipo string
		 * */
		
		//podemos darle el format directamente en la salida con printf
		//System.out.printf("El total de %d es de %.2f %s", 3, valor, "pesos");
		
		//comparación de strings
		String cadena1 = "hola";
		String cadena2 = "Hola";
		
		boolean resultado = cadena1.equals(cadena2); //retorna un boolean comparando si las dos cadenas son idénticas
		System.out.println(resultado);
		
		//para saber si el texto es el mismo sin importar mayusculas y minusculas, estandarizamos
		boolean resultado2 = cadena1.toLowerCase().equals(cadena2.toLowerCase());
		System.out.println(resultado2);
		
		//método que compara strings ignorando minusculas y mayusculas
		boolean resultado3 = cadena1.equalsIgnoreCase(cadena2);
		System.out.println(resultado3);
		
		//concatenación de strings
		
		String nombre = "Lalo";
		String clase = "clase de Java";
		
		String textoConcatenado = "Hola " + nombre + ", bienvenido a la " + clase +  "!";
		System.out.println(textoConcatenado);
		
		//también podríamos utilizar el método concat
	}

}
