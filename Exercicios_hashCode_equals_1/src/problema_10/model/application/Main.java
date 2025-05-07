package problema_10.model.application;

import java.util.HashSet;
import java.util.Set;

import problema_1.model.entities.Aluno;

public class Main {

	public static void main(String[] args) {
		Set<Aluno> alunos = new HashSet<>();
		
		alunos.add(new Aluno("João", 123));
		alunos.add(new Aluno("Mateus", 456));
		alunos.add(new Aluno("Carlos", 111));
		
		
		System.out.println(alunos.contains(new Aluno("João", 123)));
		System.out.println(alunos.contains(new Aluno("Maria", 456)));
		System.out.println(alunos.contains(new Aluno("Ana", 789)));
		System.out.println(alunos.contains(new Aluno("Carlos", 111)));
		
		

	}

}
