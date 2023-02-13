package model.dataObect;

import java.util.Objects;

public class Usuario {
	
	private String dni;
	private String nombre;
	private String tlf;
	
	
	/*
	 * CONSTRUCTORES
	 */
	
		
	
	public Usuario(String dni, String nombre, String tlf) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.tlf = tlf;
	}



	public Usuario() {
		super();
		this.dni = " ";
		this.nombre = "";
		this.tlf = " ";
		
	}

	/*
	 * GETTERS/SETTERS
	 */
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


	public String getTlf() {
		return tlf;
	}


	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
	

	


	
	
	
	
	
	/*
	 * EQULAS
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(dni, other.dni);
	}


	/*
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "\n Nombre:" + nombre + " DNI: " + dni + " Telefono: " + tlf ;
	}
	
	
	
}
