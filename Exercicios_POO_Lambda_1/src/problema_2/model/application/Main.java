package problema_2.model.application;

import java.util.Arrays;
import java.util.List;

import problema_2.model.entities.Estudante;

public class Main {

	public static void main(String[] args) {/*
		List<Estudante> estudantes = new ArrayList<>(List.of(
				new Estudante("Ana", 7.5),
				new Estudante("João", 9.2),
				new Estudante("Carla", 8.0)
		));*/
		
		List<Estudante> estudantes = Arrays.asList(
				new Estudante("Ana", 7.5),
				new Estudante("João", 9.2),
				new Estudante("Carla", 8.0)
		);
		estudantes.sort((e1, e2) -> {
			return e2.getNota().compareTo(e1.getNota());
		});
		
		for(Estudante e : estudantes) {
			System.out.println(e.getNome());
		}
		

	}

}
