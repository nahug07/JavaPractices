package main;

public class Mascota {
	//Herencia

	public String nombre;
	public String raza;
	public int edad;
	
	public void dormir() {
		System.out.println("La mascota duerme");
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setNombre(int edad) {
		this.edad = edad;
	}
	
	//sobre escritura del constructor
	
	/*
	 * public Mascota(String nombre, String raza, int edad){
	 * this.nombre = nombre;
	 * this.raza = raza;
	 * this.edad = edad;
	 * }
	 * */
	
}
