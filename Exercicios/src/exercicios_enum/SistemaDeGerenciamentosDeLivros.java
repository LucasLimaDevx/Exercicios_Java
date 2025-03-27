package exercicios_enum;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeGerenciamentosDeLivros {
	List<Livro> livros = new ArrayList<>();
	
	public void adicionarLivro(String titulo, String autor, Status status) {
		Livro livro = new Livro(titulo, autor, status);
		
		livros.add(livro);
	}
	
	public void alterarStatus(String titulo, Status status) {
		for(Livro livro : livros) {
			
			if(livro.getTitulo() == titulo && livro.getStatus() != status) {
				livro.setStatus(status);
			}
			
		}
	}
	
	public void filtarLivros(Status status) {
		System.out.println("LIVROS COM STATUS DE " + status);
		
		for(Livro livro : livros) {
			if(livro.getStatus() == status) {
				System.out.println("Título: " + livro.getTitulo());
				System.out.println("Autor: " + livro.getAutor());
				System.out.println("----------------");
			}
		}
	}

}
