package problema_2.model.application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> pessoas = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número pessoa que serão adicionadas: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Digite o " + (i+1) + "° nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Digite a idade do " + (i+1) + "° nome: ");
			Integer idade = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			
			pessoas.put(nome, idade);
			
		}
		
		System.out.print("Digite um número para verificar se ele existe no map: ");
		String nome = sc.nextLine();
		
		System.out.println(pessoas.containsKey(nome));
		sc.close();
	}

}
