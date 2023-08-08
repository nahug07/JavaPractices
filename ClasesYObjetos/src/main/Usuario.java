package main;

public class Usuario {
	
	public String username;
	private String password;
	
	// Constructor
	// se ejecuta cuando un objeto es creado
	public Usuario(String username, String password){
		this.username = username;
		this.password = password; 
		System.out.println("Creación de un nuevo objeto de tipo Usuario!");
	}
	
	// Sobrecarga de constructores
    public Usuario(){
		this.username = "";
		this.password = ""; 
	}
    
    public Usuario(String username){
		this.username = username;	
		this.password = ""; 
	}

	
	void saluda() {
		System.out.println("Hola, mi username es " + this.username);
	}
	
	// Getter --> es aquel que retorna el valor de un atributo
	public String getPassword() {
		return this.password;
	}
	
	// Setter --> establece el valor a un atributo
	public void setPassword(String password) {
		this.password = password;
	}
	
	// Clases anidadas
	
	public void establecerRol() {
		Administrador admin = new Administrador();
		admin.trabajar();
	}
	
	public class Administrador  {
		
		public void trabajar() {
			System.out.println("El administrador " + username +  " se encuentra trabajando!");
		}
	}

	
}
