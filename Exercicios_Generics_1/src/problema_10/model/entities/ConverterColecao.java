package problema_10.model.entities;

import java.util.ArrayList;
import java.util.List;

public class ConverterColecao<T> {
	private List<T> lista = new ArrayList<T>();
	
	public void conveterColecao(T[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			lista.add(arr[i]);
		}
	}
	
	public List<T> getLista(){
		return lista;
	}
}
