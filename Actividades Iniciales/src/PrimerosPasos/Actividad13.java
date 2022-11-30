package PrimerosPasos;
import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double descuento = 0.00;
		char metodoPago = 'c'; // c = contado / t  = targeta / o = otros metodos
		
		System.out.println("introduce importe de la compra");
		float compra = sc.nextFloat();
		System.out.println("introduce metodo de pago -> c = contado; t = targeta; o = otro metodo");
		
		if(compra >= 500 && metodoPago == 'c') {
			descuento = compra * 0.10;
		}
		System.out.println("el importe final es "+ (compra - descuento)+ "descuneto"+ descuento);
	}

}	
