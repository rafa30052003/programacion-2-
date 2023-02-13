package controller;

import java.time.LocalDate;

import GUI.GUIejemplar;

import interfaces.iControllerEjemplar;
import interfaces.iGUIejemplar;
import model.CRUD.Biblioteca;
import model.dataObect.Ejemplar;
import utils.Controles;

public class EjemplarController implements iControllerEjemplar{
	private iGUIejemplar ge = new GUIejemplar();
	
	/**
	 * Funcion que controla el menu de Ejemplar
	 */
	@Override
	public void controlaMenuEjemplar(Biblioteca b) {
		int opcion;
		boolean valid = false;
		do {
			ge.muestraMenuEjemplar();
			opcion = Controles.leeEntero("Introduce la opcion a elegir:  ");
			switch (opcion) {
			case 0:
				valid=true;
				Controles.mensaje("Has salido correctamente.");
				break;
			case 1:
				 controlaAddEjemplar(b);
				break;
			case 2:
				controlaMuestraEjemplar(b);
				break;
			case 3:
				controlaEditEjemplar(b);
				break;
			case 4:
				controlaDeleteEjemplar(b);
				break;

			default:
				Controles.mensaje("Opcion incorrecta.");
				break;
			}
		} while (!valid);
		
		
	}
	/**
	 * Funcion que controla y crea un ejemplar
	 */
	@Override
	public void controlaAddEjemplar(Biblioteca b) {
		ge.muestraAddEjemplar();
		
		int cod = Controles.leeEntero("Introduce el codigo de el ejemplar: ");
		String titulo = Controles.leeString("Introduce el el titulo: ");
		boolean prestado = false;
		int fPublic = Controles.leeEntero("Introduce la fecha de publicacion del libro: ");
		int isbn = Controles.leeEntero("Introduce el isbn: ");
		LocalDate fPrest = null;
		int nEstand = Controles.leeEntero("Introduce el numero de estanteria: ");
		
		Ejemplar e = new Ejemplar(cod, titulo, prestado, fPublic, isbn, fPrest, nEstand);
		
		if(b.addElement(e)== true) {
			Controles.mensaje("Su ejemplar se ha introducido correctamente");
		}
	}
	/**
	 * Funcion que muestra por codigo el ejemplar
	 */
	@Override
	public void controlaMuestraEjemplar(Biblioteca b) {
		
		int cod = Controles.leeEntero("Introduce el codigo del Ejemplar a buscar: ");
		b.searchElememt(cod);
		Controles.imprime(b.searchElememt(cod));
	}
	/**
	 * Funcion que edita el ejemplar seteando sus datos
	 */
	@Override
	public void controlaEditEjemplar(Biblioteca b) {
		ge.muestraEditEjemplar();
		Ejemplar e=null;
		e = (Ejemplar) b.searchElememt(Controles.leeEntero("Introduce el codigo del Ejemplar a editar: "));
		
		
		String titulo = Controles.leeString("Introduce el el titulo: ");
		int fPublic = Controles.leeEntero("Introduce la fecha de publicacion del libro: ");
		
		int nEstand = Controles.leeEntero("Introduce el numero de estanteria: ");
		
		e.setTitulo(titulo);
		e.setfPublic(fPublic);
		
		e.setnEstand(nEstand);
			 
		
		
	}
	/**
	 * Funcion que controla la eliminacion del ejemplar
	 */
	@Override
	public void controlaDeleteEjemplar(Biblioteca b) {
		ge.muestraDeleteEjemplar();
		b.deleteElement(b.searchElememt(Controles.leeEntero("Introduce el codigo del Ejemplar a eliminar: ")));
		Controles.mensaje("Has eliminado el Ejemplar");
	}

}
