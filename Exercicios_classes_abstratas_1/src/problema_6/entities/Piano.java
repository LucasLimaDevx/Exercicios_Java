package problema_6.entities;

public class Piano extends Instrumento{
	public Piano() {
		super();
	}

	public Piano(String nome, String material, Double tamanho) {
		super(nome, material, tamanho);
	}

	@Override
	public String tocar() {
		
		return "Som de piano";
	}
	
	
}
