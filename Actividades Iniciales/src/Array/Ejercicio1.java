package Array;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("introduce los 10 numeros");
		Scanner sc = new Scanner (System.in);
		int[]nums=new int [10];
		for (int i = 0; i < nums.length; i++) {
			nums[i]=sc.nextInt();
		}
		for (int i = 9; i >=0; i--) {
			System.out.println(nums[i]);
		}
	}
		
}	
