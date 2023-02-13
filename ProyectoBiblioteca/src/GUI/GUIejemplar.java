package GUI;

import interfaces.iGUIejemplar;

public class GUIejemplar implements iGUIejemplar{

	@Override
	public void muestraMenuEjemplar() {
		System.out.println("                             ");
		System.out.println(" _____________________________");
		System.out.println("|                             |");
		System.out.println("|--MENU EJEMNPLAR BIBLIOTECA--|");
		System.out.println("|                             |");
		System.out.println("| [0]-> Salir                 |");
		System.out.println("| [1]-> Insertar ejemplar     |");
		System.out.println("| [2]-> Mostrar ejemplar      |");
		System.out.println("| [3]-> Actualizar ejemplar   |");
		System.out.println("| [4]-> Eliminar ejemplar     |");
		System.out.println("|_____________________________|");
		System.out.println("                             ");
		
	}

	@Override
	public void muestraAddEjemplar() {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|     INTRODUCIR EJEMPLAR   |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		
	}

	@Override
	public void muestraEditEjemplar() {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|      EDITAR EJEMPLAR      |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		
	}

	@Override
	public void muestraDeleteEjemplar() {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|      ELIMINAR CLIENTE     |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		
	}
	
}
