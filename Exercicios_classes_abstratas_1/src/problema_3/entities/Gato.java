package problema_3.entities;

public class Gato extends Animal{
	public Gato() {
		super();
		
	}

	public Gato(String nome, Integer idade, String raca) {
		super(nome, idade, raca);
	}

	@Override
	public String emitirSom() {
		
		return "Miau";
	}
	
	
}
