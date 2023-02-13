package model;

public class MenuDeluxe extends Menu {

	public MenuDeluxe() {
		super("Basico",1095);
		
	}

	@Override
	public String primerPlato() {
		String result="\n------PRIMEROS-----";
		result = "1. Solomillo \n";
		result = "2. Carrillada \n";
		return result;
	}

	@Override
	public String segundoPlato() {
		String result="\n------SEGUNDO-----";
		result = "1. Calamares deluxe \n";
		result = "2. variado de verduras \n";
		return result;
	}

	@Override
	public String postre() {
		String result="\n------POSTRE-----";
		result = "1. mush \n";
		result = "2. fruta deluxe \n";
		return result;
		
	}

	@Override
	public String bebida() {
		String result="\n------BEBIDA-----";
		result = "1. Cerveza \n";
		result = "2. vino reserva \n";
		return result;
	}
	
}
