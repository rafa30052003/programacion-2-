package model;

public class Usuario {
	private final String dni;
	private String nombre;
	
	
	public Usuario(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
