package problema_3.model.application;

import java.util.Scanner;

import problema_3.model.entities.Pessoa;
import problema_3.model.exception.CPFInvalidoException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		String nome = input.next();
		
		System.out.print("Digite o sobrenome: ");
		String sobreNome = input.next();
		
		System.out.print("Digite o CPF: ");
		String cpf = input.next();
		
		try {
			Pessoa pessoa = new Pessoa(nome, sobreNome, cpf);
			System.out.println("NOME: " + pessoa.getNome());
			System.out.println("SOBRENOME: " + pessoa.getSobreNome());
			System.out.println("CPF:" + pessoa.getCpf());
		}
		catch(CPFInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		input.close();
	}

}
