package model;

public class Persona {
	protected String nombre;
	protected int edad;
	protected String dni;
	
	public Persona(String nombre, int edad, String dni) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	@Override
	public String toString() {
		return "\n Nombre:" + nombre + "\n Edad:" + edad + "\n dni:" + dni + "]";
	}
	
	
	
}
