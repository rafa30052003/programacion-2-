import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("introduce el salario");
		int salario = sc.nextInt();
		System.out.println("introduce el irpf");
		float irpf = sc.nextFloat();
		float retencion = salario * irpf;
		float neto = salario - retencion;
		System.out.println(salario+neto);
		
		
	}

}
