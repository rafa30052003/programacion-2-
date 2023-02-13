package principal;

import java.util.Scanner;

import model.Profesor;
import model.ProfesorFuncionario;
import model.ProfesorInterino;

public class Ejecutable {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int nProfes =3;
		//pide por teclado
		
		Profesor [] profes = new Profesor[nProfes];
		for (int i = 0; i < profes.length; i++) {
			System.out.println("Es interino (S/N)");
			String respuesta = sc.nextLine();
			System.out.println("Nombre: ");
			String nombre= sc.nextLine();
			System.out.println("Apellidos: ");
			String apellidos = sc.nextLine();
			System.out.println("Edad: ");
			int edad = sc.nextInt();
			System.out.println("Identificador. ");
			String id = sc.nextLine();
			
			
			if(respuesta.equals("S")) {
				System.out.println("Tiempo de Servicio: ");
				float ts = sc.nextFloat();
				ProfesorInterino p = new ProfesorInterino(nombre, apellidos, edad, ts);
				p.setIDProfesor(id);
				if(existeProfe(p, profes)) {
					addProfe(p, profes);
				}
			}else {
				System.out.println("Destino: ");
				String destino = sc.nextLine();
				ProfesorFuncionario p = new ProfesorFuncionario(nombre, apellidos, edad, destino);
				p.setIDProfesor(id);
				if(existeProfe(p, profes)) {
					addProfe(p, profes);
				}
			}
			
		}

	}
	public static boolean existeProfe(Profesor p, Profesor [] profes) {
		boolean result= false; 
		for (Profesor profe:profes) {
			if(profe.equals(p)) {
				result=true;
			}
		}
		return result;
	}
	
	public static boolean addProfe(Profesor p, Profesor [] profes) {
		boolean result = false;
		for (int i = 0; i < profes.length && i<profes.length; i++) {
			if(profes[i]==null) {
				profes[i]=p;
				result= true;
			}
		}
		return result;
	}
	
	
	
	public static int cuentaInter (Profesor []profes) {
		int result = 0;
		return result;
	}
}
