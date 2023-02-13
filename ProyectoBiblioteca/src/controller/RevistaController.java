 package controller;

import GUI.GUIrevistas;

import interfaces.iControllerRevistas;
import interfaces.iGUIrevistas;
import model.CRUD.Biblioteca;
import model.dataObect.Elemento;
import model.dataObect.Revista;
import utils.Controles;

public class RevistaController implements iControllerRevistas{
	private iGUIrevistas gr = new GUIrevistas();
	/**
	 * Funcion que controla el menu revistass
	 */
	@Override
	public void controlaMenuRevista(Biblioteca b) {
		int opcion;
		boolean valid = false;
		do {
			gr.muestraMenuRevista();
			opcion = Controles.leeEntero("Introduce la opcion a elegir:  ");
			switch (opcion) {
			case 0:
				valid=true;
				Controles.mensaje("Has salido correctamente.");
				break;
			case 1:
				controlaAddRevista(b);
				break;
			case 2:
				controlaMuestraRevista(b);
				break;
			case 3:
				controlaEditRevista(b);
				break;
			case 4:
				controlaDeleteRevista(b);
				break;

			default:
				Controles.mensaje("Opcion incorrecta.");
				break;
			}
		} while (!valid);
		
		
	}
	/**
	 * Funcion que controla y agrega una revista a la biblioteca
	 */
	@Override
	public void controlaAddRevista(Biblioteca b) {
		gr.muestraAddRevista();
		
		int cod = Controles.leeEntero("Introduce el codigo de su revista: ");
		String titulo = Controles.leeString("Introduce el titulo: ");
		int nEdicion = Controles.leeEntero("Introduce el numero de edicion: ");
		
		Elemento r = new Revista (cod, titulo, nEdicion);
		
		if(b.addElement(r)==true){
			Controles.mensaje("Su revista se ha introducido correctamente");
		}else {
			
		}
		
	}
	/**
	 * Funcion que muestra la revista por codigo
	 */
	@Override
	public void controlaMuestraRevista(Biblioteca b) {
		int cod = Controles.leeEntero("Introduce el codigo del elemento a buscar: ");
		b.searchElememt(cod);
		Controles.imprime(b.searchElememt(cod));
		
	}
	/**
	 * Funcion que edita la revista y setea sus atributos
	 */
	@Override
	public void controlaEditRevista(Biblioteca b) {
		gr.muestraEditRevista();
		Revista r = null;
		r = (Revista) b.searchElememt(Controles.leeEntero("Introduce el codigo de la Revista a buscar: "));
		
		String titulo = Controles.leeString("Introduce el titulo: ");
		int nEdicion = Controles.leeEntero("Introduce el numero de edicion: ");
		
		r.setTitulo(titulo);
		r.setnEdicion(nEdicion);
		
	}
	/**
	 * Funcion que controla la eliminacion de la revista
	 */
	@Override
	public void controlaDeleteRevista(Biblioteca b) {
		gr.muestraDeleteRevistas();
		b.deleteElement(b.searchElememt(Controles.leeEntero("Introduce el codigo de la Revista: ")));
		Controles.mensaje("Has eliminado la Revista");
		
	}

}
