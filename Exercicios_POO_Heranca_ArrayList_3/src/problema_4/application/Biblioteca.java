package problema_4.application;

import java.util.ArrayList;
import java.util.List;

import problema_4.entities.Ebook;
import problema_4.entities.Livro;

public class Biblioteca {
	List<Livro> livros = new ArrayList<>();
	
	public void adicionarLivro(Livro livro) {
		
		livros.add(livro);
		
	}
	
	public void listarQuantidadeDeLivros() {
		Integer totalLivro = 0;
		Integer totalEbook = 0;
		
		for(int i = 0 ; i < livros.size() ; i++) {
			Livro livro = livros.get(i);
			
			if(livro instanceof Ebook) {
				totalEbook++;
				continue;
			}
			
			totalLivro++;
			
		}
		
		System.out.println("Físicos: "+ totalLivro +", Ebooks: " + totalEbook);
	}
}
