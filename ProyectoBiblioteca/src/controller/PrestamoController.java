package controller;

import GUI.GUIprestamo;
import interfaces.iControllerPrestamo;
import interfaces.iGUIprestamo;
import model.CRUD.Biblioteca;
import model.dataObect.Ejemplar;
import model.dataObect.Usuario;
import utils.Controles;

public class PrestamoController implements iControllerPrestamo{
	
	private iGUIprestamo gp = new GUIprestamo(); 
	/**
	 * Funcion que controla el muenu de prestamos
	 */
	@Override
	public void controllerMenuPrestamo(Biblioteca b) {
		int opcion;
		boolean valid = false ;
		do {
			gp.muestraMenuPrestamos();
			opcion = Controles.leeEntero("Introduce la opcion a elegir: ");
			switch(opcion) {
			case 0: 
				valid = true;
				Controles.mensaje("Has salido correctamente.");
				break;
			case 1:
				controlaAddPrestamo(b);
				break;
			case 2:
				controlaDevuelvePrestamo(b);
				break;
			case 3:
				controlaMuestraAll(b);
				break;
			}
		} while (!valid);
		
	}
	
	
	
	/**
	 * Funcion que controla y agrega un nuevo prestamo a nuestra biblioteca
	 */
	@Override
	public void controlaAddPrestamo(Biblioteca b) {
		gp.muestraAddPrestamo();
		Ejemplar e = null;
		e = (Ejemplar) b.searchElememt(Controles.leeEntero("Introduce el codigo del ejemplar  que desea adquirir:"));
		Usuario u = null;
		u = (Usuario)b.searchUsuario(Controles.devuelveDNI("Introduce el dni del usuario que quiere adquirir el ejemplar: "));
		if(b.prestoEjemplar(e, u)== true) {
			Controles.mensaje("El ejemplar ha sido prestado.");
		}else {
			Controles.mensaje("A ocurrido un error en el prestamo");
			
		}
	}
	/**
	 * Funcion que controla la devolucion del prestamo
	 */
	@Override
	public void controlaDevuelvePrestamo(Biblioteca b) {
		gp.muestraRetirarPrestamo();
		Ejemplar e = null;
		e = (Ejemplar) b.searchElememt(Controles.leeEntero("Introduce el codigo del ejemplar que desea devolver:"));
		Usuario u = null;
		u = b.searchUsuario(Controles.devuelveDNI("Introduce el dni del usuario que posee el ejemplar: "));
		if(b.entregaEjemplar(e, u)==true) {
			Controles.mensaje("El ejemplar a sido devuleto.");
		}else {
			Controles.mensaje("A ocurrido un error en el prestamo.");
		}
		
		
	}



	/**
	 * Funcion que muestra todos los prestamos de nuestra biblioteca
	 */
	@Override
	public void controlaMuestraAll(Biblioteca b) {
		gp.muestraAllPrestamo();
		String prestamos = b.muestraAllPrestamos();
		Controles.mensaje(prestamos);
	}
	
}
