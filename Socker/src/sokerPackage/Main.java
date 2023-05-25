package sokerPackage;

import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("Arrancando el demonio");
			ServerSocket servidor = new ServerSocket(6666);
			System.out.println("Escuchando...");
			Socket cliente = servidor.accept();
			System.out.println("Cliente conectado: "+ cliente.getInetAddress().getHostAddress());
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			String frase = entrada.readLine();
			System.out.println("El cliente dice: "+ frase);
			servidor.close();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
