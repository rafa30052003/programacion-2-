package model;

public class ProfesorFuncionario extends Profesor{
	private String destino;
	
	public ProfesorFuncionario() {
		super();
		destino="";
	}

	public ProfesorFuncionario(String nombre, String apellidos, int edad, String destino) {
		super(nombre, apellidos, edad);
		this.destino = destino;
	}

	
	
	
	
	
	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public void setIDProfesor(String IDProfesor) {
		super.setIDProfesor(IDProfesor+ "-I");
	}

	@Override
	public String toString() {
		return super.toString()+
				"Datos Funcionario. Destino=" + destino ;
	}
}
