package controller;

import GUI.View;
import interfaces.iController;
import interfaces.iGUI;
import interfaces.iRepo;
import model.CRUD.Repo;
import model.DTO.Bebida;

public class BebidaController implements iController {
	private iGUI  migui = new View();
	private iRepo mirepo = new Repo();
	@Override
	public void empezar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejecutaMenuPrincipal() {
		int opcion;
		do {
			migui.muestraMenuPrincipal();
			 opcion=migui.leeEntero("elige una opcion");
			controlaMenuPrincipal(opcion);
			
		} while (opcion!=3);
		
	}

	@Override
	public void controlaMenuPrincipal(int opcion) {
		switch (opcion) {
		case 1: 
			ejecutaAnadirBebida();
			break;
		case 2:
			 mostrarBebida();
			 break;
		case 3:
			 break;

		default:
			  migui.muestraMensaje("incorrecto");
			break;
		}
		
	}

	@Override
	public void ejecutaAnadirBebida() {
		String nombre = migui.leeString("añade el nombre");
		int precio = migui.leeEntero("introduce el precio");
		Bebida nueva = new Bebida(nombre, precio);
		AnadirBebida(nueva);
		
	}

	@Override
	public void AnadirBebida(Bebida b){
		if(mirepo.anadirBebida(b)) {
			migui.muestraMensaje("insertada ok");
		}else {
			migui.muestraMensaje("error");
		}
		
	}

	@Override
	public void mostrarBebida() {
		String bebida = mirepo.mostrarBebida();
		migui.muestraAnadirProductos();
	}

}
