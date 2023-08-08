package main;

public class Calculadora {
	

	//Enteros
	public int suma(int valor1, int valor2) {
		return valor1 + valor2;
	}
	
	public int suma(int valor1, int valor2, int valor3) {
		return valor1 + valor2 + valor3;
	}
	
	    //multiples parámetros
	public int suma(int... numeros) { // n -> int Arreglo
		int suma = 0;
		for(int numero : numeros)
			suma += numero;
		
		return suma;
	}
	
	//FLotantes
	public float suma(float valor1, float valor2) {
		return valor1 + valor2;
	}
	
	public float suma(float... numeros) { // n -> int Arreglo
		float suma = 0;
		for(float numero : numeros)
			suma += numero;
		
		return suma;
	}
		
	//Doubles
	public double suma(double valor1, double valor2) {
		return valor1 + valor2;
	}	
	
	public double suma(double... numeros) { // n -> int Arreglo
		double suma = 0;
		for(double numero : numeros)
			suma += numero;
		
		return suma;
	}
}
