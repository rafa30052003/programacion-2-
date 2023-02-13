package model.CRUD;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import interfaces.iBiblioteca;
import model.dataObect.Ejemplar;
import model.dataObect.Elemento;
import model.dataObect.Prestamo;
import model.dataObect.Usuario;
import utils.Controles;

public class Biblioteca implements iBiblioteca {
	List<Prestamo> prestamos = new ArrayList<>();
	ArrayList<Elemento> miselementos = new ArrayList<>();
	ArrayList<Usuario> misusuarios = new ArrayList<>();
	
	
	
	/**
	 * Funcion que muestra todos los elementos de la biblioteca
	 * @return el toString de los elementos
	 */
	@Override
	 public String muestraAllElement() {
		String result = "";
		
		 for(Elemento element : miselementos) {
			
			 result+=element+"\n\n\n";	
		 }
		 return result;
	 }
	/**
	 * Funcion que añade los elementos a la biblioteca
	 * @return un boolean que valida si el elemento se a añadido
	 */
	@Override
	public boolean addElement(Elemento e) {
		boolean valid = false;
		if(!miselementos.contains(e) && searchElememt(e.getCod())==null) {
			miselementos.add(e);	
			valid = true;
			
		}else {
			Controles.mensaje("\nError. Lo estas insertado mal");
		}
		return valid;
	}
	/**
	 * Funcion que busca al elemento por el codigo
	 * @return : el elemento en cuestion
	 */
	@Override
	public Elemento searchElememt(int cod) {
		Elemento e = null;
		
			for(Elemento element : miselementos) {
				if(element.getCod()==cod) {
					e=element;
				}
			}
	
		
				
		return e;
	}
	/**
	 * Funcion que elimina el elemento
	 * @return boolean valid si el elemento esta eliminado o no
	 */
	@Override
	public boolean deleteElement(Elemento e) {
		boolean valid = false;
		if(miselementos.contains(e)) {
			miselementos.remove(e);
			valid = true;
		}else {
			Controles.mensaje("Error. Lo estas eliminando mal");
		}
		return valid;
	}
	
	
	/**
	 * Funcion que muestra todos los usuarios de la biblioteca
	 * @return el toString de los usuarios
	 */
	@Override
	 public String muestraAllUsuario() {
		 String result = "";
		 for(Usuario user : misusuarios) {
			
				 
				 result+=user+"\n\n\n";
			 
			
		 }
		 return result;
	 }
	/**
	 * Funcion que añade los usuarios a la biblioteca
	 * @return un boolean que valida si el usuario se a añadido
	 */
	@Override
	public boolean addUsuario(Usuario u) {
		boolean valid = false;
		if(!misusuarios.contains(u)) {
			misusuarios.add(u);
			valid = true;
		}else {
			Controles.mensaje("Error. Lo estas añadiendo mal");
		}
		return valid;
	}
	/**
	 * Funcion que busca al usuario por el codigo
	 * @return : el usuario en cuestion
	 */
	@Override
	public Usuario searchUsuario(String dni) {
		Usuario u = null;
		if(!misusuarios.isEmpty()) {
			for(Usuario user : misusuarios) {
				if(user.getDni().equals(dni)) {
					u=user;
				}
			}
		}else {
			Controles.mensaje("LA LISTA ESTA VACIA");
		}
		
		return u;
	}
	/**
	 * Funcion que elimina el usuario
	 * @return boolean valid si el usuario esta eliminado o no
	 */
	@Override
	public boolean deleteUsuario(Usuario u) {
		boolean valid = false;
		if(misusuarios.contains(u)) {
			misusuarios.remove(u);
			valid = true;
		}else {
			Controles.mensaje("Error. Lo estas eliminando mal");
		}
		return valid;
	}
	/**
	 * Funcion que presta un ejemplar a un usuario
	 * @return valid : si el ejemplar esta prestado o no
	 */
	@Override
	public boolean prestoEjemplar(Ejemplar e, Usuario u) {
		boolean valid = true;
		if(e.isPrestado()) {
			valid = false;
		}
		Prestamo p = new Prestamo(e, u);
		this.prestamos.add(p);
		e.setPrestado(true);
		e.setfPrest(LocalDate.now());
		return valid;
	}
	
	
	/**
	 * Funcion que entrga el ejemplar a la biblioteca
	 * @return valid : si el ejemplar a sido devuelto o no
	 */
	@Override
	public boolean entregaEjemplar(Ejemplar e, Usuario u) {
		Prestamo p = new Prestamo(e,u);
		if(!this.prestamos.contains(p)) {
			return false;
		}
		this.prestamos.remove(p);
		int i = this.miselementos.indexOf(e);
		if(i>=0) {
			Ejemplar ej=(Ejemplar)(this.miselementos.get(i));
			ej.setPrestado(false);
		}
		return true;
		
	}
	/**
	 * Funcion que muestra todos los prestamos de nuestra biblioteca
	 * @return to String de nuestros prestamos
	 */
	@Override
	public String muestraAllPrestamos() {
		String result = " ";
		for(Prestamo prest : prestamos) {
			if(prest!=null) {
				result+=prest+"\n\n\n";
			}
		
		}
		return result;
	}
	
}
