package Funciones;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		menu();
	}
	
	
	
	
	
	public static void menu() {
		
		Scanner sc = new Scanner (System.in);
		boolean salir=false;
		
		do {
			System.out.println("introduce dos numeros:");
			float n1=sc.nextFloat();
			float n2 = sc.nextFloat();
			System.out.println("_____BIENVENIDO____");
			System.out.println("Introduce una opción: ");
			System.out.println("1 -> sumar");
			System.out.println("2 -> restar");
			System.out.println("3 -> multiplicar");
			System.out.println("4 -> dividir");
			System.out.println("0-> salir");
			int valor= sc.nextInt();
			
			switch (valor) {
				case 1: 
					imprimeValor(suma(n1, n2), " es el resultado de la suma");
					break;
				case 2: 
					imprimeValor(resta(n1, n2)," es el resultado de la resta");
					break;
				case 3:
					imprimeValor(multipl(n1, n2)," es el resultado de la multiplicacion");
					break;
				case 4: 
					imprimeValor(div(n1, n2)," es el resultado de la division");
					break;
				case 0: 
					System.out.println("has salido");
					salir = true;
					break;
				default: 
					System.out.println("ERROR");
			}
		}while(!salir);
		
	}
	
	
	public static float suma(float num1,float num2) {
		return  num1 + num2;
	}
	
	
	public static float resta(float num1,float num2) {
		return  num1 - num2;
	}
	
	
	public static float multipl(float num1,float num2) {
		return  num1 * num2;
	}
	
	
	public static float div(float num1,float num2) {
		return num1 / num2;
	}
	
	
	public static void imprimeValor(float valor, String cadena) {
		System.out.println(valor+cadena);
	}
}
