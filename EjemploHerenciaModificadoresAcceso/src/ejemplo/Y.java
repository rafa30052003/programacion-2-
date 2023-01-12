package ejemplo;

public class Y extends X{
	
	public void pruebaAtributos() {
		System.out.println(a); //privado
		System.out.println(b); //sin modficador
		System.out.println(c); //protegido
		System.out.println(d); //publico
	}
}
