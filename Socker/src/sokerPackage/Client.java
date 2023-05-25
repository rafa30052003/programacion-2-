package sokerPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		try {
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Escribe una frase: ");
		String frase = teclado.readLine();
		Socket clients = new Socket("localhost", 6666);
		PrintWriter salida = new PrintWriter(clients.getOutputStream(),true);
		salida.print(frase);
		clients.close();
		} catch (Exception e) {
			// TODO: handle exception
		
	}
}
}
