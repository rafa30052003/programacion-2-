package test;

import java.util.ArrayList;
import java.util.List;

import model.Menu;

import model.MenuFactory;
import model.MenuTipe;

public class testMenu {

	public static void main(String[] args) {
		 List<Menu> menus = new ArrayList<>();
		 
		 menus.add(MenuFactory.createMenu(MenuTipe.BASICO));
		 menus.add(MenuFactory.createMenu(MenuTipe.DELUXE));
		 
		 for(Menu menu : menus) {
			 System.out.println(menu);
		 }

	}

}
