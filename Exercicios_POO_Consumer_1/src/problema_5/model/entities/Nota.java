package problema_5.model.entities;

public class Nota {
	private String nome;
	private Double valor;
	
	public Nota(String nome, Double valor) {
	
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
	
}
