package interfaces;

import model.CRUD.Biblioteca;

public interface iControllerPrestamo {
	public void controllerMenuPrestamo(Biblioteca b);
	
	public void controlaAddPrestamo(Biblioteca b);
	
	public void controlaDevuelvePrestamo(Biblioteca b);
	
	public void controlaMuestraAll(Biblioteca b);
	
}
