import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("introduce tus ingresos en ventas");
		double ingresos = sc.nextDouble();
		double comision = 0.00;
		 if(ingresos > 500000.00) {
			 comision = ingresos * 0.10;
			 System.out.println(comision);
		 }else if (ingresos >= 200000.00 && ingresos<=500000.00) {
			 comision = ingresos * 0.07;
			 System.out.println(comision);

		 }else {
			 System.out.println("no tienes comision");
		 }
			 
	}

}
