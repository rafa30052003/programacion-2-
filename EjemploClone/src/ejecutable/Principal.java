package ejecutable;

import model.Linea;
import model.Pedido;

public class Principal {
	public static void main(String[] args) {
		Linea l = new Linea (25,"articulo 1");
		Pedido p = new Pedido("p1","345C",125.35, l);
		/*
		Pedido nuevo = p;
		nuevo.setDni("12345678C");
		
		System.out.println("el dni: "+ p);
		System.out.println("El dni nuevo es "+ nuevo);
		
		Pedido nuevo2 = (Pedido) p.clone();
		p.setDni("555E");
		System.out.println("el dni: "+ p);
		System.out.println("El dni nuevo es "+ nuevo);
		System.out.println(nuevo2);
		*/
		Pedido nuevo = (Pedido) p.clone();
		System.out.println("p "+p);
		System.out.println("nuevo "+nuevo);
		
		l.setCantidad(43);
		System.out.println("p "+p);
		System.out.println("nuevo "+nuevo);
		
	}
	
}
