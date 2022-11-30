package PrimerosPasos;
import java.util.Scanner;

public class Actividad14part2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("introduce tres numeros");
		int n1= sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if (n1 > n2 && n1 > n3 ) {
			if (n2 > n3) {
				System.out.println("el orden es"+ n1+n2+n3);
			}else {
				System.out.println("el orden es"+ n1+n3+n2);
			}
		}else if(n2 > n2 && n2 > n3) {
			if (n1 > n3) {
				System.out.println("el orden es"+ n2+n1+n3);
			}else {
				System.out.println("el orden es"+ n2+n3+n1);
			}
		}else {
			if (n1 > n2) {
				System.out.println("el orden es"+ n3+n1+n2);
			}else {
				System.out.println("el orden es"+ n3+n2+n1);
			}
		}
	}

}
