package problema_7.model.entities;

import problema_7.model.enums.TipoDeProduto;

public class Alimento extends ProdutoAbstrato{

	public Alimento(String nome) {
		super(nome);
		this.tipoDeProduto = TipoDeProduto.ALIMENTO;
	}
	
	
	
}
