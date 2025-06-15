package problema_2.model.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import problema_2.model.entities.Aluno;

public class Main {

	public static void main(String[] args) {
		List<Aluno> turma = new ArrayList<Aluno>();
		
		turma.add(new Aluno("João", 7.0, 80.0));
		turma.add(new Aluno("Maria", 5.5, 90.0));
		turma.add(new Aluno("Carlos", 6.5, 70.0));
		turma.add(new Aluno("Ana", 8.0, 85.0));
		
		List<Aluno> alunosAprovados = turma
				.stream()
				.filter(aluno -> aluno.getMediaFinal() >= 6.0 && aluno.getPercentualPresenca() >= 75.0)
				.collect(Collectors.toList());
		
		
		for(Aluno a : alunosAprovados) {
			System.out.println(a.getNome());
		}
		

	}

}
