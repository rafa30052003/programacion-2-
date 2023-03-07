package ejecutable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map <Integer, String> mapa1 = new HashMap <>();
		
		mapa1.put(1, "Casillas");
		mapa1.put(15, "Ramos");
		mapa1.put(3, "pique");
		mapa1.put(4, "puyol");
		mapa1.put(11, "Capdevila");
		mapa1.put(4, "Iniesta");
		
		Iterator<Integer> it = mapa1.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println("Clave es: "+ key+" Valor-> "+mapa1.get(key));
		}
	}

}
