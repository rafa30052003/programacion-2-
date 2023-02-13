package interfaces;

import model.DTO.Bebida;

public interface iController {
	void empezar();
	void ejecutaMenuPrincipal();
	void controlaMenuPrincipal(int opcion);
	void ejecutaAnadirBebida();
	void AnadirBebida(Bebida b);
	void mostrarBebida();
}
