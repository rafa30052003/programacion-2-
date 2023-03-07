package controller;

import GUI.Controles;
import GUI.View;
import model.DAO.Tienda;
import model.dataObject.Producto;
import model.dataObject.Size;

public class ControladorPrincipal {
	Tienda t = new Tienda();
	View v = new View();
	
	
	public void Controller () {
		int option;
		boolean valid = false;
		do {
			v.menu();
			option=Controles.leeEntero("Introduce la opcion: ");
			switch (option) {
			case 0:
				valid = true;
				Controles.mensaje("Has salido correctamente del programa");
				break;
			case 1:
				controllerAdd();
				break;
			case 2:
				controllerMostrarALL();
				break;
			case 3:
				controllerEdit();
				break;
			case 4:
				controllerDelete();
				break;
			case 5:
				modificaprecio();
				break;
			default:
				Controles.mensaje("Opcion incorrecta.");
				break;
			}
		} while (!valid);
	}
	
	
	
	
	
	public void controllerAdd() {
		v.insertaProducto();
		String id = Controles.leeString("introduce el id del producto: ");
		String descripcion = Controles.leeString("Introduce la descripcion del producto: ");
		String size = Controles.leeString("Introduce una de las tallas a elegir: ");
		Size talla = Enum.valueOf(Size.class, size);
		double precio = Controles.leeDouble("Introduce el precio del producto: ");
		Producto p = new Producto (id, descripcion, talla, precio);
		if(t.add(p, id)) {
			Controles.mensaje("Su ejemplar a sido introducido correctamente.");
		}
	}
	
	
	public void controllerMostrarALL() {
	    v.muestraProducto();
		String p  = t.mostrarAll();
		Controles.mensaje(p);
	}
	
	
	
	public void controllerEdit() {
		v.actualizaProducto();
		Producto p = null;
		p= t.search(Controles.leeString("Introduce el id del producto a editar"));
		String descripcion = Controles.leeString("Introduce la descripcion de la talla: ");
		String size = Controles.leeString("Introduce una de las tallas a elegir: ");
		Size talla = Enum.valueOf(Size.class, size);
		double precio = Controles.leeDouble("Introduce el precio del producto: ");
		
		p.setDescripcion(descripcion);
		p.setTalla(talla);
		p.setPrecio(precio);
	}
	
	
	public void controllerDelete() {
		v.eliminaProducto();
		t.remove(Controles.leeString("Introduce el id del producto a eliminar"));
	}
	
	public void modificaprecio() {
		v.modificaPrecio();
		Producto p = null;
		p= t.search(Controles.leeString("Introduce el id del producto a editar"));
		double precio = Controles.leeDouble("Introduce el precio del producto: ");
		p.setPrecio(precio);
	}
	
	
	
	
	
	
	
	
	
	
}
