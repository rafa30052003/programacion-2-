package Array;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int [] miArray =pideArrayEnteros(3);
		muestraArray(buscaPos(miArray));
		muestraArray(buscaNeg(miArray));
		System.out.println("la media de positivos es"+ mediaArray(buscaPos(miArray)));
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
	/**
	 * cuenta los valores positivos de un array
	 * @param a: array de enteros
	 * @return : devuelve un entero con la cantidad de positivos
	 */
	public static int cuentaPos(int [] a) {
		int result =0;
			for (int i = 0; i < a.length; i++) {
				if(a[i]>0) {
					result++;
				}
			}
		return result;
	}
	/**
	 * cuenta los valores negativos de un array
	 * @param a: array de enteros
	 * @return : devuelve un entero con la cantidad de negativos
	 */
	public static int cuentaNeg(int [] a) {
		int result =0;
			for (int i = 0; i < a.length; i++) {
				if(a[i]<0) {
					result++;
				}
			}
		return result;
	}
	/**
	 * busca los numeros positivos 
	 * @param a : recive el array original
	 * @return : devuelve el array con los num pos
	 */
	public static int [] buscaPos(int[]a){
		int t = cuentaPos(a);
		int [] result = new int [t];
		int j=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>0) {
				result[j]=a[i];
				j++;
			}
		}
		return result;
		}
	/**
	 * busca los numeros negativos 
	 * @param a : recive el array original
	 * @return : devuelve el array con los num neg
	 */
	public static int [] buscaNeg(int[]a){
		int t = cuentaNeg(a);
		int [] result = new int [t];
		int j=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<0) {
				result[j]=a[i];
				j++;
			}
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
	 * Calcula la media aritmetica  de un array
	 * @param a : array 
	 * @return : la media
	 */
	public static float mediaArray(int []a) {
		float media=0;
		for (int i = 0; i < a.length; i++) {
			media+= a[i];
		}
		media = media/a.length;
		return media;
	}
}
