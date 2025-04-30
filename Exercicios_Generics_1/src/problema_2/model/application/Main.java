package problema_2.model.application;

public class Main {

	public static void main(String[] args) {
		
		Integer[] arr1 = troca(new Integer[]{1, 2, 3}, 0, 2);
		String[] arr2 = troca(new String[]{"a", "b", "c"}, 1, 2);
		Double[] arr3 = troca(new Double[]{10.0, 20.0}, 0, 1);
		Boolean[] arr4 = troca(new Boolean[] {true, false}, 0, 0);
		
		mostrarElementos(arr1);
		System.out.println();
		mostrarElementos(arr2);
		System.out.println();
		mostrarElementos(arr3);
		System.out.println();
		mostrarElementos(arr4);
	}
	
	public static <T> T[] troca(T[] arr, int i, int j) {
		
		T aux = arr[i];
		arr[i] = arr[j];
		arr[j] = aux;
		
		return arr;
	}
	
	public static <T> void mostrarElementos(T[] arr) {
		for(T e : arr) {
			System.out.println(e);
		}
	}

}
