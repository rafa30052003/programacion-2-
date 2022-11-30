package Array;

public class FuncionVector {

	public static void main(String[] args) {
		String frase = "hola mundo bueno";
		System.out.println(capitaliza(frase));
		
		float []a1= {1,2};
		float []a2= {3,4};
		
		//muestraArray(sumaVectores(a1, a2));
	}
	
	 public static float[] sumaVectores(float[]v1, float[]v2) {
		 float [] result;
		 result = new float[2];
			 if(v1!=null && v2!=null) {
				 if(v1.length==2 && v2.length==2) {
					
					 for (int i = 0; i < v1.length; i++) {
						 result[i]=v1[i]+v2[i];
					 }
				 }
			 }

			
		 
		 return result;
	 }
	 
	 
	 
	 /**
		 * recorre un array y lo muestra
		 */
		public static void muestraArray(float []a) {
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println("");//salto de linea
			
		}
		
		
		
		
		
		
		//toLowerCase toUpperCase
		//hola me llamo pepe -> Hola Me Llamo Pepe
		public static String capitaliza (String sentence) {
			String result = "";
			char espacio = ' ';
	        int aux = 0;
			if(sentence != null) {
				for (int i = 0; i < sentence.length(); i++) {
					espacio = sentence.charAt(i);
					if(i == 0) {
						espacio=Character.toUpperCase(espacio);
					}
	                if(espacio== ' '){
	                    aux = i+1;
	                }
	                if (aux == i){
	                    espacio = Character.toUpperCase(espacio);
	                }
					result+=espacio;
				}
			}
			return result;
		}
		//buscar una palabra en la frase
		public static boolean find (String word, String sentence) {
			boolean result = false;
			int position = sentence.indexOf(word);
			if(position != -1) {
				System.out.println("la posicion del la palabra es" +position);
			}else {
				System.out.println("no se a encontrado la palabra");
			}
			return result;
		}
		
		
		
		public static void ordenaArray(int []a) {
			boolean valid =false;
			do {
				for (int i = 0; i < a.length-1; i++) {
					if(a[i]>a[i+1]) {
						int aux=a[i];
						a[i]=a[i+1];
						a[i+1]=aux;
						valid=true;
					}
				}
			}while(valid);
			
		}
}
