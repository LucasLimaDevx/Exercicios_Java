package problema_3.model.application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<String, Livro> biblioteca = new HashMap<>();
		
		for(int i = 0 ; i < 4 ; i++ ) {
			System.out.print("Código: ");
			String codigo = input.next();
			input.nextLine();
			
			
			System.out.print("Título: ");
			String titulo = input.nextLine();
			
			System.out.print("Emprestado: ");
			Boolean emprestado = input.nextBoolean();
			
			Livro livro = new Livro(codigo, titulo, emprestado);
			
			biblioteca.put(livro.getCodigo(), livro);
			
			System.out.println();
			
		}
		
		System.out.println(listarLivrosDisponiveis(biblioteca));
		
		
		
		input.close();
	}
	
	public static List<String> listarLivrosDisponiveis(Map<String, Livro> biblioteca){
		List<String> livrosDisponiveis = new ArrayList<>();
		
		for(String key : biblioteca.keySet()) {
			
			if(biblioteca.get(key).getEmprestado() == false) {
				livrosDisponiveis.add(biblioteca.get(key).getTitulo());
			}
		}
			
			
			
			
		return livrosDisponiveis;
	}
}
