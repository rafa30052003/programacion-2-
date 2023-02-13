package model;

public class Persona {
	//atributos
	private String nombre;
	private String apellidos;
	private int edad;
	//constructores
	public Persona() {
	nombre = "";
	apellidos = "";
	edad = 0;
	}
	public Persona (String nombre, String apellidos, int edad) {
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.edad = edad;
	}
	//métodos
	public String getNombre() {
	return nombre;
	}
	public String getApellidos () {
	return apellidos;
	}
	public int getEdad() {
	return edad;
	}
	
	
}
