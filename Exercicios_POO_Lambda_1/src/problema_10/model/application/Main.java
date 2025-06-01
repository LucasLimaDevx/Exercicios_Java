package problema_10.model.application;

import java.util.ArrayList;
import java.util.List;

import problema_10.model.entities.Produto;

public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto("Camisa", 80.0);
		Produto p2 = new Produto("Calça", 150.0);
		Produto p3 = new Produto("Jaqueta", 600.0);
		Produto p4 = new Produto("Boné", 50.0);
		
		List<Produto> produtos = new ArrayList<Produto>();
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		
		for(Produto p : produtos) {
			p.aplicarDesconto();
			
			System.out.println("NOME DO PRODUTO: " + p.getNome() );
			System.out.println("PREÇO DO PRODUTO: " + p.getPreco());
			System.out.println("----------------");
		}

	}

}
