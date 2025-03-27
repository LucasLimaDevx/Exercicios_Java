package exercicios_poo_h;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaDigital {
	List<Livro> livros = new ArrayList<>();
	
	public void adicionarLivro(Livro livro) {
		livros.add(livro);
	}
	
	
	public void listarLivros() {
		for(Livro livro : livros) {
			System.out.println(livro.toString());
		}
	}
}
