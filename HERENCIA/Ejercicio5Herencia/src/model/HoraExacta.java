package model;

public class HoraExacta extends Hora{
	private int segundo;
	
	public HoraExacta(int min, int hora, int segundo) {
		super(min, hora);
		if(!setSegundos(segundo)) {
			setMinutos(0);
			setHoras(0);
			this.segundo=0;
		}
	}
	
	
	
	public boolean setSegundos(int valor) {
		boolean result = false ;//no se han actualizado los min
			if (valor>=0 && valor<=59) {
				this.segundo=valor;
				result = true;
			}
		return result;
	}
	@Override
	public void inc() {
		segundo++;
		if(segundo >= 60) {
			this.segundo=0;
			super.inc();
		}
	}

	@Override
	public String toString() {
		return super.toString()+":"+segundo;
	}
	
	
}
