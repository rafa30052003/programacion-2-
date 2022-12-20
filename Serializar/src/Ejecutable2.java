import model.Dato;
import utils.LocalSotorage;

public class Ejecutable2 {

	public static void main(String[] args) {
		Dato midato = LocalSotorage.read("datos.txt");
		if(midato!=null) {
			System.out.println(midato);
		}else{
			System.out.println("error en lectura");
		}

	}

}
