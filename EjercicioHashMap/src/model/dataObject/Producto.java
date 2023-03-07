package model.dataObject;

import java.util.Objects;

public class Producto {
	String id;
	String descripcion;
	Size talla;
	double precio;
	public Producto(String id, String descripcion, Size talla, double precio) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.talla = talla;
		this.precio = precio;
	}
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Size getTalla() {
		return talla;
	}
	public void setTalla(Size talla) {
		this.talla = talla;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(descripcion, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(descripcion, other.descripcion) && Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", descripcion=" + descripcion + ", talla=" + talla + ", precio=" + precio + "]";
	}
	
}
