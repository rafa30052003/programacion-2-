package controller;

import GUI.GUIusuario;

import interfaces.iControllerUsuario;
import interfaces.iGUIusuario;
import model.CRUD.Biblioteca;
import model.dataObect.Ejemplar;
import model.dataObect.Usuario;
import utils.Controles;

public class UsuarioController implements iControllerUsuario{
	private iGUIusuario gu = new GUIusuario();
	
	/**
	 * Funcion que controla el menu de usuarios
	 */
	@Override
	public void controlaMenuUsuario(Biblioteca b) {
		int opcion;
		boolean valid = false;
		do {
			gu.muestraMenuUsuario();
			opcion = Controles.leeEntero("Introduce la opcion a elegir:  ");
			switch (opcion) {
			case 0:
				valid=true;
				Controles.mensaje("Has salido correctamente.");
				break;
			case 1:
				controlaAddUsuario(b);
				break;
			case 2:
				controlaMuestraUsuario(b);
				break;
			case 3:
				controlaEditUsuario(b);
				break;
			case 4:
				controlaDeleteUsuario(b);
				break;
			case 5:
				muestraALLUsuario(b);
				break;
				
			default:
				Controles.mensaje("Opcion incorrecta.");
				break;
			}
		} while (!valid);
		
		
	}
	/**
	 * Funcion que controla y crea usuarios
	 */
	@Override
	public void controlaAddUsuario(Biblioteca b) {
		gu.muestraAddUsuario();
		
		String dni = Controles.devuelveDNI("Intoduce el dni: ");
		String nombre = Controles.leeString("Introduce el nombre: ");
		String tlf = Controles.validaTLF("Introduce el telefono: ");
		
		
		Usuario u = new Usuario(dni, nombre, tlf);
		
		if(b.addUsuario(u)== true) {
			Controles.mensaje("El usuario ha sido introducido correctamente.");
			
		}else {
			Controles.mensaje("Error. Algo ha fallado.");
		}
		
	}
	/**
	 * Funcion que muestra los usuarios por codigo
	 */
	@Override
	public void controlaMuestraUsuario(Biblioteca b) {
		
		String dni = Controles.devuelveDNI("Introduce el dni de el usuario a mostrar: ");
		b.searchUsuario(dni);
		Controles.imprime(b.searchUsuario(dni));
	}
	/**
	 * Funcion que edita y setea los datos del usuario
	 */
	@Override
	public void controlaEditUsuario(Biblioteca b) {
		gu.muestraEditUsuario();
		Usuario u = null;
		u = b.searchUsuario(Controles.devuelveDNI("Introduce el DNI de el Usuario a modificar: "));
		
		String nombre = Controles.leeString("Introduce el nombre: ");
		String tlf = Controles.validaTLF("Introduce el telefono: ");
		
		
		u.setNombre(nombre);
		u.setTlf(tlf);
		
	}
	/**
	 * Funcion que controla la emliminacion de los usuarios
	 */
	@Override
	public void controlaDeleteUsuario(Biblioteca b) {
		gu.muestraDeleteUsuario();
		b.deleteUsuario(b.searchUsuario(Controles.devuelveDNI("Introduce el DNI del Usuario: ")));
		Controles.mensaje("Has eliminado el Usuario");
		
	}
	
	/**
	 * Funcion que muestra todos los usuarios de nuestra biblioteca
	 * @param b
	 */
	public void muestraALLUsuario(Biblioteca b){
		String usuario = b.muestraAllUsuario();
		Controles.mensaje(usuario);
	}

}
