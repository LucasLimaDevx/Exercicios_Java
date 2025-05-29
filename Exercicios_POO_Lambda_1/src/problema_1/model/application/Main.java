package problema_1.model.application;

import java.util.List;
import java.util.stream.Collectors;

import problema_1.model.entities.Produto;

public class Main {

	public static void main(String[] args) {
		List<Produto> produtos = List.of(
				new Produto("TV", 3000.0),
				new Produto("Geladeira", 2500.0),
				new Produto("Microondas", 500.0)
		);
		
		List<Produto> produtosFiltrados = produtos.stream()
										.filter(produto -> produto.getPrice() < 1000.0 )
										.collect(Collectors.toList());
		
		for(Produto p : produtosFiltrados) {
			System.out.println(p.getNome());
		}

	}
	
	
	
	
	

}
