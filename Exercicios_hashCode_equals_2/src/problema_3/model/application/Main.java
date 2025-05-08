package problema_3.model.application;

import problema_3.model.entities.Aluno;
import problema_3.model.entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("João");
		Aluno aluno1 = new Aluno("João");
		
		System.out.println(pessoa1.equals(aluno1));
		
		Pessoa pessoa2 = new Pessoa("João");
		Pessoa pessoa3 = new Pessoa("João");
		
		System.out.println(pessoa2.equals(pessoa3));
		
		Aluno aluno2 = new Aluno("João");
		Aluno aluno3 = new Aluno("João");
		
		System.out.println(aluno2.equals(aluno3));
		
		Aluno aluno4 = new Aluno("Maria");
		Pessoa pessoa4 = new Pessoa("Maria");
		
		System.out.println(aluno4.equals(pessoa4));

	}

}
