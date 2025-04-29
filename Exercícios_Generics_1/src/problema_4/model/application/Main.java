package problema_4.model.application;

public class Main {

	public static void main(String[] args) {
		
		Integer numeros1[] = {1, 2, 3};
		String strings[] = {"x", "y"};
		Double numeros2[] = {4.4, 5.5, 6.6};
		Boolean booleanos[] = {true, false};
		
		System.out.println(imprimirElementos(numeros1));
		System.out.println(imprimirElementos(strings));
		System.out.println(imprimirElementos(numeros2));
		System.out.println(imprimirElementos(booleanos));

	}
	
	public static <T> String imprimirElementos(T[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]);
		
		for(int i = 1 ; i < arr.length ; i++) {
			sb.append(" " + arr[i]);
		}
		
		return sb.toString();
	}

}
