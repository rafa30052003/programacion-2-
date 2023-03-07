package seriañizacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializador{
	
	
	
	
	public static <T>boolean serializable(T c, String archivo ) {
		boolean result = false;
		
		try(ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(archivo))){
			
			oout.writeObject(c);
			result = true;
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
			
		
		 
		 return result;
	}
	
	
	
	
	
	
	public static <T> T descerializar(String archivo) {
		T result = null;
		
		try(ObjectInputStream ois = new  ObjectInputStream(new FileInputStream(archivo))){
			
			result= (T)ois.readObject();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
}
