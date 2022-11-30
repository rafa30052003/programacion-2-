package model;

public class Aula {
	
	private String nomnbre;
	private Estudiante [] estudiantes;
	
	
	public Aula(String nomnbre) {
		super();
		this.nomnbre = nomnbre;
		this.estudiantes = new Estudiante[30];
		
	}
	/**
	 * devuelve el numero de estudiantes reales que tiene mi array estudiantes
	 * @return el numero de estudianres
	 */
	public int whoPupil() {
		int result = 0;
			for(Estudiante e: estudiantes ) {
				if(e!=null) {
					result++;
				}
			}
		return result;
	}
	/**
	 * metodo que añade un estudiante haciendo las comprobaciones correspondiaentes
	 * @param e: el estudiante a añadir
	 * @return boolean que te devuelve tre o false 
	 */
	public boolean addPupil(Estudiante e) {
		boolean valid = false;
		if(e!=null && this.whoPupil()<30) {
			 for (int i = 0; i < estudiantes.length&& !valid; i++) {
				if(estudiantes[i]!=null) {
					estudiantes[i]=e;
					valid= true;
				}
			 }
		}
		return valid;
	}
	
	
}
