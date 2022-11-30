package Array;

public class Ejercicio11 {

	public static void main(String[] args) {
		int [] a1 = {1,2,3};
		int [] a2 = {1,2,3};
		if(comparaArray(a1, a2)==true) {
			System.out.println("son iguales");
		}else {
			System.out.println("no son iguales");
		}
		
		

	}
	public static boolean comparaArray (int [] a, int [] b) {
		boolean result = true;
		if(a.length==b.length) {
			for (int i = 0; i < b.length && result; i++) {
				if(a[i]!=b[i]) {
					result = false;
				}
				
			}
		}else {
			result = false;
		}
			
		return result;
	}
}
