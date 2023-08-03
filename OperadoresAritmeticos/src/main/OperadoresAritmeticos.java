package main;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// Operadores aritmeticos
		
		int variableX = 50, variableY = 10;
		int resultado;
		
		resultado = variableX + variableY;
		System.out.println(resultado);
		
		resultado = variableX - variableY;
		System.out.println(resultado);
		
		resultado = variableX * variableY;
		System.out.println(resultado);
		
		resultado = variableX / variableY;
		System.out.println(resultado);
		
		variableX++; //incrementa en uno
		System.out.println(variableX);
		
		variableX--; //decrece en uno
		System.out.println(variableX);
		
		variableX += 100; //incrementa el valor de variableX en 100 (variableX = variableX + 100)
		System.out.println(variableX);
		
		variableX -= 100; // el valor de variableX en 100 (variableX = variableX - 100)
		System.out.println(variableX);
		
		variableX *= 100; // le asigna a variableX el valor de variableX por 3 (variableX = variableX * 3)
		System.out.println(variableX);
		
		variableX /= 100; // le asigna a variableX el valor de variableX entre 3 (variableX = variableX / 3)
		System.out.println(variableX);
		
		//Cast
		int variableA = 50;
		float variableB = 5.5f;
		
		int resultado2 = variableA + (int)variableB; //convertimos el valor flotante en un entero eliminando el punto decimal
		System.out.println(resultado2);
		
		float resultado3 = (float)variableA + variableB; //convertimos el valor entero en un foltante 
		System.out.println(resultado3);
		

	}

}
