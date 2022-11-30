import java.util.Scanner;

public class Actividad30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("intriduce dos numeros");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if (n2>n1) {
			int aux = n1;
			n1 = n2;
			n2 = aux;
			
		}
		while (n1<=n2) {
			if(n1 %2 != 0) {
				System.out.println(n1);
			}
			n1++;
		}
	}

}
