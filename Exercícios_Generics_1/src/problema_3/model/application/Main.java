package problema_3.model.application;

public class Main {

	public static void main(String[] args) {
		Integer[] numeros1 = {10, 20, 30};
		String[] strings = {"a", "b", "c", "d"};
		Double[] numeros2 = {1.1, 2.2};
		
		System.out.println(listarTamanho(numeros1));
		System.out.println(listarTamanho(strings));
		System.out.println(listarTamanho(numeros2));
		

	}
	
	public static <T> int listarTamanho(T[] arr) {
		
		return arr.length;
	}
	
}
