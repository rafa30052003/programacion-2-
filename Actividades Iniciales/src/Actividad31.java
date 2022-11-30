import java.util.Scanner;

public class Actividad31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("introduce un numero");
		int n = sc.nextInt();
		int suma= 0;
		while(n>0) {
			suma = suma +n;
			n--;
		}
		System.out.println(suma);	
			
	}
}
