package model.domain;

import java.util.ArrayList;
import java.util.List;

public class Autor {
	private String dni;
	private String nombre;
	private String apellidos;
	private List<Libro> libros;
	public Autor(String dni, String nombre, String apellidos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		libros = new ArrayList<Libro>();
	}
	public Autor() {
		super();
		this.dni = "";
		this.nombre = "";
		this.apellidos = "";
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public List<Libro> getLibros() {
		return libros;
	}
	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	@Override
	public String toString() {
		return "autor [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	
	
	
}
