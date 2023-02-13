package model;

public class Configurador {
	//Atributos de la clase
	private String url;
	private String nombreBd;
	
	//1º Variable estatica y privada para almacenar la referencia unica al onjeto
	
	private static Configurador _newinstance;
	
	// 2º Constructor privado
	
	private Configurador(String url, String nombreBd) {
		this.url=url;
		this.nombreBd=nombreBd;
	}
	
	//3º Metodo estatico y publico que llame al constructor
	
	public static Configurador getInstance(String url, String nombreBd) {
		if(_newinstance==null) {
			_newinstance= new Configurador(url, nombreBd);
					
		}
		return _newinstance;
	}
}
