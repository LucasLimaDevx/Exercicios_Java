package problema_8.model.application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> produtos = new HashMap<String, Integer>();
		
		int k = 4;
		
		for(int i = 0 ; i < k ; i++) {
			System.out.print("Digite o nome do produto: ");
			String nome = sc.nextLine();
			
			System.out.print("Quantidade em estoque: ");
			Integer quantidade = sc.nextInt();
			sc.nextLine();
			
			produtos.put(nome, quantidade);
			
			System.out.println();
		}
		
		for(String produto : produtos.keySet()) {
			if(produtos.get(produto) > 10) {
				System.out.println(produto + " -> " + produtos.get(produto));
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
