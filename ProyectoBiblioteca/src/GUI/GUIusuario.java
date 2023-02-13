package GUI;

import interfaces.iGUIusuario;

public class GUIusuario implements iGUIusuario{

	@Override
	public void muestraMenuUsuario() {
		System.out.println("                              ");
		System.out.println(" _____________________________");
		System.out.println("|                             |");
		System.out.println("|---MENU USUARIO BIBLIOTECA---|");
		System.out.println("|                             |");
		System.out.println("| [0]-> Salir                 |");
		System.out.println("| [1]-> Insertar usuarios     |");
		System.out.println("| [2]-> Mostrar usuarios      |");
		System.out.println("| [3]-> Actualizar usuarios   |");
		System.out.println("| [4]-> Eliminar usuarios     |");
		System.out.println("| [5]-> MostrarALL usuarios   |");
		System.out.println("|_____________________________|");
		System.out.println("                             ");
		
	}

	@Override
	public void muestraAddUsuario() {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|     INTRODUCIR USUARIOS   |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		
	}

	@Override
	public void muestraEditUsuario() {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|      EDITAR USUARIOS      |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		
	}

	@Override
	public void muestraDeleteUsuario() {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|      ELIMINAR USUARIOS    |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		
	}
	
}
