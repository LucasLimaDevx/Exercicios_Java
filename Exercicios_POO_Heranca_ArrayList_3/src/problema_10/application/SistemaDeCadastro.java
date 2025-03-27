package problema_10.application;

import java.util.ArrayList;
import java.util.List;

import problema_10.entities.Produto;
import problema_10.entities.ProdutoEletronico;

public class SistemaDeCadastro {
	List<Produto> produtos = new ArrayList<>();
	
	public void adicionarProduto(String nome, Double valor) {
		Produto produto = new Produto(nome, valor);
		produtos.add(produto);
	}
	public void adicionarProduto(String nome, Double valor, Integer garantia) {
		Produto produto = new ProdutoEletronico(nome, valor, garantia);
		produtos.add(produto);
	}
	
	public Double calcularEstoqueTotal() {
		
		Double valorTotal = 0.0;
		for(Produto p : produtos) {
			valorTotal += p.getValor();
		}
		
		return valorTotal;
	}
}
