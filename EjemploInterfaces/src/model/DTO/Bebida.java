package model.DTO;

import java.util.Objects;

public class Bebida {
	protected String nombre;
	protected int precio;
	public Bebida(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	public Bebida() {
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
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bebida other = (Bebida) obj;
		return Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Bebida [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
}
