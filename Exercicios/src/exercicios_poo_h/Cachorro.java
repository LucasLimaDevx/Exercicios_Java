package exercicios_poo_h;

public class Cachorro extends Animal{

	public Cachorro() {
		super();
	}
	
	public Cachorro(String nome, Tipo tipo) {
		super(nome, tipo);
	}
	
	public String emitirSom() {
		return "Au Au";
	}
	
}
