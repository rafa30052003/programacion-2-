package test;

import java.util.Iterator;

import model.Libreria;
import model.Libro;

public class LibreriaBuilder {

	public static Libreria build() {
		Libreria l = new Libreria();
		l.addLibro(new Libro("1", "Amanece que no es poco", "", 0));
		l.addLibro(new Libro("2", "Quijore", "Cervantes", 15));
		l.addLibro(new Libro("3", "Amanece ", "Alberto bueno", 300));
		l.addLibro(new Libro("5", "El aparecer", "Javi Gracia", 0));
		
		
		for (int i = 5; i < 1000; i++) {
			l.addLibro(new Libro(String.valueOf(i),"Libro "+i,"Autor "+i, 10));
		}
		return l;
	}

}
