package list.model;

public class Test1 {
	
	public static void main(String[] args) {
		List<Integer> milista = new List <Integer>();
		System.out.println("Tam"+ milista.size());
		milista.push(3);
		milista.push(7);
		System.out.println("Tam"+ milista.size());
		System.out.println( "el 7?"+ milista.get(1));
		milista.remove(1);
		System.out.println(milista);
	}
	

}
