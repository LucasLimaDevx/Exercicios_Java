package exercicios_enum;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeControleDeProdutos {
	
	List<Produto> produtos = new ArrayList<>();
	
	public void adicionarProduto(String nome, Double preco, Categoria categoria) {
		Produto produto = new Produto(nome, preco, categoria);
		
		produtos.add(produto);
	}
	
	public void listarPorCategoria(Categoria categoria) {
		System.out.println("Produtos da categoria " + categoria);
		for(Produto produto : produtos) {
			
			if(categoria == produto.getCategoria()) {
				
				System.out.println("Nome: " + produto.getNome());
				System.out.println("Preço: " + produto.getPreco());
				System.out.println("-------------------");
			}
		}
	}
	
	public void listarProdutos() {
		System.out.println("LISTA DE TODOS OS PRODUTOS:");
		for(Produto produto : produtos) {
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Preço: " + produto.getPreco());
			System.out.println("-------------------");
		}
	}

}
