import java.util.Scanner;

public class Actividad36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n= 0;
		int aux = 0;
		do {
			System.out.println("Introduce un numero");
			 n = sc.nextInt();
			
			if (n>aux) {
				aux=n;
				
			}
			
		}while(n!=0);
		System.out.println("El numero mayor introducido es "+ aux);
	
	}		

}
