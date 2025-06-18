package problema_9.model.application;

import java.util.List;

import problema_9.model.entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		List<Pessoa> pessoas = List.of(
			new Pessoa("joão"),
			new Pessoa("ana"),
			new Pessoa("marcos"),
			new Pessoa("carla")
		);
		
		
		pessoas.forEach(p -> p.setNome(p.getNome().toUpperCase()));
		
		for(Pessoa p : pessoas) {
			System.out.println(p.getNome());
		}
	}

}
