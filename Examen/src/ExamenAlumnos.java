
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class ExamenAlumnos {
	public static void main(String[] args) {
		int option = -1;

		do {
			option = printMenu();
			operate(option); //EJERCICIO 1

		} while (option != 0);

	}

	/**
	 * M�todo que imprime el men� principal
	 * @return la opci�n elegida
	 */
	public static int printMenu() {
		int opcion = -1;
		System.out.println("\n\n*** MEN� ***");
		System.out.println("1. Pintar Pir�mide");
		System.out.println("2. Encuesta de edades");
		System.out.println("0. Salir");
		opcion = readInt("Introduce opci�n: ", 0, 2);
		return opcion;
	}
	
	//EJERCICIO 1: Escribe el c�digo del m�todo operate, siguiendo las instrucciones del comentario.
	
	/**
	 * M�todo operate: que recibe la opci�n elegida por el usuario en el men�
	 * y realiza la operaci�n correspondiente a la opci�n. Opci�n 1: llamada al m�todo pyramid().
	 * Opci�n 2: llamada al m�todo stadistic()
	 * @param option: opci�n elegida en el men�.
	 */
	
	public static void operate (int n) {
		switch (n) {
		case 1:
			
			pyramid();
			break;
		case 2:
			
			stadistic();
			break;
		case 0:
			 System.out.println("Has decidido salir");
			break;
		default:
			System.out.println("opcion introducida incorrecta.");
			break;
		}
	}
	
	
	
	
	
	
	
	
	/**
	 * M�todo pyramid(): m�todo que desarrolla el c�digo que se ejecuta 
	 * cuando el usuario elige la opci�n 1 en el men�, pintar pir�mide 
	 */
	public static void pyramid() {
		System.out.println("OPCION 1: PINTAR PIR�MIDE ");
		int size = readInt("\nIntroduce tama�o de la pir�mide (entre 3 y 9):", 3, 9); //Ejercicio 2
		int[] arrPyramid = fillArray(size);
		paintPyramid(arrPyramid); //Ejercicio 3
		System.out.println();
	}

	/**
	 * M�todo stadistic(): m�todo que desarrolla el c�digo que se ejecuta 
	 * cuando el usuario elige la opci�n 2 en el men�, Encuesta de edades
	 */
	public static void stadistic() {
		System.out.println("OPCI�N 1: ENCUESTA DE EDADES ");
		
		//AL HACER EJERCICIO 2 SOLUCIONAS ESTOS ERRORES
		int n = readInt("\nIntroduce n�mero de participantes en la encuesta (entre 0 y 50):", 0, 50);
		int ageMin = readInt("Introduce edad m�nima para participar en la encuesta: ", 0, 120);
		int ageMax = readInt("Introduce edad m�xima para participar en la encuesta: ", 0, 120);

		System.out.println("\nPARTICIPAN " + n + " PERSONAS EN LA ENCUESTA, INTRODUCE SUS EDADES: \n");
		
		//al hacer EJERCICIO 4 SOLUCIONAS ESTE ERROR
		int[] ages = fillAges(n, ageMin, ageMax);
		
		//EJERCICIO 5
		double middleAge = middle(ages);
		System.out.printf("\n ** LA EDAD MEDIA DE LOS PARTICIPANTES ES: %.2f\n", middleAge);
		
		// EJERCICIO 7
		printArray("\n Las edades superiores a la media son: ", fillGreater(ages, middleAge));
	}
	
	

	// EJERCICIO2: Escribe el m�todo readInt, usado en varios partes del programa. 
	// 			   Se valora el uso de control de excepciones y bucles.
	//			   Sigue las instrucciones de los comentarios.
	// Criterio de evaluaci�n: 3.e) Se ha escrito c�digo utilizando control de excepciones. 
	/**
	 * M�todo readInt M�todo que pide un entero comprendido entre un valor minimo y
	 * maximo y lo valida evitando errores de ejecuci�n.
	 * 
	 * @param text : texto que informa al usuario para saber a qu� hace referencia
	 *             el entero que se est� pidiendo
	 * @param min: el entero que se est� recogiendo por teclado debe ser mayor a
	 *             este n�mero
	 * @param max: el entero que se est� recogiendo por teclado debe ser menor a
	 *             este n�mero
	 * @return el entero comprendido entre min y max
	 */
	
	
		public static int readInt(String text, int min, int max) {
			Scanner sc = new Scanner (System.in);
			int result = -1;
			boolean valid = false;
			do {
				try {
					System.out.println(text);
					result=sc.nextInt();
					if(result>= min && result <=max) {
						valid = true;
					}
				} catch (Exception e) {
					System.out.println("introduce un numero entero");
					sc.nextLine();
				}
			} while (!valid);
			
				
			return result;
		}
	
	
	
	
	
	
	
	

	/**
	 * M�todo fillArray: rellena cada elemento de un array con una unidad m�s que su
	 * posici�n
	 * 
	 * @param size: tama�o del array
	 * @return el array
	 */

	public static int[] fillArray(int size) {
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}

		return a;

	}

    //EJERCICIO 3: Pinta una pir�mide usando los elementos del array
	// Criterio de evaluaci�n 3.b) Se han utilizado estructuras de repetici�n.
	/**
	 * Imprimiendo solo los valores de los elementos del array (nunca se imprime i y
	 * j) pinta la siguiente pir�mide
	 * 
	 * @param a: array con los valores que se pueden imprimir.
	 */
	
	public static void paintPyramid(int[]a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = a.length-1; j <=0 ; j--) {
				System.out.println(a[j]);
			}
		}
	}
	
	
	
	

	//EJERCICIO 4: Escribe un m�todo que rellene un array 
	// con valores enteros pedidos al usuario (edades de personas, 
	// comprendidas entre una edad m�nima y una edad m�xima)
	// No puedes usar Scanner. El m�todo escrito debe cumplir 
	// con las exigencias del comentario.
	
	/**
	 * M�todo que pide por teclado edades de personas y las almacena en un array
	 * @param n: numero de personas (tama�o del array), dato entero
	 * @param ageMin: edad m�nima de las personas, dato entero
	 * @param ageMax: edad m�xima de las personas, dato entero
	 * @return el array de enteros con las edades de las personas.
	 */
	
	public static int[] fillAges(int n, int ageMin, int ageMax) {
		int [] result = new int [n];
			for (int i = 0; i < result.length; i++) {
				result[i]=readInt("Introduce edad (entre "+ageMin+ "y "+ageMax+") del participante "+(i+1), ageMin, ageMax);
			}
		return result;
	}
	
	
	

