package problema_6.model.application;

import java.util.LinkedHashSet;
import java.util.Set;

import problema_6.model.entities.Produto;

public class Main {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Café", 10.0);
		Produto produto2 = new Produto("Café", 10.0);
		
		
		Produto produto3 = new Produto("Leite", 5.0);
		Produto produto4 = new Produto("Leite", 5.0);
		
		System.out.println(produto1.equals(produto2));
		System.out.println(produto3.equals(produto4));
		
		Set<Produto> produtos = new LinkedHashSet<>();
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		
		System.out.println();
		
		for(Produto produto : produtos) {
			System.out.println(produto.getNome());
		}

	}

}
