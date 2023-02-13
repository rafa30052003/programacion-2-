package model;

public class ProfesorInterino extends Profesor{
	private float tiempoServicio;
	
	public ProfesorInterino() {
		super();
		tiempoServicio=0;
	}

	public ProfesorInterino(String nombre, String apellidos, int edad, float tiempoServicio) {
		super(nombre, apellidos, edad);
		this.tiempoServicio = tiempoServicio;
	}

	
	
	
	
	public float getTiempoServicio() {
		return tiempoServicio;
	}

	public void setTiempoServicio(float tiempoServicio) {
		this.tiempoServicio = tiempoServicio;
	}
	
	@Override
	public void setIDProfesor(String IDProfesor) {
		super.setIDProfesor(IDProfesor+ "-I");
	}
	

	@Override
	public String toString() {
		return super.toString()+
				"Datos Interenidad. Tiempo de Servicio=" + tiempoServicio+" años\n" ;
	}
	 
	
	
}
