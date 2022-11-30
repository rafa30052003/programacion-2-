package PrimerosPasos;
import java.util.Scanner;

public class Actividad26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		boolean salir = false;
		do {
			System.out.println("____Elige que quieres calcular____");
			System.out.println("1-> area de la circunferencia");
			System.out.println("2-> perimetro de la circunferencia");
			System.out.println("0-> salir");
			int valor = sc.nextInt();
			switch(valor){
			case 1 : 
				System.out.println("introduce el radio de la circunferencia");
				int radio= sc.nextInt();
				double area = 3.14 * (radio*radio);
				System.out.println(area);
				break;
			case 2 : 
				System.out.println("introduce el radio de la circunferencia");
				int radio2= sc.nextInt();
				double perimetro = 2 * 3.14 * radio2;
				System.out.println(perimetro);
				break;
			case 0 :
				salir = true;
				break;
			default :
				System.out.println("valor no valido");
				
			}
		}while(!salir);
 
	}

}
