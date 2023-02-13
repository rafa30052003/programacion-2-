package model;

public abstract class Menu {
	private String nombre;
	private int precio;
	public Menu(String nombre, int precio) {
		
		this.nombre = nombre;
		this.precio = precio;
	}
	// se puede quitar
	private Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public double getPricet() {
		return this.precio/100;
	}
	public void setPrecio(int precio) {
		precio=precio<0?0:precio;
		this.precio = precio;
	}
	
	
	abstract public  String primerPlato();
	abstract public String segundoPlato();
	abstract public String postre();
	abstract public String bebida();
	
	
	public String toString() {
		String result = "\n"+this.nombre+"\n";
		result += primerPlato();
		result += segundoPlato();
		result += postre();
		result += bebida();
		return result;
	}
}
