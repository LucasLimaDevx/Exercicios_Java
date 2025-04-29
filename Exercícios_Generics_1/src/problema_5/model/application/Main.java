package problema_5.model.application;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(comparadorGenerico(3, 5));
		System.out.println(comparadorGenerico("banana", "abacaxi"));
		System.out.println(comparadorGenerico(2.5, 2.4));
		System.out.println(comparadorGenerico('a', 'c'));

	}
	
	public static <T extends Comparable<T>> T comparadorGenerico(T a, T b) {
		
		if(a.compareTo(b) > 0) {
			return a;
		}
		
		return b;
		
	}
	
	
	
}
