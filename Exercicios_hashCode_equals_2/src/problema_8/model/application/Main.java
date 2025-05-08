package problema_8.model.application;

import java.util.HashSet;
import java.util.Set;

import problema_8.model.entities.Produto;

public class Main {

	public static void main(String[] args) {
		
		Set<Produto> produtos = new HashSet<>();
		
		Produto p1 = new Produto(123);
		Produto p2 = new Produto(456);
		Produto p3 = new Produto(321);
		Produto p4 = new Produto(654);
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		
		p1.setId(123);
		p2.setId(789);
		p3.setId(321);
		p4.setId(111);
		
		
		System.out.println(produtos.contains(new Produto(123)));
		System.out.println(produtos.contains(new Produto(456)));
		System.out.println(produtos.contains(new Produto(321)));
		System.out.println(produtos.contains(new Produto(654)));
	}

}
