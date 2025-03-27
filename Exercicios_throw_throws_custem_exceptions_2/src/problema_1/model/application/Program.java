package problema_1.model.application;

import java.util.Scanner;

import problema_1.model.exception.CartaoInvalidoException;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o número do cartão: ");
		String numeroCartao = input.next();
		
		try {
			verificarNumeroCartao(numeroCartao);
		}
		catch(CartaoInvalidoException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("PROGRAMA FINALIZADO");
		}
		
		input.close();

	}
	
	public static void verificarNumeroCartao(String numeroCartao) throws CartaoInvalidoException {
		if(numeroCartao.length() != 16) {
			throw new CartaoInvalidoException("Número de cartão inválido: deve ter 16 dígitos\"");
		}
		
		System.out.println("Cartão válido");
	}

}
