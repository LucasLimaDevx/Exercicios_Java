package problema_4.model.entities;

import java.lang.reflect.Array;
import java.util.List;

public class ConverterParaArray<T> {
	
	private T[] array;
	
	public void converterLista(List<T> lista, Class<T> tipo) {
		@SuppressWarnings("unchecked")
		T[] novoArray = (T[]) Array.newInstance(tipo, lista.size());
		
		for(int i = 0 ; i < lista.size() ; i++) {
			novoArray[i] = lista.get(i);
		}
		
		array = novoArray;
	}
	
	public void listarArray() {
		System.out.print("[");
		int lastIndex = 0;
		for(int i = 0 ; i < array.length - 1 ; i++) {
			System.out.print(array[i] + ", ");
			
			lastIndex = i;
		}
		
		lastIndex++;
		System.out.print(array[lastIndex]);
		
		System.out.print("]");
	}
}
