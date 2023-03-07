package iesfranciscodelosrios.tratamientoXML.test;

import iesfranciscodelosrios.tratamientoXML.model.Contacto;
import iesfranciscodelosrios.tratamientoXML.util.XmlManager;

public class TestContacto {

	public static void main(String[] args) {
		Contacto c = new Contacto ("Carlos", "600000000", "c@gamil.es");
		
		if(XmlManager.writeXMl(c, "contacto.xml")) {
			System.out.println("ok");
		}else {
			System.out.println("no ok");
		}

	}

}
