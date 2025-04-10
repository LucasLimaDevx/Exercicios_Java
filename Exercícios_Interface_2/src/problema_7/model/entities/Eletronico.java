package problema_7.model.entities;

import problema_7.model.enums.TipoDeProduto;

public class Eletronico extends ProdutoAbstrato{

	public Eletronico(String nome) {
		super(nome);
		this.tipoDeProduto = TipoDeProduto.ELETRONICO;
	}
	
		
}
