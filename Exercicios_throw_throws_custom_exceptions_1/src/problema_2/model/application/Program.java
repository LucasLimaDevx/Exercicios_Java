package problema_2.model.application;

import problema_2.model.entities.Produto;
import problema_2.model.exception.EstoqueInsuficienteException;
import problema_2.model.exception.EstoqueInvalidoException;

public class Program {

	public static void main(String[] args) {
		
		try {
			Produto p1 = new Produto("TV", 10, 2000.0);
			Produto p2 = new Produto("Geladeira", 30, 1000.0);

			
			ControleDeEstoque sistema = new ControleDeEstoque();
			
			sistema.adicionarItem(p1);
			sistema.adicionarItem(p2);
			
			sistema.listarItens();
			
			sistema.retirarItemDoEstoque("Geladeira", 50);
			System.out.println();
			
			sistema.listarItens();
		}
		catch(EstoqueInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		catch(EstoqueInvalidoException e) {
			System.out.println(e.getMessage());
		}

	}

}
