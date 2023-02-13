package interfaces;

import model.dataObect.Ejemplar;
import model.dataObect.Elemento;
import model.dataObect.Usuario;

public interface iBiblioteca {
	
	String muestraAllElement();
	
	boolean addElement(Elemento e);
	
	Elemento searchElememt (int cod);
	
	boolean deleteElement (Elemento e);
	
	String muestraAllUsuario();
	
	boolean addUsuario(Usuario u);
	
	Usuario searchUsuario (String dni);
	
	boolean deleteUsuario(Usuario u);
	
	boolean prestoEjemplar(Ejemplar e, Usuario u);
	
	boolean entregaEjemplar(Ejemplar e, Usuario u);
	
	String muestraAllPrestamos();
	
}
