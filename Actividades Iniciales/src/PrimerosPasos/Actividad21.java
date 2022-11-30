package PrimerosPasos;
import java.util.Scanner;

public class Actividad21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("introduzca su nota");
		int nota = sc.nextInt();
		
		if(nota >=0 && nota < 5) {
			System.out.println("suspenso");
		}else if(nota == 5) {
			System.out.println("Aprobado");
		}else if(nota == 6) {
			System.out.println("bien");
		}else if(nota==7 || nota == 8) {
			System.out.println("notable");
		}else if (nota==9) {
			System.out.println("sobresaliente");
		}else if(nota==10) {
			System.out.println("matricula");
		}else {
			System.out.println("error");
		}
	}

}
