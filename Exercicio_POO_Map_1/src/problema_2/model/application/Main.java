package problema_2.model.application;

import java.util.HashMap;
import java.util.Map;

import problema_2.model.entities.Produto;

public class Main {

	public static void main(String[] args) {
		Map<String, Produto> produtos = new HashMap<>();
		
		Produto p1 = new Produto("Arroz", 10);
		Produto p2 = new Produto("Feijão", 3);
		Produto p3 = new Produto("Óleo", 2);
		Produto p4 = new Produto("Açúcar", 5);
		
		produtos.put(p1.getNome(), p1);
		produtos.put(p2.getNome(), p2);
		produtos.put(p3.getNome(), p3);
		produtos.put(p4.getNome(), p4);
		
		verificarEstoque(produtos);
		
		

	}
	
	public static void verificarEstoque(Map<String, Produto> estoque) {
		for(String key :  estoque.keySet()) {
			if(estoque.get(key).getQuantidade() < 5) {
				System.out.println(estoque.get(key).getNome());
			}
		}
	}

}
