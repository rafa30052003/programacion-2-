package seriañizacion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Agenda implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private List<Contacto> contactos;

	public Agenda() {
		
		this.contactos = new ArrayList();
	}

	public List<Contacto> getContaactos() {
		return contactos;
	}

	public void setContaactos(List<Contacto> contactos) {
		this.contactos = contactos;
	}

	public void addContacto(Contacto c) {
		this.contactos.add(c);
	}
	
	
}
