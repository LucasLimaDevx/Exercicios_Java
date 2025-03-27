package problema_6.model.entities;

import problema_6.model.exception.NomeProdutoVazioException;

public class Produto {
	private String nome;
	private Double preco;
	
	public Produto(String nome, Double preco) throws NomeProdutoVazioException {
		if(nome.trim().length() == 0) {
			throw new NomeProdutoVazioException("Nome do produto não pode ser vazio");
		}
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	
	
}
