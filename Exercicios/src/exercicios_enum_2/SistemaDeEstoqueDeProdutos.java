package exercicios_enum_2;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeEstoqueDeProdutos {
	List<Produto> produtos = new ArrayList<Produto>();
	
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void removerProduto(Produto produto) {
		produtos.remove(produto);
	}
	
	public void listarProdutosPorCategoria(Categoria categoria) {
		
		for(Produto produto : produtos) {
			if(categoria == produto.getCategoria()) {
				System.out.println(produto.getNome() + " - " + produto.getQuantidade() + " unidades");
			}
		}
	}
	
	
}
