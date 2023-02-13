package model;

public class Circulo {
	public final static double PI = 3.1416; //todos los objetos tienen el mismo valor en PI && Al ser estatico este atributo pertenece a la clase
	private int rad;
	
	
	/*
	 * CONSTRUCTORES
	 */
	
	//El constructor no te te deja generar PI ya que tiene "final"
	public Circulo(int rad) {
		super();
		this.rad = rad;
	}
	
	
	
	/*
	 * GETTER AND SETTER
	 */
	
	public int getRad() {
		return rad;
	}


	public void setRad(int rad) {
		this.rad = rad;
	}

	//En este caso nuestro IDE no te genera la clase set de PI ya que tiene asignadp "final"
	public double getPI() {
		return PI;
	}
	
	
	
	
}
