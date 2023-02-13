package model;

public class Pedido implements Cloneable{
	private String codigo;
	private String dni;
	private double importe;
	private Linea linea;
	public Pedido(String codigo, String dni, double importe, Linea linea) {
		super();
		this.codigo = codigo;
		this.dni = dni;
		this.importe = importe;
		this.linea = linea;
	}
	public Pedido() {
		super();
		
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	public Linea getLinea() {
		return linea;
	}
	public void setLinea(Linea linea) {
		this.linea = linea;
	}
	@Override
	public String toString() {
		return "Pedido [codigo=" + codigo + ", dni=" + dni + ", importe=" + importe + ", linea= "+linea;
	}
	
	@Override
	public Object clone() {
		Pedido nuevo = new Pedido(this.codigo, this.dni, this.importe, (Linea) this.linea.clone());
		return nuevo;
	}
	
}
