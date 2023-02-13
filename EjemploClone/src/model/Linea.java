package model;

public class Linea implements Cloneable  {
	private int cantidad;
	private String descripcion;
	public Linea(int cantidad, String descripcion) {
		super();
		this.cantidad = cantidad;
		this.descripcion = descripcion;
	}
	public Linea() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Linea [cantidad=" + cantidad + ", descripcion=" + descripcion + "]";
	}
	
	@Override 
	public Object clone() {
		Linea nueva = new Linea (this.cantidad, this.descripcion);
		return nueva;
	}
}
