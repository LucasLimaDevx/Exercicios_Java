package problema_3.entities;

public class Cachorro extends Animal{
	public Cachorro() {
		super();
	}

	public Cachorro(String nome, Integer idade, String raca) {
		super(nome, idade, raca);
	}

	@Override
	public String emitirSom() {
		
		return "Au Au";
	}
	
	
}
