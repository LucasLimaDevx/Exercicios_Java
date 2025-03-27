package exercicios_poo_h_2;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaDigital {
	List<Livro> livros = new ArrayList<>();
	
	public void adicionarLivro(Livro livro) {
		livros.add(livro);
	}
	
	public void exibirLivrosDigitais() {
		for(Livro l : livros) {
			
			if(l.getTipoDoLivro() == TipoDoLivro.LIVRO_DIGITAL) {
				System.out.println(l);
			}
		
		}
	}
}
