package exercicios_poo;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaDeLivros {
	List<Livro> livros = new ArrayList<>();
	
	public void adicionarLivro(Livro livro) {
		livros.add(livro);
	}
	
	public void buscarLivro(String titulo) {
		System.out.println("Filtrando livro");
		
		if(livros.size() > 0) {
			Livro livroDesejando = null;
			
			for(Livro livro : livros) {
				if(livro.getTitulo().equals(titulo)) {
					livroDesejando = livro;
					break;
				}
			}
			
			if(livroDesejando != null) {
				System.out.println("Livro encontrado: " + livroDesejando);
			}else {
				System.out.println("O livro não foi encontrado.");
			}
			
		}else {
			System.out.println("Não existe nenhum livro no sistema.");
		}
	}
}
