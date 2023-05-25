package model;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EjemploLogger {
	
	static Logger milog = Logger.getLogger(EjemploLogger.class.getName());
	
	public static void main(String[] args) {
		FileHandler file = null;
		try {
			file = new FileHandler ("log.txt");
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		milog.addHandler(file);
		for (int i = 0; i < args.length; i++) {
			System.out.println(i+1);
		}
		
		milog.setLevel(Level.INFO);
		milog.log(Level.INFO,"");
		
		try {
			int a = 9/0;
		} catch (ArithmeticException e) {
			milog.severe("Dividion por 0");
		}
		
		leeArchivo("hola.txt");
	}
	
	
	public static void leeArchivo(String nombreArchivo) {
		try {
			FileReader archivo = new FileReader(nombreArchivo);
			
		} catch (Exception e) {
			milog.log(Level.SEVERE, "no se puede leer el archivo"+nombreArchivo);
			milog.severe("dividir por 0");
		}
	}
}
