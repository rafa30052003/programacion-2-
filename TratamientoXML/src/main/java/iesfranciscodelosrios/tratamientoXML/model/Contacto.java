package iesfranciscodelosrios.tratamientoXML.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Contacto {
	@XmlElement
	private String nombre;
	@XmlElement
	private String tlf;
	@XmlElement
	private String email;
	
	public Contacto(String nombre, String tlf, String email) {
		
		this.nombre = nombre;
		this.tlf = tlf;
		this.email = email;
	}
	public Contacto() {
		
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", tlf=" + tlf + ", email=" + email + "]";
	}
	
}
