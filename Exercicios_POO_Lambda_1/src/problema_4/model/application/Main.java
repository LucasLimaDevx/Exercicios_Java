package problema_4.model.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import problema_4.model.entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		List<Pessoa> pessoas = Arrays.asList(
				new Pessoa("Felipe"),
				new Pessoa("Fernanda"),
				new Pessoa("Fábio"),
				new Pessoa("Lucas")
		);
		
		List<Pessoa> pessoasFiltradas =
				pessoas.stream()
				.filter(pessoa -> pessoa.getNome().toUpperCase().charAt(0) == 'F')
				.collect(Collectors.toList());
		
		for(Pessoa p : pessoasFiltradas) {
			System.out.println(p.getNome());
		}
	}
	
	

}
