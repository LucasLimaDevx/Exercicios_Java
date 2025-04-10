package problema_10.model.application;

import java.util.Scanner;

import problema_10.model.exception.EnderecoInvalidoException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o endereço: ");
		String endereco = sc.nextLine();
		
		try {
			verificarEndereco(endereco);
		}
		catch(EnderecoInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
	
	public static void verificarEndereco(String endereco) throws EnderecoInvalidoException{
		Integer total = 0;
		for(int i = 0 ; i < endereco.length() ; i++) {
			//char c = endereco.charAt(i);
			if(' ' != endereco.charAt(i)) {
				total++;
			}
			
		}
		if(total < 10) {
			throw new EnderecoInvalidoException("Endereço inválido: deve ter no mínimo 10 caracteres");
		}
		
		System.out.println("Endereço cadastrado com sucesso");
	}

}
