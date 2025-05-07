package problema_4.model.application;

import java.util.HashSet;
import java.util.Set;

import problema_1.model.entities.Aluno;

public class Main {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João", 123);
		Aluno aluno2 = new Aluno("Maria", 456);
		
		System.out.println("EQUALS: ");
		System.out.println(aluno1.equals(aluno2));
		System.out.println(aluno2.equals(aluno1));
		
		System.out.println();
		
		System.out.println("HASHCODE: ");
		System.out.println(aluno1.hashCode());
		System.out.println(aluno2.hashCode());
		
		Set<Aluno> alunos = new HashSet<>();
		
		alunos.add(aluno1);
		alunos.add(aluno2);
	
		System.out.println();
		
		for(Aluno aluno : alunos) {
			System.out.println(aluno.getNome());
		}
	}

}
