package exercicios_poo;

import java.util.ArrayList;
import java.util.List;



public class CadastradoDeProdutos {
	
	
	List<Produto> produtos = new ArrayList<Produto>();
	
	public void adicionarProduto(String nome, Double preco, Integer quantidade) {
		Produto produto = new Produto(nome, preco, quantidade);
		
		produtos.add(produto);
	}
	
	public void listarProdutos() {
		if(produtos.size() > 0) {
			System.out.println("LISTANDO PRODUTOS CADASTRADOS");
			
			for(Produto produto : produtos) {
				System.out.println("Produto: " + produto.getNome() + ", Preço: " + String.format("%.2f", produto.getPreco()) + ", Quantidade: " + produto.getQuantidade());
			}
		}
	}
}
