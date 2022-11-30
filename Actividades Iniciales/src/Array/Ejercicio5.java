package Array;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		
		int n = leeEntero("introduce el numero de alunmos");
		float [] notas = pideArrayEnteros(n);
		System.out.println("la media aritnetica es "+ mediaArray(notas));
		muestraArray(buscaPos(notas, mediaArray(notas)));
		
	}
	
	
	
	
	
	/**
	 * recorre un array y lo muestra
	 */
	public static void muestraArray(float []a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");//salto de linea
		
	}
	/**
	 * busca los numeros positivos 
	 * @param a : recive el array original
	 * @return : devuelve el array con los num pos
	 */
	public static float [] buscaPos(float[]a, float m){
		int t = cuentaPos(a,m);
		float [] result = new float [t];
		int j=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>m) {
				result[j]=a[i];
				j++;
			}
		}
		return result;
		}
	
	
	
	/**
	 * cuenta los valores positivos de un array
	 * @param a: array de enteros
	 * @return : devuelve un entero con la cantidad de positivos
	 */
	public static int cuentaPos(float [] a, float m) {
		int result =0;
			for (int i = 0; i < a.length; i++) {
				if(a[i]>m) {
					result++;
				}
			}
		return result;
	}
	
	
	
	
	/**
	 * Calcula la media aritmetica  de un array
	 * @param a : array 
	 * @return : la media
	 */
	public static float mediaArray(float []a) {
		float media=0;
		for (int i = 0; i < a.length; i++) {
			media+= a[i];
		}
		media = media/a.length;
		return media;
	}

	/**
	 * Metodo que pide los valores enteros y los almacena en un array
	 * @param t : tañanño del array
	 * @return : el array de enteros relleno
	 */
	
	public static float [] pideArrayEnteros (int t) {
		float [] result = new float[t] ;
		for (int i = 0; i < result.length; i++) {
			result[i]=leeFloat("introduce elemento "+i);
		}
		return result;
	}
	
	
	
	public static float leeFloat(String cadena) {
		Scanner sc = new Scanner (System.in);
		boolean valid = false;
		float num= 0;
		do {
			try {
				System.out.println(cadena);
				num= sc.nextFloat();
				valid= true;
			} catch (Exception e) {
				System.out.println("Debe ser un entero el numero introducido");
				sc.nextLine();
				
			}
		} while (!valid);
		
			return num;
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
