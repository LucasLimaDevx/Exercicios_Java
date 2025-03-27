package problema_8.model.application;

import java.util.Locale;
import java.util.Scanner;

import problema_8.model.entities.Produto;
import problema_8.model.exception.PrecoInvalidoException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o nome do produto: ");
		String nome = input.nextLine();
		
		System.out.print("Digite o preço do produto: ");
		Double preco = input.nextDouble();
		
		try {
			Produto produto = new Produto(nome, preco);
			
			System.out.println(produto.getNome());
			System.out.println(produto.getPreco());
			
		}catch(PrecoInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
		input.close();
	}

}
