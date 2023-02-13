package GUI;

import java.util.Scanner;

import interfaces.iGUI;

public class View implements iGUI {

	@Override
	public void muestraMenuPrincipal() {
		System.out.println("1 Agregar ");
		System.out.println("2 Mostrar ");
		System.out.println("3 Salir");
	}

	@Override
	public void muestraAnadirProductos() {
		
	}

	@Override
	public int leeEntero(String msg) {
		System.out.println(msg);
		Scanner sc= new Scanner(System.in);
		int s = sc.nextInt();
		return s;
		
	}

	@Override
	public String leeString(String msg) {
		System.out.println(msg);
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		return s;
	}

	@Override
	public void muestraMensaje(String msg) {
		System.out.println(msg);
		
	}

}
