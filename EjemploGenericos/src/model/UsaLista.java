package model;

import java.io.File;
import java.nio.file.Files;

public class UsaLista {
	public static void main(String[] args) {
		Lista nombres = new Lista (4);
		
		
		nombres.add("maria");
		nombres.add("Luis");
		nombres.add("pedro");
		nombres.add("manu");
		
		
		String nombresPersona = (String) nombres.get(2);
		
		Lista archivos = new Lista(2);
		File f = new File ("Hola.txt");
		archivos.add(f);
	}
}
