package problema_9.model.application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import problema_9.model.entities.Senha;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Senha> usuarios = new HashMap<>();
		
		Senha s1 = new Senha("admin", "1234");
		Senha s2 = new Senha("user1", "abc");
		Senha s3 = new Senha("user2", "senha123");
		Senha s4 = new Senha("guest", "guest");
		
		usuarios.put(s1.getUsuario(), s1);
		usuarios.put(s2.getUsuario(), s2);
		usuarios.put(s3.getUsuario(), s3);
		usuarios.put(s4.getUsuario(), s4);
		
		System.out.print("Digite a senha: ");
		String senha = sc.next();
		
		verificarAcesso(usuarios, senha);
		
		sc.close();
	}
	
	public static void verificarAcesso(Map<String, Senha> usuarios, String senha) {
		for(String usuario : usuarios.keySet()) {
			if(usuarios.get(usuario).getSenha().equals(senha)) {
				System.out.println("ACESSO PERMITIDO");
				continue;
			}
			
			System.out.println("ACESSO NEGADO");
		}
	}

}
