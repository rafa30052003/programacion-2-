package PrimerosPasos;
import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("introduce tu edad ");
		int edad= sc.nextInt();
		if(edad >= 18) {
			System.out.println("eres mayor de edad");
		}else {
			System.out.println("eres menor de edad");
		}

	}

}
