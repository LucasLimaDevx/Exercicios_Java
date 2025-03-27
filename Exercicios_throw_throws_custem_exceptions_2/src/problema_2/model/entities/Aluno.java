package problema_2.model.entities;

import problema_2.model.exception.NomeInvalidoException;

public class Aluno {
	private String nome;
	private Integer idade;
	
	public Aluno(String nome, Integer idade) throws NomeInvalidoException {
		if(nome.length() < 3) {
			throw new NomeInvalidoException("Nome inválido: deve ter no mínimo 3 caracteres");
		}
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
	
	
}
