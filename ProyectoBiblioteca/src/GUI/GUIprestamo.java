package GUI;

import interfaces.iGUIprestamo;

public class GUIprestamo implements iGUIprestamo{

	@Override
	public void muestraMenuPrestamos() {
		System.out.println("                             ");
		System.out.println(" _____________________________");
		System.out.println("|                             |");
		System.out.println("|--MENU PRESTAMOS BIBLIOTECA--|");
		System.out.println("|                             |");
		System.out.println("| [0]-> Salir                 |");
		System.out.println("| [1]-> Insertar prestamo     |");
		System.out.println("| [2]-> Eliminar prestamo     |");
		System.out.println("| [3]-> MostrarAll prestamos  |");
		System.out.println("|_____________________________|");
		System.out.println("                             ");
		
	}

	@Override
	public void muestraAddPrestamo() {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|    INTRODUCIR PRESTAMO    |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		
	}

	@Override
	public void muestraRetirarPrestamo() {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|     ELIMINAR PRESTAMO     |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		
	}

	@Override
	public void muestraAllPrestamo() {
		
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|   PRESTAMOS REGISTRADOS   |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
	}
	
	

}
