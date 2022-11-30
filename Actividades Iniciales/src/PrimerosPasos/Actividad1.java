package PrimerosPasos;

import java.util.Scanner;

public class Actividad1 {
  public static void main(String[] args) {
	  Scanner sc = new Scanner (System.in);
	    System.out.println("introduce tu año de nacimiento");
	    int fecha = sc.nextInt();
	    System.out.println("introduce el año actual");
	    int año = sc.nextInt();
	    int edad = año - fecha;
	    System.out.println("tu edad es " + edad);
  }
}
