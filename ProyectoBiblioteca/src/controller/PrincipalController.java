package controller;

import GUI.GUIprincipal;

import interfaces.iController;
import interfaces.iControllerEjemplar;
import interfaces.iControllerRevistas;
import interfaces.iControllerUsuario;
import interfaces.iControllerPrestamo;
import interfaces.iGUI;
import model.CRUD.Biblioteca;
import utils.Controles;

public class PrincipalController implements iController{
	private iGUI migui = new GUIprincipal();
	private iControllerEjemplar ce = new EjemplarController();
	private iControllerRevistas cr = new RevistaController();
	private iControllerUsuario cu = new UsuarioController();
	private iControllerPrestamo cp = new PrestamoController();
	private Biblioteca mibiblio = new Biblioteca();
	
	
	/**
	 * Funcion controla nuestro menu principal
	 */
	@Override
	public void controlaMenuPrincipal() {
		int opcion;
		boolean valid = false;
		do {
			migui.muestraMenuPrincipal();
			opcion= Controles.leeEntero("Introduce la opcion a elegir: ") ;
			switch (opcion) {
			case 0:
				valid= true;
				Controles.mensaje("Has salido correctamente.");
				break;
			case 1:
				controllerMenuGestor();
				break;
			case 2:
				cp.controllerMenuPrestamo(mibiblio);
				break;
			default:
				Controles.mensaje("Opcion incorrepta");
				break;
			}
		} while (!valid);
		
	}
	/**
	 * Funcion que controla nuestro menu gestor
	 */
	@Override
	public void controllerMenuGestor() {
		int opcion;
		boolean valid = false;
		do {
			migui.muestraMenuGestor();
			opcion= Controles.leeEntero("Introduce la opcion a elegir: ") ;
			switch (opcion) {
			case 0:
				valid= true;
				Controles.mensaje("Has salido correctamente.");
				break;
			case 1:
				ce.controlaMenuEjemplar(mibiblio);
				break;
			case 2:
				cr.controlaMenuRevista(mibiblio);
				break;
			case 3:
				cu.controlaMenuUsuario(mibiblio);
				break;
			case 4:
				muestraAllElementos();
				
				break;

			default:
				Controles.mensaje("Opcion incorrepta");
				break;
			}
			
		} while (!valid);
		
		
	}

	/**
	 * Funcion que nuestra todos los elementos de nuestra biblioteca
	 */
	public void muestraAllElementos() {
		
		String misejemplares = mibiblio.muestraAllElement();
		Controles.mensaje(misejemplares);
	}

}
