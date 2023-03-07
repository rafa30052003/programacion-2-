package model;

public class MenuFactory {
	
	
	public static Menu createMenu(MenuTipe tipe) {
		Menu result = null;
		if(tipe.equals(MenuTipe.BASICO)) {
			result = new MenuBasico();	
		}else if(tipe.equals(MenuTipe.DELUXE)) {
			result = new MenuDeluxe();
		}
		return result;
		
	}
}
