package Array;

import java.util.Scanner;

public class DNI {

	public static void main(String[] args) {
		String numero = leeNumeroDNI("inserte su dni");
		char letra= calculaLetraDNI(numero);
		System.out.println("la letra del dni "+numero+" es "+letra);
	}
	public static char calculaLetraDNI(String numeroDNI) {
		char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		char letra = letras [Integer.valueOf(numeroDNI)%23];
		return letra;
		
	}
	
	
	
	public static String leeNumeroDNI(String f) {
		
		Scanner sc = new Scanner (System.in);
		String result="";
		boolean valid = false;
		do {
			boolean error = false;
			System.out.println("");
			result = sc.nextLine();
			
			if(result.length()!=8) {
			 error = true;
			}else {
				for (int i = 0; i < result.length() && !error; i++) {
					if(esNumero(result.charAt(i))) {
						error = true;
					}
					
				}
			}
			if(error) {
				System.out.println("numero no valido");
			}else {
				valid=true;
			}
		}while(!valid);
		return result;
	}
	
	
	
	public static boolean esNumero(char c) {
		boolean valid = false;
		if (c<='9'&& c>='0') {
			valid = true;
		}
		return valid;
	}
}
