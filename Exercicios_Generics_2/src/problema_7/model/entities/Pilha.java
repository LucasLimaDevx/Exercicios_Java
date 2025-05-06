package problema_7.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {
	private List<T>  pilha;
	private int total;
	
	public Pilha( int total) {
		
		pilha = new ArrayList<T>();
	
		this.total = total;
	}


	public void empilhar(T elemento) {

		if(pilha.size() <= total) {
			pilha.add(elemento);
			
		}
		
	}
	
	public boolean verificarCapacidade() {
		
		return total == pilha.size();
	}
	
	
}
