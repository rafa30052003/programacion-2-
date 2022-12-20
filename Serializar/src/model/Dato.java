package model;
import java.io.Serializable;
import java.util.Objects;

public class Dato implements Serializable {
	private String nombre;
	private String numero;
	
	
	public Dato(String nombre, String numero) {
		
		this.nombre = nombre;
		this.numero = numero;
	}


	public Dato() {
		
		// TODO Auto-generated constructor stub
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dato other = (Dato) obj;
		return Objects.equals(numero, other.numero);
	}


	@Override
	public String toString() {
		return "Dato [nombre=" + nombre + ", numero=" + numero + "]";
	}
	
	
	
}
