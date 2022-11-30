package PrimerosPasos;
import java.util.Scanner;

public class Actividad23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		boolean valid = false;
		do {
			System.out.println("introduce un numero ");
			int n = sc.nextInt();
			if(n>=10 && n<=99) {
				do {
					System.out.println("___ELIGE___");
					System.out.println("1-> es primo la uniddad");
					System.out.println("2-> es primo la decima");
					System.out.println("3-> ambos");
					System.out.println("0-> salir");
					int caso = sc.nextInt();
					switch (caso) {
						case 1: 
							int result = n%10;
							if(result==2 || result== 3 || result==5 || result==7) {
								System.out.println("la unidad es un numero primo"+result);
							}else {
								System.out.println("la unidad no es un numero primo"+result);

							}
							break;
						case 2:
							int result2 = n/10;
							if(result2==2 || result2== 3 || result2==5 || result2==7) {
								System.out.println("la decimas es un numero primo"+result2);
							}else {
								System.out.println("la decimas no es un numero primo"+result2);

							}
							 break;
						case 3:
							int result3 = n%10;
							if(result3==2 || result3== 3 || result3==5 || result3==7) {
								System.out.println("la unidad es un numero primo"+result3);
							}else {
								System.out.println("la unidad no es un numero primo"+result3);

							}
							int result4 = n/10;
							if(result4==2 || result4== 3 || result4==5 || result4==7) {
								System.out.println("la decimas es un numero primo"+result4);
							}else {
								System.out.println("la decimas no es un numero primo"+result4);

							}
							 break;
						case 0:
								valid = true;
							 break;
						default:
							System.out.println("valor no valido");
					}
				} while (!valid);
				
				valid = true;
			}
		}while(!valid);
		
		
	
	}
}
