package problema_1.model.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import problema_1.model.entities.Produto;
import problema_1.model.enums.Categoria;

public class Main {

	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<Produto>();
		
		produtos.add(new Produto("TV", 3000.0, Categoria.ELETRONICO));
		produtos.add(new Produto("Geladeira", 2500.0, Categoria.ELETRODOMESTICO));
		produtos.add(new Produto("Notebook", 4500.0, Categoria.ELETRONICO));
		produtos.add(new Produto("Liquidificador", 350.0, Categoria.ELETRODOMESTICO));
		
		
		Consumer<Produto> cons = (p) -> {
			if(p.getCategoria() == Categoria.ELETRONICO) {
				p.setPreco(p.getPreco() * (1.0 + 0.1));
			}
		};
		produtos.forEach(cons);
		produtos.forEach(p -> System.out.println(p.getPreco()));
		
		

	}

}
