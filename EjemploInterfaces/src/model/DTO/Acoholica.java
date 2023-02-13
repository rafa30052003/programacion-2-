package model.DTO;

public class Acoholica extends Bebida {
	private int alcohol;

	public Acoholica(String nombre, int precio, int alcohol) {
		super(nombre, precio);
		this.alcohol = alcohol;
	}

	public Acoholica() {
		super();
		this.alcohol = 0;
	}

	public int getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(int alcohol) {
		this.alcohol = alcohol;
	}

	@Override
	public String toString() {
		return "Acoholica [alcohol=" + alcohol + "]"+ super.toString();
	}

	
	
}
