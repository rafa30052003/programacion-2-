package interfaces;

import model.CRUD.Biblioteca;



public interface iControllerRevistas {
	
	
	void controlaMenuRevista(Biblioteca b);
	
	void controlaAddRevista(Biblioteca b);
	
	void controlaMuestraRevista(Biblioteca b);
	
	void controlaEditRevista(Biblioteca b);
	
	void controlaDeleteRevista(Biblioteca b);
}
