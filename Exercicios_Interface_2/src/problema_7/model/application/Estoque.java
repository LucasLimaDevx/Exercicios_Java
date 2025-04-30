package problema_7.model.application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import problema_7.model.entities.ProdutoAbstrato;
import problema_7.model.enums.TipoDeProduto;
import problema_7.model.interfaces.Produto;

public class Estoque implements Produto{
	List<ProdutoAbstrato> lista = new ArrayList<ProdutoAbstrato>();

	@Override
	public void adicionarEstoque(ProdutoAbstrato produto) {
		lista.add(produto);
		
	}

	@Override
	public void removerEstoque(int quantidade, TipoDeProduto tipoDeProduto) {
		int retirados = 0;
		Iterator<ProdutoAbstrato> it = lista.iterator();
		
		while(it.hasNext() && retirados < quantidade) {
			ProdutoAbstrato produto = it.next();
			
			if(produto.getTipoDeProduto() == tipoDeProduto) {
				lista.remove(produto);
				retirados++;
			}
		}

		
	
		
	}
	
	public void listar() {
		System.out.println("Listando produtos: ");
		for(ProdutoAbstrato p : lista) {
			System.out.println(p.getNome());
		}
	}

		
	
	
}
