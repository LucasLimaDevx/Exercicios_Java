package problema_9.model.entities;

import problema_9.model.exception.DuracaoCursoInvalidaException;

public class Curso {
	private String nome;
	private Integer duracao;
	
	public Curso(String nome, Integer duracao) throws DuracaoCursoInvalidaException {
		if(duracao < 10) {
			throw new DuracaoCursoInvalidaException("A duração do curso deve ser no mínimo 10 horas");
		}
		this.nome = nome;
		this.duracao = duracao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}
	
	
}
