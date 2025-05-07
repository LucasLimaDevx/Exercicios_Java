package problema_1.model.application;

import problema_1.model.entities.Aluno;

public class Main {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João", 123);
		Aluno aluno2 = new Aluno("Ana", 789);
		
		System.out.println(aluno1.equals(new Aluno("João", 123)));
		System.out.println(aluno1.equals(new Aluno("Maria", 123)));
		System.out.println(aluno1.equals(new Aluno("João", 456)));
		System.out.println(aluno2.equals(new Aluno("Ana", 789)));

	}

}
