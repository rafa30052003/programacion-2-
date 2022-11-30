import java.util.Scanner;

public class Actividad34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		boolean salir = false;
		do {
			System.out.println("introduce un numero entero");
			int n = sc.nextInt();
			if (n==0) {
				salir = true;
				System.out.println("has salido");
			}else {
				if(n%2 ==0) {
					System.out.println(n+" es par");
				}else {
					System.out.println(n+" es impar");
				}
				if(n<0) {
					System.out.println(n+ "es negativo");
				}else{
					System.out.println(n+" es positivo");
				}
				int cuadrado = (n*n);
				System.out.println("su cuadrado es "+ cuadrado); 
			}
			
			
		}while(!salir);
		
	}

}
