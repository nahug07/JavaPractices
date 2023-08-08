package main;

public class Cuadrado extends Figura{
	
	private float lado;

	
	@Override
	public float area() {
		return lado * 2;
	}
}
