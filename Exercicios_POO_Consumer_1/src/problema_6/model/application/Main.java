package problema_6.model.application;

import java.util.List;
import java.util.function.Consumer;

import problema_6.model.entities.Produto;

public class Main {

	public static void main(String[] args) {
		
		List<Produto> produtos = List.of(
			new Produto("Teclado", 120.0),
			new Produto("Mouse", 80.0),
			new Produto("Monitor", 950.0),
			new Produto("Câmera", 500.0)
			
		);
		
		Consumer<Produto> cons = (p) -> System.out.println("Produto: " + p.getProduto() + " custa R$ " + p.getPreco());
		
		produtos.forEach(cons);

	}

}
