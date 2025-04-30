package problema_1.model.entities;

public class Caixa <T>{
	T item;
	
	public Caixa(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return this.item;
	}
}
