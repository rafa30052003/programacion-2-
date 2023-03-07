package model.DAO;

import java.util.HashMap;
import java.util.Map;

import GUI.Controles;
import model.dataObject.Producto;

public class Tienda {
	Map <String, Producto> mitienda = new HashMap<>();
	
	
	
	/**
	 * Funcion que añade a la coleccion HashMap
	 * @param p: objeto a añadir
	 * @return boolean que comprueba si se ha añadido bien o no 
	 */
	public boolean add(Producto p , String key) {
		boolean valid = false;
		if(!mitienda.containsKey(key)) {
			mitienda.put(key, p);
			valid=true;
			Controles.mensaje("se ha anadido correctamente");
		}else {
			Controles.mensaje("a ocurrido un error");
		}
		return valid;
	}
	
	
	/**
	 * Funcion que muestra todos los procuctos de la coleccion
	 * @return String que imprlime los productos
	 */
	public String mostrarAll() {
		String result = "";
		for(Producto p : mitienda.values()) {
			result+=p+"\n\n";
		}
		return result;
	}
	
	
	public boolean remove(String key) {
		boolean valid = false;
		if(mitienda.containsKey(key)) {
			mitienda.remove(key);
			valid=true;
			Controles.mensaje("se ha eliminado correctamente");
		}else {
			Controles.mensaje("a ocurrido un error");
		}
		
		return valid;
	}
	
	
	public Producto search(String key) {
		Producto result = null;
		
		if(!mitienda.isEmpty()) {
			for(Producto p : mitienda.values()) {
				if(p.getId().equals(key)) {
					result= p;
				}else {
					Controles.mensaje("a ocurrido un error");
				}
			}
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
