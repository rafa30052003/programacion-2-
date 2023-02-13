package GUI;

import interfaces.iGUI;

public class GUIprincipal implements iGUI {

	@Override
	public void muestraMenuPrincipal() {
		System.out.println("                             ");
		System.out.println(" ____________________________");
		System.out.println("|                            |");
		System.out.println("|----BIBLIOTECA  HOGWARTS----|");
		System.out.println("|                            |");
		System.out.println("| [0]-> Salir                |");
		System.out.println("| [1]-> Gestion de Elementos |");
		System.out.println("| [2]-> Gestion de Prestamos |");
		System.out.println("|___________________________ |");
		System.out.println("                             ");
	}
		
	

	@Override
	public void muestraMenuGestor() {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|----GESTION DE ELEENTOS----|");
		System.out.println("|                           |");
		System.out.println("| [0]-> Salir               |");
		System.out.println("| [1]-> Menu Ejemplar       |");
		System.out.println("| [2]-> Menu Revista        |");
		System.out.println("| [3]-> Menu Usuario        |");
		System.out.println("| [4]-> Todos Elementos     |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
	}
		
	

	
	
}
