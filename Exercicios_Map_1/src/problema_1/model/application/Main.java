package problema_1.model.application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Map<String, Double> alunos = new HashMap<String, Double>();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite a quantidade de alunos: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Digite o nome do aluno: ");
			
			String nome = sc.nextLine();
			
			System.out.print("Digite a nota do aluno: ");
			
			Double nota = sc.nextDouble();
			sc.nextLine();
			
			alunos.put(nome, nota);
			
			System.out.println();
		}
		
		System.out.print("Digite o nome do aluno para buscar: ");
		
		String nome = sc.nextLine();
		
		System.out.println(alunos.get(nome));

		sc.close();
	}

}
