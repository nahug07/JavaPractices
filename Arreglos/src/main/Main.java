package main;

public class Main {

	public static void main(String[] args) {
		// Arreglos
		
		String nombres[];
		nombres = new String[3];
		
		//otra forma de definir
		String alumnos[] = new String[4];
		
		//otra forma de definir
		String plantas[] = {"Aloe Vera", "Romero", "Peperina"};
		
		
		nombres[0] = "Lalo";
		
		System.out.println(nombres[0]);
		System.out.println(alumnos[1]);
		System.out.println(plantas[0]);
		
		//Recorrer arreglos
		
		int calificaciones[] = {9, 8, 7, 10, 10, 6, 8, 5, 9};
		//promedio de calificaciones
		int suma = 0;
		for(int indice = 0; indice < calificaciones.length; indice++) {
			suma += calificaciones[indice];
		}
		
		float promedio = suma / calificaciones.length;
		System.out.println("El promedio es de " + promedio);
		
		//si no conocemos en que índice se encuentra un caracter, haremos uso de los métodos indexOf
		String mensaje = "Hola Mundo";
		int indice2 = mensaje.indexOf("M");

		System.out.println(indice2);  
		
		//-------------------------------------------------------------//
		
		// For each
		
		for(int valorPorIndice : calificaciones) {
			suma += valorPorIndice;
		}
		System.out.println("El promedio es de " + promedio);
		
		//-------------------------------------------------------------//
		
		//Insertar registros
		
		int digitos[] = new int[10];
		
		//con for
		for(int i=0; i < digitos.length; i++) {
			digitos[i] = i;
		}
		
		//con for each
		for(int digito : digitos) {
			System.out.println(digito);
		}
		
		//-------------------------------------------------------------//
				
		// Matrices
		
		int matriz[][] = new int[4][3]; //un corchete por cada dimension, en este caso es de dos
		
		matriz[0][0] = 1; //en los indices seteamos el lugar de la matriz
		matriz[0][1] = 2;
		matriz[0][2] = 7;
		
		matriz[1][0] = 2;
		matriz[1][1] = 5;
		matriz[1][2] = 2;
		
		matriz[2][0] = 1;
		matriz[2][1] = 5;
		matriz[2][2] = 8;
		
		matriz[3][0] = 1;
		matriz[3][1] = 9;
		matriz[3][2] = 2;
		
		System.out.println(matriz[2][2]);
		
		// Recorrer matrices
		
		//con for
		for(int posX = 0; posX < matriz.length; posX++) {
			for(int posY = 0; posY < matriz[posX].length; posY++) {
				System.out.println(matriz[posX][posY]);
			}
		}
		
		//con for each
		for(int[] fila : matriz) {
			for(int celda : fila) {
				System.out.println(celda);
			}
		}
		
		//-------------------------------------------------------------//
		
		// Arreglos dinámicos
		
		int notas[][] = new int[5][];
		
		notas[0] = new int[1];
		notas[1] = new int[2];
		notas[2] = new int[3];
		notas[3] = new int[4];
		notas[4] = new int[5];
		
		notas[0][0] = 8;
		
		notas[1][0] = 7;
		notas[1][1] = 5;
		
		notas[2][0] = 8;
		notas[2][1] = 5;
		notas[2][2] = 4;
		
		notas[3][0] = 4;
		notas[3][1] = 7;
		notas[3][2] = 3;
		notas[3][3] = 10;
		
		notas[4][0] = 2;
		notas[4][1] = 9;
		notas[4][2] = 10;
		notas[4][3] = 8;
		notas[4][4] = 6;
			
		for(int[] notasPorAlumno : notas) {
			for(int nota : notasPorAlumno) {
				System.out.print(nota + " ");
			}
			System.out.println("");
		}

	}

}
