package main;

public interface InterfaceB {
	
	public abstract void mostrarMensaje();
	
	// método default 
	
	public default void saluda() {
		System.out.println("Hola mundo desde una interface!");
	}
	
}
