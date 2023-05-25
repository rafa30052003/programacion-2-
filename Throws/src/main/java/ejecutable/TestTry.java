package ejecutable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class TestTry {

	public static void main(String[] args) {
		

	}
	
	
	public static Set<String> readWords(String fileName){
		Set <String> words = new HashSet<>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String line = reader.readLine();
			while(line!= null) {
				String[] lineWords = line.split(",");
				for(String word : lineWords) {
					words.add(word.trim());
				}
				line = reader.readLine();
				
			}
			reader.close();
		}catch (Exception e) {
			System.out.println("Error reading file. "+ e.getMessage());
		}
		return words;
	}
	
	
	
	
	
	
	public static Set<String> readWords2(String fileName){
		Set <String> words = new HashSet<>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
			
			String line = reader.readLine();
			while(line!= null) {
				String[] lineWords = line.split(",");
				for(String word : lineWords) {
					words.add(word.trim());
				}
				line = reader.readLine();
				
			}
			
		}catch (Exception e) {
			System.out.println("Error reading file. "+ e.getMessage());
		}
		return words;
	}
	
	
	
	/**
	 * 
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public static Set<String> readWords3(String fileName) throws IOException{
		Set <String> words = new HashSet<>();
		
		
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String line = reader.readLine();
			while(line!= null) {
				String[] lineWords = line.split(",");
				for(String word : lineWords) {
					words.add(word.trim());
				}
				line = reader.readLine();
				
			}
			reader.close();
	
		return words;
	}
	
	
	
}
