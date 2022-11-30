package PrimerosPasos;
import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce la nota 1");
		double nota1 = sc.nextDouble();
		System.out.println("introduce la segunda nota");
		double nota2 = sc.nextDouble();
		double media = (nota1 + nota2)/ 2;
		System.out.println("su nota media es"+ media);
		
	}

}
