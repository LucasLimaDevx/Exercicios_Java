package problema_3.model.application;

import java.util.ArrayList;
import java.util.List;

import problema_3.model.entities.Livro;

public class Main {

	public static void main(String[] args) {
		
		List<Livro> livros = new ArrayList<Livro>();
		
		livros.add(new Livro("Java Básico", 10));
		livros.add(new Livro("POO em Java", 7));
		livros.add(new Livro("Estrutura de Dados", 4));
		livros.add(new Livro("SQL essencial", 0));
		
		
		livros.forEach((l) -> l.setQuantidade(l.getQuantidade() + 5));
		
		livros.forEach(l -> System.out.println(l.getQuantidade()));

	}

}
