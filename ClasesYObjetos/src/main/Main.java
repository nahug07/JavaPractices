package main;

public class Main {

	public static void main(String[] args) {
		// Clases y Objetos
		
		Perro lassie = new Perro(); //instancia (objeto creado)
		
		lassie.nombre = "Lassie";
		lassie.raza = "Collie";
		lassie.edad= 8;
		
		System.out.println("El nombre es: " + lassie.nombre);
		System.out.println("La raza es: " + lassie.raza);
		System.out.println("La edad es: " + lassie.edad);
		
		// Métodos
		
		lassie.comer();
		lassie.dormir();
		lassie.ladrar();
		
		lassie.establecerAtributos("Bobby", "Doberman" , 4);
		
		System.out.println("El nombre es: " + lassie.nombre);
		System.out.println("La raza es: " + lassie.raza);
		System.out.println("La edad es: " + lassie.edad);
		
		
		Triangulo triangulo = new Triangulo();
		triangulo.base = 10;
		triangulo.altura = 20;
		
		float resultado = triangulo.area();
		System.out.println("El área del triángulo es de: " + resultado);
		
		// Modificadores de acceso (encapsulamiento)
		
		// modificadores de acceso son 4 --> Default, Public, Private, Protected
		
		Usuario lalo = new Usuario("Lalo", "contraseña22");
		//lalo.username = "Lalo";
		//lalo.password = "Mir";
		
		System.out.println(lalo.getPassword());
		
		System.out.println(lalo.username);
		//System.out.println(lalo.password);
		
		lalo.saluda();
		
		lalo.setPassword("asdf1234");
		System.out.println(lalo.getPassword());
		
		// Sobrecarga de métodos
		
		Calculadora calculadora = new Calculadora();
		
		int resultado2 = calculadora.suma(10, 20);
		System.out.println("El resultado es: " + resultado2);
		
		// Sobrecarga de constructores
		
		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario("Usuario2");
		Usuario usuario3 = new Usuario("Usuario3", "Contra3");
		
		usuario1.saluda();
		usuario2.saluda();
		usuario3.saluda();
		
		System.out.println(usuario3.getPassword());
		
		// Static
		
		System.out.println(Circulo.area(123f));
		
		// Clases anidadas
		
		usuario2.establecerRol();
		
		// Herencia (nos permite crear nuevas clases a partir de clases ya existentes)
		
		Gato gato = new Gato("gato", "raza", 2);
		Conejo conejo = new Conejo("conejo", "raza", 4);
		
		gato.dormir();
		conejo.dormir();
		
		
	}
	

}
