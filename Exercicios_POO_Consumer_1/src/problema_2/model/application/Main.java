package problema_2.model.application;

import java.util.List;
import java.util.function.Consumer;

import problema_2.model.entities.Aluno;

public class Main {

	public static void main(String[] args) {
		
		List<Aluno> alunos = List.of(
				new Aluno("João", "123"), 
				new Aluno("Ana", "456"), 
				new Aluno("Marcos", "789"),
				new Aluno("Carla", "1011")
				);
		
		Consumer<Aluno> cons = (a) -> a.setNome(a.getNome().concat(" Silva"));;
		
		alunos.forEach(cons);
		
		for(int i = 0 ; i < alunos.size(); i++) {
			System.out.println(alunos.get(i).getNome());
		}
		
		

	}

}
