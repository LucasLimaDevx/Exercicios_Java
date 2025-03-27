package exercicios_poo_h;

import java.util.ArrayList;
import java.util.List;

public class ControleDeProdutos {
	List<Produto> produtos = new ArrayList<Produto>();
	
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void listarProdutos() {
		for(Produto p : produtos) {
			System.out.println("Produto \"" + p.getNome() +"\" cadastrado");
		}
	}
	
	public void listarProdutosPorTipo(TipoDoProduto tipoDoProduto) {
		for(Produto p : produtos) {
			if(tipoDoProduto == p.getTipoDoProduto()) {
				System.out.println("Produto \"" + p.getNome() +"\" cadastrado");
			}
		}
	}
}
