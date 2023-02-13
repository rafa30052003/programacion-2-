package model.dataObect;


import java.util.Objects;

public class Prestamo {
	private Ejemplar ejemplar;
	private Usuario usuario;

	public Prestamo(Ejemplar ejemplar, Usuario usuario) {
		super();
		this.ejemplar = ejemplar;
		this.usuario = usuario;

	}
	public Ejemplar getEjemplar() {
		return ejemplar;
	}
	public void setEjemplar(Ejemplar ejemplar) {
		this.ejemplar = ejemplar;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prestamo other = (Prestamo) obj;
		return Objects.equals(ejemplar, other.ejemplar) && Objects.equals(usuario, other.usuario);
	}
	@Override
	public String toString() {
		return "Prestamo: " + ejemplar  + usuario ;
	}
	
}
