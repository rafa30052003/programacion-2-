import model.Dato;
import utils.LocalSotorage;

public class Ejecutable {

	public static void main(String[] args) {
		
		Dato dato = new Dato("Juan", "1234");
		  //guardar dato archivo
		if (LocalSotorage.write("dato.txt", dato)) {
			System.err.println("guardado correctamente");
		}else {
			System.out.println("no guardado");
		}
		
		
		
			//leer dato archivo
	}

}
