package model.dataObect;

import java.time.LocalDate;

public class Ejemplar extends Libro{
	private int nEstand;
	
	/*
	 * CONSTRUCTORES
	 */
	public Ejemplar(int cod, String titulo, boolean prestado, int fPublic, int isbn, LocalDate fPrest, int nEstand) {
		super(cod, titulo, prestado, fPublic, isbn, fPrest);
		this.nEstand = nEstand;
	}

	public Ejemplar() {
		super();
		this.nEstand = -1;
	}
	/*
	 * GETTERS/SETTERS
	 */
	public int getnEstand() {
		return nEstand;
	}

	public void setnEstand(int nEstand) {
		this.nEstand = nEstand;
	}
	/*
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "\nREVISTA: "+
				super.toString()+
				"\n Numero de Estanterias" + nEstand;
	}

	
	
	
}
