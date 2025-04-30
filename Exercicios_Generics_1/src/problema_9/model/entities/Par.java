package problema_9.model.entities;

public class Par <T,K>{
	private T chave;
	private K valor;
	
	public Par(T chave, K valor) {
	
		this.chave = chave;
		this.valor = valor;
	}
	
	public K getValor() {
		return valor;
	}
	
	public T getChave() {
		return chave;
	}

	
	
	
}
