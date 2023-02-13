package model;

public class MenuBasico extends Menu {

	public MenuBasico() {
		super("Basico",1095);
		
	}

	@Override
	public String primerPlato() {
		String result="\n------PRIMEROS-----";
		result = "1. Huevos fritos \n";
		result = "2. Ensalada \n";
		return result;
	}

	@Override
	public String segundoPlato() {
		String result="\n------SEGUNDO-----";
		result = "1. Filete de pollo \n";
		result = "2. Flamenquin \n";
		return result;
	}

	@Override
	public String postre() {
		String result="\n------POSTRE-----";
		result = "1. tarde de queso \n";
		result = "2. Fruta \n";
		return result;
		
	}

	@Override
	public String bebida() {
		String result="\n------BEBIDA-----";
		result = "1. Cerveza \n";
		result = "2. Agua \n";
		return result;
	}
	
}
