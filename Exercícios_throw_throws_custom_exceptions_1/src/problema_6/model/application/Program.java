package problema_6.model.application;

import java.util.Locale;

import problema_6.model.entities.Produto;
import problema_6.model.exception.NomeProdutoVazioException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		CadastroDeProduto sistema = new CadastroDeProduto();
		
		try {
			Produto produto = new Produto("Fone de ouvido", 150.0);
			sistema.adicionarProduto(produto);
		}
		catch(NomeProdutoVazioException e) {
			System.out.println(e.getMessage());
		}
		
		sistema.listarProdutos();
	}

}
