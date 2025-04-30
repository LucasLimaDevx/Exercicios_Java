package problema_1.model.application;

import java.util.Scanner;

import problema_1.model.entities.Usuario;
import problema_1.model.exceptions.IdadeInvalidaException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Idade: ");
		Integer idade = sc.nextInt();
		
		try {
			Usuario usuario = new Usuario(nome, idade);
			System.out.println();
			
			System.out.println("Nome: " + usuario.getNome() + "\nIdade: " + usuario.getIdade());
		}
		catch(IdadeInvalidaException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}

	}

}
