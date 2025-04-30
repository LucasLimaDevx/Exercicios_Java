package problema_1.model.entities;

import problema_1.model.exceptions.IdadeInvalidaException;

public class Usuario {
	private String nome;
	private Integer idade;
	
	public Usuario(String nome, Integer idade) throws IdadeInvalidaException {
		if(idade < 18) {
			throw new IdadeInvalidaException("Idade inválida: é necessário ter 18 anos ou mais");
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
