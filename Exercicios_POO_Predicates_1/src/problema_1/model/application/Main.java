package problema_1.model.application;

import java.util.List;

import problema_1.model.entities.Produto;
import problema_1.model.enums.Categoria;

public class Main {

	public static void main(String[] args) {
		Sistema sistema = new Sistema();
		
		sistema.adicionarProduto("Livro A", 80.0, Categoria.LIVROS);
		sistema.adicionarProduto("Caneta", 5.0, Categoria.PAPELARIA);
		sistema.adicionarProduto("Livro B", 150.0, Categoria.LIVROS);
		sistema.adicionarProduto("Livro C", 90.0, Categoria.LIVROS);
		
		
		List<Produto> resultado = sistema.filtrarProdutos(p -> p.getPreco() < 100.0 && p.getCategoria() == Categoria.LIVROS);
		
		for(Produto p : resultado) {
			System.out.println(p.getNome());
		}

	}

}
