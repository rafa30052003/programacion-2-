package model.domain;

public class Libro {
	private String isbn;
	private String titulo;
	private Autor a;
	public Libro(String isbn, String titulo, Autor a) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.a = a;
	}
	public Libro() {
		super();
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getA() {
		return a;
	}
	public void setA(Autor a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", a=" + a.getDni() + "]";
	}
	
	
	 
}
