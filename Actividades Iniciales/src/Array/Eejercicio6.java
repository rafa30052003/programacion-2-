package Array;

public class Eejercicio6 {

	public static void main(String[] args) {
		int [] miarray = almacenaPares(2);
		muestraArray(miarray);
	}
	
	
	/**
	 * almacena los primeros 20 numeros pares.
	 * @param cont: contador que va sumando de 2 en 2 (num pares).
	 * @return: el array con los numeros pares del contador almacenados.
	 */
	public static int [] almacenaPares(int cont) {
		int [] result = new int [20];
		for (int i = 0; i < result.length; i++) {
			result[i]=cont;
			cont+=2;
			
		}
		return result;
	}
	/**
	 * recorre un array y lo muestra
	 */
	public static void muestraArray(int []a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");//salto de linea
		
	}
	
}
