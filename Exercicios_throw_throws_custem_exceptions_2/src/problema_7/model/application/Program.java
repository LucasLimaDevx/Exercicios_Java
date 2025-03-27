package problema_7.model.application;

import java.util.Scanner;

import problema_7.model.exception.EmailInvalidoException;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o email: ");
		String email = input.next();
		
		try {
			verificaEmail(email);
		}
		catch(EmailInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
		input.close();
	}
	
	public static void verificaEmail(String email) throws EmailInvalidoException {
		
		if(email.indexOf("@") <= -1 || email.indexOf(".com") <= -1) {
			throw new EmailInvalidoException("Email inválido: formato incorreto");
		}
		
		System.out.println("Email enviado com sucesso");
	}

}
