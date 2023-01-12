package model;

public class Empleado extends Persona{
	private double sueldo;
	private int IdEmpleado;
	
	
	public Empleado(String nombre, int edad, String dni, double sueldo, int idEmpleado) {
		super(nombre, edad, dni);
		this.sueldo = sueldo;
		this.IdEmpleado = idEmpleado;
	}
	
	
	public Empleado() {
		super();
		this.sueldo = 0.0;
		IdEmpleado = -1;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public int getIdEmpleado() {
		return IdEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		IdEmpleado = idEmpleado;
	}
	
	
	
	@Override
	public String toString() {
		return "Empleado: "+
				super.toString()+
				"\n suelso: "+sueldo+
				"\n idEmpleado: "+IdEmpleado;
	}
	
	
	
}
