import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestReader {

	public static void main(String[] args) {
		String frase;
		if(args.length>1) {
			frase=args[1];
		}else {
			frase = "hola mundo";
		}
		
		
		try(FileWriter f = new FileWriter("texto.txt")){
			f.write(frase);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		try(FileReader r = new FileReader("texto.txt")){
			char[] caracteres = new char [256] ;
			if(r.read(caracteres)!=-1) {
				
			}else {
				System.out.println("hasta que leer");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
