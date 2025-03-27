package exercicios_poo_h;

public class Animal {
	private String nome;
	private Tipo tipo;
	
	public Animal() {
		
	}

	public Animal(String nome, Tipo tipo) {
		
		this.nome = nome;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
