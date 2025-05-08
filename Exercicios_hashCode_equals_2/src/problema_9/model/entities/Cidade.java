package problema_9.model.entities;

import java.util.Objects;

public class Cidade {
	private String nome;
	private String estado;
	private Integer populacao;
	
	public Cidade(String nome, String estado, Integer populacao) {
		this.nome = nome;
		this.estado = estado;
		this.populacao = populacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getPopulacao() {
		return populacao;
	}

	public void setPopulacao(Integer populacao) {
		this.populacao = populacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(estado, nome, populacao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		return Objects.equals(estado, other.estado) && Objects.equals(nome, other.nome)
				&& Objects.equals(populacao, other.populacao);
	}
	
	
}
