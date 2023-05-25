package test;

import model.Libreria;

public class Main {

	public static void main(String[] args) {
		Libreria l = LibreriaBuilder.build();
		System.out.println(l.precioTotal());
		System.out.println(l.stream_precioTotal());

	}

}
