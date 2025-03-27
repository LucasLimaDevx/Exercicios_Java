package problema_1.entities;

public abstract class Figura {
	private String cor;
	private String nome;
	
	public Figura() {
		
	}
	
	
	
	public Figura(String cor, String nome) {
		this.cor = cor;
		this.nome = nome;
	}



	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract Double calcularArea();
	
	
}
