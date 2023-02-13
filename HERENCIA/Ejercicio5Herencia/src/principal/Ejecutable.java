package principal;

import model.Hora;
import model.HoraExacta;

public class Ejecutable {

	public static void main(String[] args) {
		Hora h = new Hora(20,50);
		System.out.println(h);
		for (int i = 0; i < 61; i++) {
			h.inc();
		}
		System.out.println(h);
		
		HoraExacta x = new HoraExacta(20,50,25);
		System.out.println(x);
	}
	
}
