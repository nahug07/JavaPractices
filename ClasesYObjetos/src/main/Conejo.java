package main;

public class Conejo extends Mascota {

	public Conejo(String nombre, String raza, int edad) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}
	
	// polimorfismo
	
	//al sobreesscribir un método es buena práctica dejar un @Override por encima del método
	
	@Override
	public void dormir() {
		System.out.println("El conejo duerme");
	}
	
	
	//sobre escritura del constructor
	
	/*
	 * public perro (String nombre, String raza, int edad){
	 * super(nombre, raza, edad)
	 * }
	 * */
}
