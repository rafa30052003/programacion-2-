package iesfranciscodelosrios.tratamientoXML.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import iesfranciscodelosrios.tratamientoXML.model.Contacto;

public class XmlManager {
	
	public static boolean writeXMl(Contacto c, String fichero ) {
		boolean result = false;
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(Contacto.class);
			Marshaller m = context.createMarshaller();
			//formatear xml
			m.marshal(m, new FileOutputStream(fichero));
			result = true;
		} catch (JAXBException e) {
			
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return result;
	}
}
