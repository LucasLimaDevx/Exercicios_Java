package problema_2.model.entities;

import problema_2.model.exception.EstoqueInsuficienteException;
import problema_2.model.exception.EstoqueInvalidoException;

public class Produto {
	private String nome;
	private Integer quantidade = 0;
	private Double preco;
	
	public Produto(String nome, Integer quantidade, Double preco) throws EstoqueInvalidoException {
		if(quantidade < 0) {
			throw new EstoqueInvalidoException("Valor inválido: informe um valor válido");
		}
		this.nome = nome;
		this.quantidade += quantidade;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public void retirarItem(Integer quantidade) throws EstoqueInsuficienteException {
		if(quantidade > this.quantidade) {
			throw new EstoqueInsuficienteException("Estoque insuficiente! Disponível: " + this.quantidade);
		}
		
		this.quantidade -= quantidade;
	}
	
	
}
