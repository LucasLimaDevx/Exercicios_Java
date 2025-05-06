package problema_9.model.application;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(compararListas(List.of(1, 2, 3), List.of(1, 2, 3)));
		System.out.println(compararListas(List.of("a", "b"), List.of("b", "a")));
		System.out.println(compararListas(List.of(true, false), List.of(true, false)));
		System.out.println(compararListas(List.of(1.1, 2.2), List.of(1.1, 2.3)));

	}
	
	public static <T> boolean compararListas(List<T> lista1 , List<T> lista2) {
		
		if(lista1.size() != lista2.size()) {
			return false;
		}
		
		int len = lista1.size();
		for(int i = 0 ; i < len ; i++) {
			
			if(lista1.get(i) != lista2.get(i)) {
				return false;
			}
		}
		
		return true;
	}

}
