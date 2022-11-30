
import model.Estudiante;

public class Ejecutable {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante();
		Estudiante e2 = new Estudiante("1234E","Carlos","carlos@gmail.com","456765456");
		Estudiante e3 = new Estudiante("1234E","maria","maria@gmail.com","57483737373");
		System.out.println(e2.equals(e3));
		
	}

}
