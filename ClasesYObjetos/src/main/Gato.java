package main;

public class Gato extends Mascota {

	public Gato (String nombre, String raza, int edad) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}
	
	@Override
	public void dormir() {
		super.dormir(); // super --> hace referencia a la clase padre. Para seguir entrando al método padre
		System.out.println("El gato duerme");
	}
	
}
