package problema_2.model.application;

import java.util.ArrayList;
import java.util.List;

import problema_2.model.entities.Produto;
import problema_2.model.exception.EstoqueInsuficienteException;

public class ControleDeEstoque {
	private List<Produto> estoque;
	
	public ControleDeEstoque() {
		this.estoque = new ArrayList<Produto>();
	}
	
	public void adicionarItem(Produto produto) {
		estoque.add(produto);
	}
	
	public void retirarItemDoEstoque(String nome, Integer quantidade) throws EstoqueInsuficienteException {
		for(Produto p : estoque) {
			if(p.getNome().equals(nome)) {
				p.retirarItem(quantidade);
			}
		}
	}
	
	public void listarItens() {
		for(Produto p : estoque) {
			System.out.println("Nome: " + p.getNome());
			System.out.println("Quantidade: " + p.getQuantidade());
			System.out.println("Preço: " + p.getPreco());
			System.out.println("-----------------------");
		}
	}
	
}
