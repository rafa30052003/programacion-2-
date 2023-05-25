package model;

import java.util.Collection;
import java.util.HashSet;

public class Libreria {
	private Collection<Libro> libros;
	public Libreria() {
		libros  = new HashSet <Libro>();
	}
	public boolean addLibro(Libro l) {
		return libros.add(l);
	}
	public int precioTotal() {
		int result= 0;
		for(Libro l: libros) {
			result+=l.getPrecio();
					
		}
		return result;
	}
	
	
	public int stream_precioTotal() {
		return this.libros.stream().mapToInt(l->{
			return l.getPrecio();
		}).sum();
		
	}
	
	public int cuantosLibrosGratis( ) {
		int result = 0; 
		for(Libro l: libros) {
			if(l.getPrecio()==0) {
				result++;
			}
		}
		
		
		return result;
	}
	
	
	public int stream_cuantosLibrosGratis() {

		return (int) this.libros.stream().filter(l->l.getPrecio()==0).count();
		
	}
	
	
}
