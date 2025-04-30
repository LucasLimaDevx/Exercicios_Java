package problema_7.model.interfaces;

import problema_7.model.entities.ProdutoAbstrato;
import problema_7.model.enums.TipoDeProduto;

public interface Produto {
	void adicionarEstoque(ProdutoAbstrato produto);
	
	void removerEstoque(int quantidade, TipoDeProduto tipoDeProduto);
	
	
}
