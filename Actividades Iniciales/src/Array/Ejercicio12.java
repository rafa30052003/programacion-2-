package Array;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		int [] miArray= {3,4,5,7,8,3};
		int valor= leeEntero("introduce el valor a buscar: ");
		System.out.println("la posicion en el array del numero "+valor+" es: "+ find(valor, miArray));
		
	}
	/**
	 * Busca el valor introducido en el array, en el caso de que no se encuentre devuelve -1.
	 * @param n : el nuemero a buscar.
	 * @param a: array donde busca.
	 * @return: el numero entcontrado o en su defecto -1.
	 */
	public static int find(int n, int[]a) {
		boolean valid = false;
		int result=-1;
		for (int i = 0; i < a.length && !valid; i++) {
			if(n==a[i]) {
				result=i;
				valid = true;
			}
		}
		return result;
	}
	
	
	
	
	public static int leeEntero(String cadena) {
		Scanner sc = new Scanner (System.in);
		boolean valid = false;
		int num= 0;
		do {
			try {
				System.out.println(cadena);
				num= sc.nextInt();
				valid= true;
			} catch (Exception e) {
				System.out.println("Debe ser un entero el numero introducido");
				sc.nextLine();
				
			}
		} while (!valid);
		
			return num;
	}
	
	
	/**
	 * Busca el caracter introducido en el array, en el caso de que no se encuentre devuelve -1.
	 * @param n : el nuemero a buscar.
	 * @param a: array donde busca.
	 * @return: el numero entcontrado o en su defecto -1.
	 */
	public static int find(char c, String frase) {
		boolean valid = false;
		char result='0';
		if(frase!=null){
			for (char i = 0; i < frase.length() && !valid; i++) {
				if(c==frase.charAt(i)) {
					result=i;
					valid = true;
				}
			}
		
		}
		return result;
	}
}
