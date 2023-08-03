package main;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// Operadores Lógicos
		// and (y), or (o) y not (no)
		
		boolean resultado;
		
		resultado = 5 >= 5 && true && 10 > 9;
		System.out.println(resultado);

		resultado = false || false || true;
		System.out.println(resultado);
		
		resultado = (5 >= (2 * 3) || true) && (true && 10 > 5);
		System.out.println(resultado);
		
		System.out.println(!false);
		
		//----------------------------------------//
		
		// Operador ternario
		// IFTTT
		// ?
		// expresion1 ? expresion2 : expresion3
		
		String mensaje = 10 > 9 ? "Es mayor" : "Es menor";
		System.out.println(mensaje);
	}

}
