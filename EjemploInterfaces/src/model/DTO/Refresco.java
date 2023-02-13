package model.DTO;

public class Refresco extends Bebida{
	private int azucar;

	public Refresco(String nombre, int precio, int azucar) {
		super(nombre, precio);
		this.azucar = azucar;
	}

	public Refresco() {
		super();
		this.azucar = 0;
	}

	public int getAzucar() {
		return azucar;
	}

	public void setAzucar(int azucar) {
		this.azucar = azucar;
	}

	@Override
	public String toString() {
		return "Refresco [azucar=" + azucar + "]"+super.toString();
	}

	

	
	
}