//EJERCICIO 5: M�todo que devuelve la media de un array (recorrer el array con un for - each)
	// el ejercicio puntuar� la mitad si no se ha usado for - each
	/**
	 * M�todo middle: calcula la media de los valores de un array de enteros.
	 * @param a: array de enteros para el que se calcula la media
	 * @return valor de la media (dato double)
	 */
	public static double middle(int []a) {
		double result = 0.0;
		for (int i = 0; i < a.length; i++) {
			result+=a[i];
		}
		
			
		
		return result/a.length;
	}
	
	
	
	

//EJERCICIO 6: Escribe un m�todo que devuelva la cantidad de valores de un array que est�n 
	//por encima de un valor dado
	/**
	 * m�todo countGreater: cuenta la cantidad de elementos de un array con valor superior a un valor dado
	 * @param a: array de enteros donde contar 
	 * @param value: valor de tipo double con el que comparar
	 * @return cantidad de elementos cuyo valor est� por encima de value.
	 */
	public static int countGreater(int[] a, double value) {
		int result =0;
			for (int i = 0; i < a.length; i++) {
				if(a[i]>value) {
					result++;
				}
			}
		return result;
	}
	
	

//EJERCICIO 7: Escribe un m�todo que recorra un array comparando cada elemento con un valor dado, 
//si el elemento es mayor, almacena ese valor en otro array. El m�todo debe devolver el array con los valores mayores.
	//El tama�o del array resultado, se obtendr� llamando al m�todo del ejercicio 6. 
	//Comenta el m�todo de manera adecuada.
	
	/**
	 * Este metodo almacena los valores mayores al valor pasado, en otro array.
	 * @param a : el array con todos los valores.
	 * @param value: el valor con el cual compara
	 * @return : devuelve el array relleno de los valores mayores a value.
	 */
	public static int [] fillGreater(int []a, double value){
		int [] result = new int [countGreater(a, value)];
		int j= 0;
			for (int i = 0; i < a.length; i++) {
				if(a[i]>value) {
					result[j]=a[i];
					j++;
					
				}
			}
		return result;
	}
	
	
	

// Ejercicio 8: comenta adecuadamente este m�todo
	
	/**
	 * Metodo el cual imprime un recorre un array imprimiendo sus valores.
	 * @param text : texto que le pasas al usuario.
	 * @param a: array el cual imprime.
	 */
	public static void printArray(String text, int[] a) {
		System.out.println(text);
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}
}
