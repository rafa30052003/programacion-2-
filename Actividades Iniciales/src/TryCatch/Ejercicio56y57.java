package TryCatch;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio56y57 {

	public static void main(String[] args) {
		
		
		int op1 = leeEntero("introduce el operando 1");
		int op2 = leeEntero("introduce el operando 2");
		int op3 =leeEntero("introduce el operando 3");
		System.out.println("el numero mayor es: "+ compruebaMayor(op1, op2));
		if(EsPar(op3)==true) {
			System.out.println("el numero es par");
		}
		float op4= leeFloat("introduce un numero con decimales");
		System.out.println("la parte entera es"+parteEntera(op4)+"y la parte decimal es "+parteDecimal(op4));
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
	
	
	
	//Función que recibe dos enteros y devuelve el mayor
	public static int compruebaMayor(int n1, int n2) {
		
		if(n1<n2) {
			n1=n2;
		}
		return n1;
	}
	
	
	
	//Función que recibe tres enteros y devuelve el menor
	public static int compruebaMEnor(int n1, int n2, int n3) {
		
		if(n1>n2) {
			n1=n2;
		}
		if(n1>n3) {
			n1=n3;
		}
		return n1;
	}
	
	
	
	//Función que recibe un número entero y devuelve si es par o impar (true o false).

	public static boolean EsPar(int n1) {
		int n=0;
		boolean esPar=true;
		if(n%2!=0) {
			esPar=false;
		}
		return esPar;
	}
	
	
	
	
	//Función que recibe un número decimal y devuelve su parte entera
	
	public static float parteDecimal(float n) {
		return n%1;
	}
	public static float parteEntera(float n) {
		return n-parteDecimal(n);
	}
	
	
	//Función que compara dos números, devuelve true si son iguales, false si no lo són.
		public static boolean sonIguales(int n1, int n2) {
			boolean iguales= false;
			if (n1==n2) {
				iguales =true;
			}
			return iguales;
		}
		
		
	//Función que calcula la potencia (recibe la base y el exponente).
		
		public static int calculaPotencia(int base, int expo) {
			int result=1;
			for (int i = 0; i < expo; i++) {
				result+=base;
			}
			return result;
		}
		
		
		
		
	//Función que recibe un carácter y devuelve true si es una letra y false si es otro carácter.
	
		
		public static boolean esLetra(char c) {
			boolean result = false;
			
			if ((c>='a' && c<='z')||(c>='A' && c<='Z')) {
				result=true;
			}
			return result;
		}
		
		//Calcular menor de 2 letras: Función que recibe 2 letras y devuelve la menor. 
		
		public static char MenorLetra(char c1, char c2) {
			
			if(esLetra(c1)&& esLetra(c2)) {
				if(c1>c2) {
					c1=c2;
				}
			}
			
			return c1;
		}
		//Calcula el factorial de un numero
		public static int calculaFactorial(int n) {
			int factorl=0;
			for (int i = n; i < 0; i--) {
				factorl*=i;
			}
			return factorl;
		}
		
}
