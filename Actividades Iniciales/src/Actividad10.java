import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("introduzca su edad");
		int edad = sc.nextInt();
		if(edad >=18) {
			System.out.println("eres mayor de edad");
			if(edad>=65) {
				System.out.println("además deverias juvilarte");
				
			}
		}else {
				System.out.println("eres menor");
		}
	}

}
