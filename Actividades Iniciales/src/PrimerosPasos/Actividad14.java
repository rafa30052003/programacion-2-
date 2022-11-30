package PrimerosPasos;
import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("introduce los valores a, b, c en este orden ");
		int a = sc.nextInt();   
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int cont = (b*b)-4*a*c; // esta variable realiza el interior de la raiz para posteriormente
		
		if(a == 0) { // compruebo que a no sea 0 ya que una división negativa no exixte 
			System.out.println("error no se puede dividir entre 0");
		}else if (cont < 0){
			System.out.println("error ya que el contenido de raiz es negativa");
		
		}else {			
			 double sol1 = ( -1 * b + Math.sqrt(cont))/ 2 * a;
			 double sol2 = ( -1 * b - Math.sqrt(cont))/ 2 * a;
			 System.out.println("la solucion 1 es: "+ sol1);
			 System.out.println("la solucion 2 es: "+ sol2);
			
		}
		

	}
	
}
