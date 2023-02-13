package GUI;

import interfaces.iGUIrevistas;

public class GUIrevistas implements iGUIrevistas{

	@Override
	public void muestraMenuRevista() {
		System.out.println("                              ");
		System.out.println(" _____________________________");
		System.out.println("|                             |");
		System.out.println("|---MENU REVISTAS BIBLIOTECA--|");
		System.out.println("|                             |");
		System.out.println("| [0]-> Salir                 |");
		System.out.println("| [1]-> Insertar revistas     |");
		System.out.println("| [2]-> Mostrar revistas      |");
		System.out.println("| [3]-> Actualizar revistas   |");
		System.out.println("| [4]-> Eliminar revistas     |");
		System.out.println("|_____________________________|");
		System.out.println("                             ");
		
	}

	@Override
	public void muestraAddRevista() {
		
			System.out.println("                             ");
			System.out.println(" ___________________________ ");
			System.out.println("|                           |");
			System.out.println("|     INTRODUCIR REVISTAS   |");
			System.out.println("|___________________________|");
			System.out.println("                             ");
		
	}

	@Override
	public void muestraEditRevista() {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|      EDITAR REVISTAS      |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		
	}

	@Override
	public void muestraDeleteRevistas() {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|      ELIMINAR REVISTAS    |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		
	}

}
