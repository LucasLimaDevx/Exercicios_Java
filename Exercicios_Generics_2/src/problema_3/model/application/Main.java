package problema_3.model.application;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(buscarElemento(new Integer[] {1, 2, 3}, 2));
		System.out.println(buscarElemento(new String[] {"a", "b", "c"}, "d"));
		System.out.println(buscarElemento(new Double[] {4.4, 5.5}, 5.5));
		System.out.println(buscarElemento(new Boolean[] {true, false}, null));

	}
	
	public static <T> Boolean buscarElemento(T[] arr, T elemento) {
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(arr[i].equals(elemento)) {
				return true;
			}
			
		}
		
		return false;
	}

}
