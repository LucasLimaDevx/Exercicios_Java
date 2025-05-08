package problema_5.model.application;

import java.util.LinkedHashSet;
import java.util.Set;

import problema_5.model.entities.Livro;

public class Main {

	public static void main(String[] args) {
		Livro l1 = new Livro("Dom Casmurro");
		Livro l2 = new Livro("1984");
		Livro l3 = new Livro("Capitães da Areia");
		Livro l4 = new Livro("Biblía");
		
		Set<Livro> livros = new LinkedHashSet<>();
		
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		livros.add(l4);
		
		System.out.println(livros.contains(new Livro("Dom Casmurro")));
		System.out.println(livros.contains(new Livro("1984")));
		System.out.println(livros.contains(new Livro("Capitães da Areia")));
		System.out.println(livros.contains(new Livro("Biblía")));

	}

}
