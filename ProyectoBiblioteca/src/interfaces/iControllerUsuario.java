package interfaces;

import model.CRUD.Biblioteca;


public interface iControllerUsuario {
	
	
	void controlaMenuUsuario(Biblioteca b);
	
	void controlaAddUsuario(Biblioteca b);
	
	void controlaMuestraUsuario(Biblioteca b);
	
	void controlaEditUsuario(Biblioteca b);
	
	void controlaDeleteUsuario(Biblioteca b);
	
}
