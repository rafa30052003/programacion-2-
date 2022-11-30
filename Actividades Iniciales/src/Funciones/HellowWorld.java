package Funciones;

public class HellowWorld {

	public static void main(String[] args) {
		System.out.println("Hellow Word");
		
		int n=5;
		int m=10;
		//usar la funcion
		imprimeSuma(n,m);
		//funcion con return
		calculaSuma(m, m);
	}
	
	//definir la funcion
	public static void imprimeSuma(int sum1,int sum2) {
		System.out.println(sum1+sum2);
	}
	public static int calculaSuma(int sum1,int sum2) {
		return sum1+sum2;
	}
}
