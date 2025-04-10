package problema_4.model.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import problema_4.model.entities.Usuario;
import problema_4.model.exception.UsuarioNaoAutenticadoException;

public class Program {

	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("admin", "senha123");
		Usuario u2 = new Usuario("admin", "123456");
		Scanner input = new Scanner(System.in);
		
		
		lista.add(u1);
		lista.add(u2);
		
		System.out.print("Digite o nome do usuário: ");
		String nome = input.next();
		System.out.print("Digite a senha do usuário: ");
		String senha = input.next();
		
		try {
			verificarUsuario(nome, senha, lista);
		}
		catch(UsuarioNaoAutenticadoException e) {
			System.out.println(e.getMessage());
		}
		input.close();

	}
	
	public static void verificarUsuario(String n, String s, List<Usuario> lista) throws UsuarioNaoAutenticadoException{
		boolean res = false;
		
		for(Usuario u : lista) {
			
			if(u.getUsuario().equals(n) && u.getSenha().equals(s)) {
				res = true;
			}
		}
		
		if(!res) {
			throw new UsuarioNaoAutenticadoException("Usuário ou senha incorretos");
		}
		System.out.println("Login bem-sucedido");
	}
}
