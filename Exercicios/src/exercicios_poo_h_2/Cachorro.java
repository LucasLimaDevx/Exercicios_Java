package exercicios_poo_h_2;

public class Cachorro extends Animal{
	private String som;
	
	public Cachorro() {
		super();
	}

	public Cachorro(String nome, Integer idade, String som) {
		super(nome, idade);
		this.som = som;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	
	
	
}
