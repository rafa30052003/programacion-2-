package PrimerosPasos;
import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("introduce la medida del lado");
		int lado = sc.nextInt();
		int perimetro= 4 * lado;
		int area = lado * lado;
		System.out.println("el perimetro es"+ perimetro+"el area es"+ area);
	}

}
