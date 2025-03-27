package problema_4.application;

import problema_4.entities.Ebook;
import problema_4.entities.Livro;

public class Main {

	public static void main(String[] args) {
		Livro l1 = new Livro("Hobbit");
		Livro l2 = new Ebook("Clean Code", 5);
		Livro l3 = new Livro("Hobbit");
		Livro l4 = new Livro("Dom Casmurro");
		Livro l5 = new Ebook("Design Patterns", 6);
		
		
		Biblioteca sistema1 = new Biblioteca();
		Biblioteca sistema2 = new Biblioteca();
		
		
		sistema1.adicionarLivro(l1);
		sistema1.adicionarLivro(l2);
		sistema1.adicionarLivro(l3);
		
		sistema1.listarQuantidadeDeLivros();

		sistema2.adicionarLivro(l4);
		sistema2.adicionarLivro(l5);
		
		sistema2.listarQuantidadeDeLivros();
	}

}
