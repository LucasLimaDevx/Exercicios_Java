package problema_10.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Cache <T>{
	private List<T> lista = new ArrayList<T>();
	private Integer total = -1;
	
	public void armazenar(T elemento) {
		lista.add(elemento);
		total++;
	}
	
	public T get() {
		
		if(total < 0) {
			return null;
		}
		T elemento = lista.get(total);
		total--;
		return elemento;
	}
}
