package problema_1.model.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import problema_1.model.entities.Produto;
import problema_1.model.enums.Categoria;

public class Sistema {
	List<Produto> produtos = new ArrayList<Produto>();
	
	public void adicionarProduto(String nome, Double preco, Categoria categoria) {
		produtos.add(new Produto(nome, preco, categoria));
	}
	
	public List<Produto> filtrarProdutos(Predicate<Produto> predicate){
		List<Produto> produtosFiltrados = new ArrayList<>();
		
		for(Produto p : produtos) {
			if(predicate.test(p)) {
				produtosFiltrados.add(p);
			}
		}
		
		return produtosFiltrados;
	}
}
