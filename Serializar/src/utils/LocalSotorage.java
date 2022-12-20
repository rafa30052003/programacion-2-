package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.imageio.stream.FileImageInputStream;

import model.Dato;
public class LocalSotorage {
	
	
	
	/**
	 * Metodo que serializa un objeto en un archivo.
	 * @param file: nombre del archivo.
	 * @param dato: obj a serializar.
	 * @return: true si todo lo guarda correctamente.
	 */
	public static boolean write(String file, Dato dato) {
		boolean result = false;
			File f = new File(file);
			try {
				FileOutputStream fout = new FileOutputStream(f);
				ObjectOutputStream oout = new ObjectOutputStream(fout);
				oout.writeObject(dato);
				result=true;
				oout.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		return result;
	}
	
	
	public static Dato read (String file) {
		Dato result = null;
		File f = new File(file);
		
			


			try {
				FileInputStream fin = new FileInputStream(f);
				ObjectInputStream oin = new ObjectInputStream(fin);
				result=(Dato)oin.readObject();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return result;
	}
}
