package problema_3.model.application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<String, String> frutas = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de n: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Digite o nome da fruta: ");
			String nome = sc.nextLine();
			
			System.out.print("Digite a cor da fruta: ");
			String cor = sc.nextLine();
			
			frutas.put(nome, cor);
			
			System.out.println();
		}
		
		System.out.print("Digite o nome da fruta para ser removida: ");
		String nome = sc.nextLine();
		
		frutas.remove(nome);
		System.out.println();
		
		listarFrutas(frutas);
		
		sc.close();
	}
	
	public static void listarFrutas(Map<String, String> frutas) {
		for(String fruta : frutas.keySet()) {
			System.out.println(fruta);
		}
	}
}
