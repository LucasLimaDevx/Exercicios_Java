package exercicios_poo_h_2;

import java.util.ArrayList;
import java.util.List;

public class LojaDeEletronicos {
	List<Produto> produtos = new ArrayList<Produto>();
	
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void listarNotebooks() {
		for(Produto p : produtos) {
			
			if(p instanceof Notebook) {
				System.out.println(p.getMarca() + " - " + p.getModelo() + " - " + p.getPreco());
			}
		}
	}
}
