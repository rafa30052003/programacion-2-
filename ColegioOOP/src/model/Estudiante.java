package model;

import java.util.Objects;

public class Estudiante {

	private String dni;
	private String nombre;
	private String email;
	private String tlf;

	public Estudiante(String dni, String nombre, String email, String tlf) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
		this.tlf = tlf;
	}

	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "Estudiante [dni=" + dni + ", nombre=" + nombre + ", email=" + email + ", tlf=" + tlf + "]";
	}
	
	
	

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if(obj==this) {  //Comparo las zonas de memoria para comprobrar si son el mismo.
			result = true;
		}else {
			if(obj!=null && obj.getClass()==this.getClass()) { // Compruebo que el objeto no sea nulo && compruebo que el objeto sea de la misma clase
				Estudiante e =(Estudiante) obj;
				if(this.dni.equals(e.getDni())) { // compruebo que el dni sea el mismo.
					result = true;
				}
			}
			
		}
		
		
		return result;
		
	}
	
	
}
