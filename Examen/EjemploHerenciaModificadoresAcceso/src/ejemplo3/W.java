package ejemplo3;

import ejemplo.X;

public class W {
	X objx = new X();
	
	public void pruebaAtributos() {
		System.out.println(a); //privado
		System.out.println(b); //sin modficador
		System.out.println(c); //protegido
		System.out.println(objx.d); //publico
	}
}
