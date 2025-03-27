package problema_2.model.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import problema_2.model.entities.Aluno;
import problema_2.model.exception.NomeInvalidoException;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Aluno> alunos = new ArrayList<>();
		
		
		try {
			for(int i = 0 ; i < 3 ; i++) {
				System.out.print("Digite o nome do aluno: ");
				String nome = input.nextLine();
				
				System.out.print("Digite a idade do aluno: ");
				Integer idade = input.nextInt();
				
				Aluno aluno = new Aluno(nome, idade);
				input.nextLine();
				
				alunos.add(aluno);
			}
			
			
		}
		catch(NomeInvalidoException e ) {
			System.out.println(e.getMessage());
		}
		
		for(Aluno a : alunos) {
			System.out.println("Nome: " + a.getNome() );
			System.out.println("Idade: " + a.getIdade());
			System.out.println("--------------");
		}
		input.close();
	}

}
