package main;

public abstract class Figura {

	//clases abstractas --> posee por lo menos un método abstracto (aquel que no posee un cuerpo, define que hacer pero no como) 
	
	private int numeroLados;
	
	public Figura() {
		this.numeroLados = 0;
	}
	
	public abstract float area(); // método abstracto
}
