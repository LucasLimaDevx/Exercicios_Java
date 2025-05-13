package problema_6.model.entities;

import java.util.Objects;

public class Moeda {
	private String nome;
	private Double cotacao;
	
	public Moeda(String nome, Double cotacao) {
		this.nome = nome;
		this.cotacao = cotacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getCotacao() {
		return cotacao;
	}

	public void setCotacao(Double cotacao) {
		this.cotacao = cotacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cotacao, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Objects.equals(cotacao, other.cotacao) && Objects.equals(nome, other.nome);
	}
	
	
}
