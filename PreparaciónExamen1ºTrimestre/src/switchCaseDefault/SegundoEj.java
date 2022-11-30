package switchCaseDefault;

import java.util.Scanner;

public class SegundoEj {

	public static void main(String[] args) {
		boolean valid = false;
		float radio;
		
		do {
			System.out.println("____________BIENVENIDO____________");
			System.out.println("1-> area de la circunferencia");
			System.out.println("2-> perimetro de la circunferencia");
			System.out.println("0-> salir");
			int valor =leeEntero("introduzaca la opción que quiera usar");
			switch (valor) {
			case 1:
					radio= leeFloat("Introduzca el radio de la circunferencia");
					System.out.println("el area de su circunferencia va a ser "+ 3.14 * (radio*radio));
				break;
			case 2:
					radio= leeFloat("Introduzca el radio de la circunferencia");
					System.out.println("el perimetro de su circunferencia va a ser "+ 2 * 3.14 * radio);
				break;
			case 0:
					System.out.println("gracias por usarme");
					valid= true;
				
					break;

			default:
					System.out.println("opción no existente");
				break;
			}
			
		}while(!valid);

	}
	
	public static float leeFloat(String cadena) {
		Scanner sc = new Scanner (System.in);
		float result=0;
		boolean valid = false;
		do {
			try {
				System.out.println(cadena);
				result= sc.nextFloat();
				valid = true;
			} catch (Exception e) {
				System.out.println("numero introducido no valido");
				sc.nextLine();
			}
		}while(!valid);
		return result;
	}
	
	public static int leeEntero(String cadena) {
		Scanner sc = new Scanner (System.in);
		int result=0;
		boolean valid = false;
		do {
			try {
				System.out.println(cadena);
				result= sc.nextInt();
				valid = true;
			} catch (Exception e) {
				System.out.println("numero introducido no valido");
				sc.nextLine();
			}
		}while(!valid);
		return result;
	}
}
