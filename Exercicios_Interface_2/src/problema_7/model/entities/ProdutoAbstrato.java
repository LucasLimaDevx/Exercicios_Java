package problema_7.model.entities;

import problema_7.model.enums.TipoDeProduto;

public class ProdutoAbstrato {
	private String nome;
	protected TipoDeProduto tipoDeProduto;
	
	public ProdutoAbstrato(String nome) {
	
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoDeProduto getTipoDeProduto() {
		return tipoDeProduto;
	}

	public void setTipoDeProduto(TipoDeProduto tipoDeProduto) {
		this.tipoDeProduto = tipoDeProduto;
	}
	
	
	
	

	
	
}
