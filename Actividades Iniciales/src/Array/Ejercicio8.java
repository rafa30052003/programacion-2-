package Array;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int n = leeEntero("introduce el tamaño");
		int [] miArray=rellenaAleatorio(n);
		muestraArray(miArray);
		System.out.println("la suma de los valores del array es: "+sumaArray(miArray));
	}
	
	
	
	/**
	 * metodo que suma los valores del array
	 * @param a: el array
	 * @return: la suma
	 */
	public static int sumaArray (int[]a) {
		int result=0;
		for (int i = 0; i < a.length; i++) {
			result+=a[i];
		}
		return result;
	}
	
	
	
	/**
	 * recorre un array y lo muestra
	 */
	public static void muestraArray(int []a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");//salto de linea
		
	}
	
	
	/**
	 * metodo que rellena aleatoriamente un array entre un valor maximo y minimo.
	 * @param t; tamaño del array
	 * @return array relleno
	 */
	private static int [] rellenaAleatorio(int t) {
		int [] result = new int [t];
		int max=9;
		int min=0;
		for (int i = 0; i < result.length; i++) {
			int r = (int) (Math.random() * (max - min)) + min;
			result[i]=r;
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
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

