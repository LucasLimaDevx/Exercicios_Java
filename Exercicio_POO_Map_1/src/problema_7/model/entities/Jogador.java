package problema_7.model.entities;

import java.util.Objects;

public class Jogador implements Comparable<Jogador> {
	private String nome;
	private Integer pontuacao;
	
	
	public Jogador(String nome, Integer pontuacao) {
		
		this.nome = nome;
		this.pontuacao = pontuacao;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getPontuacao() {
		return pontuacao;
	}


	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(nome, pontuacao);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogador other = (Jogador) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(pontuacao, other.pontuacao);
	}


	@Override
	public int compareTo(Jogador o) {
		
		return -pontuacao.compareTo(o.getPontuacao());
	}
	
	
	
	
}
