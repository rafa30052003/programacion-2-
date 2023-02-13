package model;

import java.util.Objects;

public class Profesor extends Persona{
	private String IDProfesor;

	public Profesor(String iDProfesor) {
		super();
		IDProfesor = iDProfesor;
	}

	public Profesor () {
		super();
		IDProfesor = "";
	}

	public Profesor(String nombre, String apellidos, int edad) {
		super(nombre, apellidos, edad);
		IDProfesor = "UnKnow";
	}

	
	//GETTERS AND SETTERS
	
	public String getIDProfesor() {
		return IDProfesor;
	}

	public void setIDProfesor(String IDProfesor) {
		this.IDProfesor = IDProfesor;
	}

	
	
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		return Objects.equals(IDProfesor, other.IDProfesor);
	}

	@Override
	public String toString() {
		return " Datos Profesor:"+
				"\n IDProfesor: " + IDProfesor+
				"\n Nombre: "+ getNombre()+
				"\n Edad: "+ getEdad();
	}
	
	
}
