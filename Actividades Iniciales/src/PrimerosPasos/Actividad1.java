package PrimerosPasos;

import java.util.Scanner;

public class Actividad1 {
  public static void main(String[] args) {
	  Scanner sc = new Scanner (System.in);
	    System.out.println("introduce tu a�o de nacimiento");
	    int fecha = sc.nextInt();
	    System.out.println("introduce el a�o actual");
	    int a�o = sc.nextInt();
	    int edad = a�o - fecha;
	    System.out.println("tu edad es " + edad);
  }
}
