package problema_6.model.application;

import java.util.ArrayList;
import java.util.List;

import problema_6.model.entities.Produto;

public class CadastroDeProduto {
	private List<Produto> produtos = new ArrayList<>();
	
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
		
	}
	
	public void listarProdutos() {
		for(Produto produto : produtos) {
			System.out.println(
					"Nome do produto: " + produto.getNome() +
					"\nPreço do produto: " +
					String.format("%.2f", produto.getPreco())
					
					);
		}
	}
}
