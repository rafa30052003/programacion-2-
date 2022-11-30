package PrimerosPasos;
import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("introduce el largo de la pared");
		double largo = sc.nextDouble();
		System.out.println("introduce el alto de la pared");
		double alto = sc.nextDouble();
		
		double area = largo * alto;
		double arena = area * 0.05;
		System.out.println("los metros cubicos necesarios son "+arena); 

	}

}
