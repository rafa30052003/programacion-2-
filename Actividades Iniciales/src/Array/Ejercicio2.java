package Array;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[]nums=new int [3];
		
		System.out.println("inserte varios nuemeros");
		for (int i = 0; i < nums.length; i++) {
			nums[i]=sc.nextInt();
		}
		System.out.println("introduce un numero y te indicamos la posicion en el array si este se encuentra");
		boolean encontrado= false;
		int n = sc.nextInt();
		for (int i = 0; i < nums.length && !encontrado; i++) {
			if(n==nums[i]) {
				System.out.println("la posicion del numero"+n+"es "+i);
				encontrado = true;
				
			}
		}
		if(encontrado) {
			System.out.println("el numero nu existe en el array");
		}
		

	}

}

