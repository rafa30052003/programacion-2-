  package ejecutable;

import java.util.ArrayList;
import java.util.Iterator;

import model.DataObject.Alumno;

public class Principal {
	public static void main(String[] args) {
		ArrayList<Alumno> clase = new ArrayList <>();
		
		Alumno a1 = new Alumno ("Pedro", 8);
		Alumno a2 = new Alumno ("Ana", 6);
		Alumno a3 = new Alumno ("Maria", 9);
		Alumno a4 = new Alumno ("Luis", 7);
		
		clase.add(a1);
		clase.add(a2);
		clase.add(a3);
		clase.add(0, a4);// este metodo limita al tamaño que tenga el arrayList en ese momento
		
		System.out.println(clase);
		System.out.println("mi numero de elementos es: "+clase.size());
		
		clase.remove(a4);
		
		System.out.println(clase);
		System.out.println("mi numero de elementos es: "+clase.size());
		
		System.out.println(clase.contains(a3));
		Alumno a5 = new Alumno ("Ana", 6);
		System.out.println(clase.contains(a5));
		
		clase.add(a4);
		
		//recorrer la coleccion
		
		for(Alumno aux : clase) {
			System.out.println("Nombre :"+aux.getNombre()+" nota: "+aux.getNota());
		}
		// Forma 2 . Iterador
		
		Iterator<Alumno> it= clase.iterator();
		while (it.hasNext()) {
			Alumno aux = it.next();
			System.out.println("nombre "+ aux.getNombre());
			System.out.println("nota "+ aux.getNota());
			
		}
	}
}
