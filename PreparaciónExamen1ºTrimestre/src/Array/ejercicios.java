package Array;

import java.util.Scanner;

public class ejercicios {

	public static void main(String[] args) {
		//muestraArrayIvertido(rellenaArray());
		//exite(rellenaArray(),leeEntero("introduce el numero a buscar"));
		//muestraPos("el valor maximo es",maxValor(rellenaArray()));
		//muestraPos("el valor minimo es", minValor(rellenaArray()));
		//System.out.println("la media de los pos es "+calculaMedia(buscaPos(rellenaArray())));
		//System.out.println("la media de los neg es "+calculaMedia(buscaNeg(rellenaArray())));
		//int []a={1,2,3};
		//int []b=new int[3];
		//invertArray(a, b);
		//muestraArray(b);
		String frase = "hola me llamo rafa";
		
		System.out.println(capitaliza(frase));
	}

	public static int[] rellenaArray() {
		int t = leeEntero("introduce el numero de alumnos");
		int []result = new int [t];
		for (int i = 0; i < result.length; i++) {
			result[i]=leeEntero("introduce un numero");
		}
		return result;
	}
	
	public static int leeEntero(String cadena) {
		Scanner sc = new Scanner (System.in);
		int result = 0;
		boolean valid = false;
		do {
			try {
				System.out.println(cadena);
				result = sc.nextInt();
				valid = true;
			} catch (Exception e) {
				System.out.println("numero introducido no valido");
				sc.nextLine();
			}
		}while(!valid);
		return result;
	}
	
	
	public static void muestraArrayIvertido(int[]a) {
		
		for (int i = a.length-1 ; i>=0; i--) {
			System.out.print(a[i]);
		}
	}
	
	
	

	public static void exite(int [] a,int n){
		boolean valid=false;
		for (int i = 0; i < a.length && !valid ; i++) {
			if (n==a[i]) {
				System.out.println("el numero "+n+" se encuentra en la posicion "+ i+1);
				valid=true;
			}else {
				System.out.println("el numero "+n+" no se encuentra en el array");
				valid = true;
			}
		}
	}
	
	
	public static int maxValor (int []a) {
		int max = -500000;
		int  result = 0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max=a[i];
				result=i+1;
			}
		}
		return result;
	}
	
	public static int minValor (int []a) {
		int min = 500000;
		int  result = 0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min) {
				min=a[i];
				result=i+1;
			}
		}
		return result;
	}
	
	
	
	
	public static void muestraPos(String cadena, int n) {
		System.out.println(cadena +n);
	}
	
	
	
	public static int cuentaPos(int []a) {
		int result=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>0) {
				result++;
			}
		}
		return result;
	}
	
	
	public static int cuentaNeg(int []a) {
		int result=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<0) {
				result++;
			}
		}
		return result;
	}
	
	public static int[] buscaPos(int []a) {
		int result [] = new int [cuentaPos(a)];
		int j=0;
		for (int i = 0; i < result.length; i++) {
			if(a[i]>0) {
				result[j]= a[i];
				j++;
			}
		}
		return result;
	}
	
	public static int[] buscaNeg(int []a) {
		int result [] = new int [cuentaNeg(a)];
		int j=0;
		for (int i = 0; i < result.length; i++) {
			if(a[i]<0) {
				result[j]= a[i];
				j++;
			}
		}
		return result;
	}
	
	
	public static float calculaMedia(int a[]) {
		float result = 0;
		for (int i = 0; i < a.length; i++) {
			result+=a[i];
		}
		return result/a.length;
	}
	
	
	public static int cuentaALumnos(int []a) {
		int result = 0;
			for (int i = 0; i < a.length; i++) {
				if(a[i]>calculaMedia(a)) {
					result++;
				}
			}
		return result;
	}
	
	
	public static int [] buscaAlumnos(int []a) {
		int []result = new int [cuentaALumnos(a)];
		int j = 0;
		for (int i = 0; i < result.length; i++) {
			if(a[i]>calculaMedia(a)) {
				result[j]=a[i];
				j++;
			}
		}
		return result;
	}
	
	
	public static int[] rellenaPares(int cont) {
		int []result = new int [20];
		for (int i = 0; i < result.length; i++) {
			result[i]=cont;
			cont+=2;
		}
		return result;
	}
	
	
	
	public static int [] rellenaAleatorio() {
		int upper= 9;
		int lower= 0;
		int t=leeEntero("introudce el tamaño del array");
		int [] result = new int [t];
		for (int i = 0; i < result.length; i++) {
			result[i]=(int) (Math.random() * (upper - lower)) + lower;
		}
		return result;
	}
	
	public static int sumaArray(int []a) {
		int result=0;
		for (int i = 0; i < a.length; i++) {
			result+=a[i];
		}
		return result;
	}
	
	
	public static boolean comaraArray(int a[], int b[]) {
		boolean result = true;
		if(a.length==b.length) {
			for (int i = 0; i < b.length && result; i++) {
				if(a[i]!=b[i]){
					result = false;
				}
				 
			}
		}else {
			result = false;
		}
		return result;
	}
	
	
	
	
	public static int buscaEntero(int []a, int n) {
		int result = -1;
		boolean valid = false;
			for (int i = 0; i < a.length && !valid; i++) {
				if(a[i]==n) {
					result = i;
					valid=true;
				}
			}
		return result;
	}
	
	
	public static int buscaCaracter (String cadena, char c) {
		int result =-1;
		boolean valid = false;
		for (int i = 0; i < cadena.length() && !valid; i++) {
			if(cadena.charAt(i)==c){
				result=i;
				valid= true;
			}
		}
		return result;
	}
	
	
	
	public static void ordenaArray(int []a) {
		boolean valid = false;
		do {
			for (int i = 0; i < a.length-1; i++) {
				if(a[i]>a[i+1]) {
					int aux=a[i];
					a[i]=a[i+1];
					a[i+1]=aux;
					valid=true;
				}
			}
		} while (!valid);
		
	}
	
	
	public static void invertArray(int[] array1,int[]array2) {
		for (int i = 0, j =  array2.length-1; i < array1.length; i++,j--) {
			array2[j]=array1[i];
			}
		
	}
	
	public static void muestraArray(int []a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	
	
	
	public static String capitaliza (String cadena) {
		
		String result= "";
		char c = ' ';
		int aux=0;
		if(cadena!=null) {
			for (int i = 0; i < cadena.length(); i++) {
				
				c=cadena.charAt(i);
				if(i==0) {
					
					c=Character.toUpperCase(c);
				}
				if(i==' ') {
					aux=i+1;
				}
				if(aux==i) {
					c=Character.toUpperCase(c);
				}
				result+=c;
			}
		}
		return result;
		
	}
	
	
	
	public static boolean buscaPalabra(String cadena, String word) {
		boolean result= false;
		int posicion= cadena.indexOf(word);
		if(cadena!=null || word !=null) {
			if(posicion!=-1) {
				System.out.println("la posicion del la palabra es" +posicion);
				result = true;
			}else {
				System.out.println("no se a encontrado la palabra");
			}
		}
		return result;
	}
	
}
