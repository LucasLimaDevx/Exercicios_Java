package problema_8.entities;

public class Equipamento {
	private String nome;
	private String numeroDeSerie;
	
	public Equipamento() {
		
	}

	public Equipamento(String nome, String numeroDeSerie) {
		
		this.nome = nome;
		this.numeroDeSerie = numeroDeSerie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}

	public void setNumeroDeSerie(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}
	
	
}
