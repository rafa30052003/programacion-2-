package interfaces;

import model.DTO.Bebida;

public interface iRepo {
	boolean anadirBebida(Bebida b);
	String mostrarBebida();
}
