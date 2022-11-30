package TryCatch;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n=-1;
		System.out.println("inserte un numero: ");
		try {
			n = sc.nextInt();
		} catch (Exception e) {
			//System.out.println("no has introducido un entero por eso el valor de n es: "+n);
			e.printStackTrace();
		}
		
		System.out.println("el cuadrado de n es "+(n*n));
	}

}
