package main;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// Entrada de datos
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuál es tu nombre!?");
		
		String nombre = sc.nextLine(); //este método nos retornará lo que el usuario escribió en consola
		
		System.out.println("Cuál es tu edad!?");
		
		//int edad = Integer.parceInt(sc.nextLine()); clase Ingeger posee el método parceInt para pasar un string a entero
		int edad = sc.nextInt(); // de esta manera pasamos el string a entero
		
		System.out.println("Cuál es tu altura!?");
		
		float altura = sc.nextFloat();
		
		sc.nextLine(); //captura el salto de nextFloat
		
		System.out.println("Estas aprendiendo Java!? (si/no)");
		//boolean valor = sc.hasNextBoolean();
		boolean valor = sc.nextLine().equals("si"); // de esta manera controlamos el booleano
		
		System.out.println("Hola " + nombre + ", tienes " + edad + " años y mides "+ altura + " de altura");
		System.out.println(valor);
		
	    sc.close();	//De esta manera dejo de monitorear la consola

	}

}
