package problema_7.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Pilha <T> {
	private List<T> pilha = new ArrayList<T>();
	
	public void push(T elemento) {
		pilha.add(elemento);
	}
	
	public T pop() {
		return pilha.removeLast();
	}
}
