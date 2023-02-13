package model;

public class UsaContenedor {
	public static void main(String[] args) {
		Contenedor <Integer> c = new Contenedor <> ();
		c.setObj(5);
		Integer n = c.getObj();
	}
}
