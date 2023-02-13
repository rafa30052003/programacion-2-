package ejecutable;

import model.Circulo;
import model.Usuario;

public class Ejecutable {

	public static void main(String[] args) {
		Usuario u = new Usuario("123U", "pepe");
		//u.setDni("3456333E");
		
		Circulo c = new Circulo (36);
		Circulo c2 = new Circulo (14);
		
		//Circulo.PI //al hacer el atributo STATIC pasa a ser un atributo de la clase y no del objeto
	}

}
