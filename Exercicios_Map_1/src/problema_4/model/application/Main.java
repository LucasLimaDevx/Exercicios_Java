package problema_4.model.application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Map<String, Double> produtos = new HashMap<>();
		
		System.out.print("Digite a quantidade de produtos que serão armazenados: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		
		for(int i = 0  ; i < n ; i++) {
			System.out.print("Digite o nome do produto: ");
			String nome = sc.nextLine();
			
			System.out.print("Digite o preço do produto: ");
			Double preco = sc.nextDouble();
			sc.nextLine();
			
			produtos.put(nome, preco);
			
			System.out.println();
			
			
		}
		
		System.out.print("Digite um produto para alterar o preço: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite o novo preço: ");
		Double preco = sc.nextDouble();
		
		produtos.put(nome, preco);
		
		for(String produto : produtos.keySet()) {
			System.out.println(
					"Produto: " +
					produto + 
					", Preço: " + 
					produtos.get(produto));
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
