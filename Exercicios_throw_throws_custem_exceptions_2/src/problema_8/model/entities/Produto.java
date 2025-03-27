package problema_8.model.entities;

import problema_8.model.exception.PrecoInvalidoException;

public class Produto {
	private String nome;
	private Double preco;
	
	public Produto(String nome, Double preco) throws PrecoInvalidoException {
		if(preco < 0 ) {
			throw new PrecoInvalidoException("Preço inválido: o valor não pode ser negativo");
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
