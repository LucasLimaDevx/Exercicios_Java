package problema_6.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Fila <T>{
	List<T> fila = new ArrayList<T>();
	
	public void enqueue(T elemento) {
		fila.add(elemento);
	}
	
	public T dequeue() {
		return fila.removeFirst();
	}
}
