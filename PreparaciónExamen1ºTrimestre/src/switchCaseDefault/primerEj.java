package switchCaseDefault;

import java.util.Scanner;

public class primerEj {

	public static void main(String[] args) {
		
		
		muestraCalificacion(leeEntero("introduce la nota"));

	}
	
	public static void muestraCalificacion( int nota) {
		switch (nota) {
		case 0,1,2,3,4:
				System.out.println("estas suspenso");
			break;
		case 5:
				System.out.println("aprobado");
			break;
		case 6: 
				System.out.println("bien");
			break;
		case 7,8:
				System.out.println("notable");
			break;
		case 9:
				System.out.println("sobresaliente");
			break;
		case 10:
				System.out.println("matricula");
			break;
		default:
			 System.out.println("nota no valida");
			break;
		}
	}
	
	public static int leeEntero (String frase) {
		Scanner sc = new Scanner (System.in);
		boolean valid = false;
		int result = 0;
			do {
				try {
					System.out.println(frase);
					result = sc.nextInt();
					valid = true;
				} catch (Exception e) {
					System.out.println("Debe ser un entero el numero introducido");
					sc.nextLine();
				}
			}while(!valid);
		return result;
		
	}
}
