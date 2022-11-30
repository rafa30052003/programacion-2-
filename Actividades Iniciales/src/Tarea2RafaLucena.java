import java.util.Scanner;

public class Tarea2RafaLucena {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		boolean salir = false;
		int altr =  0;
		int mayor = 0;
		int menor = 5000000;
		int media = 0;
		int mediaFinal=0;
		do {
			System.out.println("____BIENVENIDO____");
			System.out.println("1 -> Introducir datos");
			System.out.println("2 -> Media altura");
			System.out.println("3 -> Mayor altura");
			System.out.println("4 -> Menor altura");
			System.out.println("0 -> Salir");
			
			int valor = sc.nextInt();
			switch (valor) {
			case 1:
				
				System.out.println("Introduzca el numero de participantes");
				int partc = sc.nextInt();
				System.out.println("Introduce su altura");
				for (int i = 0; i < partc; i++) {
				
					
					 int aux= sc.nextInt();
					if (aux>mayor) {
						mayor=aux;
					}
					if(aux<menor) {
						menor=aux;
					}
					
					media=media+aux;
				}
				
				mediaFinal=media/partc;
				
			break;	
			case 2:
				
				if(mediaFinal==0) {
					System.out.println("tienes que introducir los datos");
				}else {
					System.out.println("la media es "+ mediaFinal);
				}
				
			break;
			case 3:
				if(mayor==0) {
					System.out.println("tienes que introducir los datos");
				}else {
					System.out.println(mayor);
				}
				
			break;
			case 4:
				if(menor==5000000 && menor==0) {
					System.out.println("tienes que introducir los datos");
				}else {
					System.out.println(menor);
				}
				
			break;
			case 0:
				System.out.println("Has salido");
				salir = true;
			break;
			default:
				System.out.println("valor erroneo");
				
			}
			
		}while(!salir);

	}

}
