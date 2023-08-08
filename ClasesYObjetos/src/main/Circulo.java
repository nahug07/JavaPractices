package main;

public class Circulo {
   
	// static
	public static final float pi = 3.1415926535f; //le pertenece a la clase
	public float radio = 0f; // atributo de instancia, le pertenece al objeto
	
	public Circulo(float radio) {
		this.radio = radio;
	}
	
	public static float area(float radio) {
		return Circulo.pi * (radio * radio);
	}
}
