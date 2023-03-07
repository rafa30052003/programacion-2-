import java.io.File;
import java.io.IOException;

public class TextFile {

	public static void main(String[] args) {
		File f = new File("archivo.txt");
		if(f.exists()) {
			System.out.println("existe");
			if(f.isDirectory()) {
				File[] files = f.listFiles();
				for(File file : files) {
					if(file.isDirectory()) {
						System.out.println("D-->"+file.getName());
					}else {
						System.out.println(file.getName());
					}
				}
			}
		}else {
			System.out.println("no existe");
			try {
				if(f.createNewFile()) {
					System.out.println("creado ok");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
