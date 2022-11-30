package PrimerosPasos;
import java.util.Scanner;

public class Actividad15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("introduce dia, mes y año");
		int dia = sc.nextInt();
		int mes = sc.nextInt();
		int ano = sc.nextInt();
		
		if (dia > 31 ) {
			System.out.println("fecha incorrecta");
		}else if (mes == 2 && dia > 28) {
			System.out.println("fecha incorrecta");
		}else if (ano<0) {
			System.out.println("fecha erronea");
		}else if (mes== 4 || mes ==6 || mes ==9 || mes==11 && dia>30) {
			System.out.println("fecha erronea");
		}else {
			System.out.println("correcto");
		}

	}

}
