package Array;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int [] miArray =pideArrayEnteros(3);
		
		muestraValor("el valor mayor es", encuetraMayor(miArray));
		
		
		
	}
	
	
	public static void muestraValor(String c, int a) {
		
		System.out.println(""+a);
	}
	
	
	
	
	
	
	
	/**
	 * Encuentra el numero menor en el array
	 * @param a : recive el array a encontrar
	 * @max : parametro que indica una posicion menor provisional  
	 * @return : devuelve la posicion menor
	 */
	public static int encuetraMenor(int [] a) {
		int min=50000000;
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<=min) {
				min=a[i];
				result=1+i;
				
			}
		}
		return result;
	}
	
	
	
	
	
	
	/**
	 * Encuentra el numero mayor en el array
	 * @param a : recive el array a encontrar
	 * @max : parametro que indica una posicion mayor provisional  
	 * @return : devuelve la posicion mayor
	 */
	public static int encuetraMayor(int [] a) {
		
		int max=-1;
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>=max) {
				max=a[i];
				result=1+i;
			}
		}
		return result;
	}
	

	/**
	 * Metodo que pide los valores enteros y los almacena en un array
	 * @param t : tañanño del array
	 * @return : el array de enteros relleno
	 */
	
	public static int [] pideArrayEnteros (int t) {
		int [] result = new int[t] ;
		for (int i = 0; i < result.length; i++) {
			result[i]=leeEntero("introduce elemento "+i);
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
