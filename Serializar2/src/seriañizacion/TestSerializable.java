package seriañizacion;

public class TestSerializable {

	public static void main(String[] args) {
		Contacto c = new Contacto("Juan", "j@gmail.com", "123", 10);
		Contacto c2 = new Contacto("pablo", "p@gmail.com", "124", 10);
		Agenda a = new Agenda();
		a.addContacto(c2);
		a.addContacto(c);
		if(Serializador.serializable(a, "contacto.txt")) {
			Agenda a2 = Serializador.descerializar("contacto.txt");
			System.out.println(a2);
			
		}else {
			System.out.println("nop");
		}

	}

}
