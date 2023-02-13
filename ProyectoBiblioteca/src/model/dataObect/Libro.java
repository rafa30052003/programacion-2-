package model.dataObect;

import java.time.LocalDate;


public class Libro extends Elemento {

	protected boolean prestado;
	protected int fPublic;
	protected int isbn;
	protected LocalDate fPrest;
	
	
	/*
	 * CONSTRUCTORES
	 */
	public Libro(int cod, String titulo,  boolean prestado, int fPublic, int isbn, LocalDate fPrest) {
		super(cod,titulo);
		
		this.prestado = prestado;
		this.fPublic = fPublic;
		this.isbn = isbn;
		this.fPrest = fPrest;
	
	}

	
	public Libro() {
		super();
		this.prestado = false;
		this.fPublic = 0;
		this.isbn = 0000000000000;
		this.fPrest =null;
		
	}

	/*
	 * GETTER/SETTER
	 */
	public boolean isPrestado() {
		return prestado;
	}


	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}


	public int getfPublic() {
		return fPublic;
	}


	public void setfPublic(int fPublic) {
		this.fPublic = fPublic;
	}


	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}


	public LocalDate getfPrest() {
		return fPrest;
	}


	public void setfPrest(LocalDate fPrest) {
		this.fPrest = fPrest;
	}
	
	

	
	
	
	
	
	
	
	

	


	/*
	 * TO STRING
	 */
	@Override
	public String toString() {
		return  "\n Codigo del libro: "+super.getCod()+
				"\n Titulo del libro: "+super.getTitulo()+
				"\n En Prestamo: " + prestado + 
				"\n Fecha de publicacion: " + fPublic + 
				"\n ISBN: " + isbn + 
				"\n Fecha de Prestamo: " + fPrest;
	}

	
	
	
	
}
