package problema_6.entities;

public class Violino extends Instrumento{
	public Violino() {
		super();
	}

	public Violino(String nome, String material, Double tamanho) {
		super(nome, material, tamanho);
	}

	@Override
	public String tocar() {
		
		return "Som de violino";
	}
	
	
}
