package PrimerosPasos;
import java.util.Scanner;

public class Actividad7y8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce el primer numero");
		int n1 = sc.nextInt();
		System.out.println("introduce el segundo numero");
		int n2 = sc.nextInt();
		 if (n1 >n2) {
			 System.out.println(n1+ " es el mayor");
		 }else if(n1 <n2) {
			 System.out.println(n2+" es el mayor");
		 }else {
			 System.out.println("tanto "+n1+"como"+n2+"son el mismo numero");
		 }

	}

}
