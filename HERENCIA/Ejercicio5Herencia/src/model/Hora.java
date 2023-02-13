package model;

public class Hora {
	protected int min;
	protected int hora;
	
	
	//le asigna la hora y el min por defecto en caso de no haber introducido bien los datos
	public Hora(int min, int hora) {
		if(!(setMinutos(min)&& setHoras(hora))) {
			this.min=min;
			 this.hora=hora;
		}
		
	}

	public boolean setMinutos(int valor) {
		boolean result = false ;//no se han actualizado los min
			if (valor>=0 && valor<=59) {
				this.min=valor;
				result = true;
			}
		return result;
	}
	public boolean setHoras(int valor) {
		boolean result = false; //no se han actualizado los min
			if (valor>=0 && valor<=23) {
				this.hora=valor;
				result = true;
			}
		return result;
	}
	
	
	
	public int getMin() {
		return min;
	}

	

	public int getHora() {
		return hora;
	}

	

	public void inc() {
		min++;
		if(min >= 60) {
			this.min=0;
			hora++;
			if(hora >= 24) {
				this.hora=0;
			}
		}
	}

	@Override
	public String toString() {
		return " LA HORA ES " + min + ":" + hora ;
	}
	
	
}
