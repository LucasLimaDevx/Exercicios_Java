package problema_2.model.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import problema_1.model.entities.Aluno;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite quantos alunos serão adicionados: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Set<Aluno> alunos = new HashSet<>();
		
		for(int i  = 1 ; i <= n ; i++) {
			System.out.print("Digite o nome do aluno: ");
			String nome = sc.nextLine();
			
			System.out.print("Digite a matrícula do aluno: ");
			Integer matricula = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			Aluno aluno = new Aluno(nome, matricula);
			
			if(!alunos.contains(aluno)) {
				alunos.add(aluno);
			}
		}
		
		for(Aluno aluno : alunos) {
			System.out.println(aluno.getNome());
		}
		
		sc.close();

	}

}
