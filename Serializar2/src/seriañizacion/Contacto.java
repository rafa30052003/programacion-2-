package seriañizacion;

import java.io.Serializable;

public class Contacto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String nombre;
	private String email;
	private  String tlf;
	private Integer edad;
	
	
	public Contacto(String nombre, String email, String tlf, Integer edad) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.tlf = tlf;
		this.edad = edad;
	}
	
	
	
	public Contacto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTlf() {
		return tlf;
	}
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", email=" + email + ", tlf=" + tlf + ", edad=" + edad + "]";
	}
	
	
	
	
}
