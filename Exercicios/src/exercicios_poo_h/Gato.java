package exercicios_poo_h;

public class Gato extends Animal{
	public Gato() {
		super();
	}
	public Gato(String nome, Tipo tipo) {
		super(nome, tipo);
	}
	
	public String emitirSom() {
		return "Miau";
	}
	
}
