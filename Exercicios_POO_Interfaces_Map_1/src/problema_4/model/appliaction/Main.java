package problema_4.model.appliaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import problema_4.model.entities.Aluno;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Map<String, List<Aluno>> alunos = new HashMap<>();
		List<Aluno> turma = new ArrayList<>();
		
		turma.add(new Aluno("João", 11, List.of(7.0, 8.0, 9.0)));
		turma.add(new Aluno("Maria", 10, List.of(10.0, 9.0, 8.0)));
		turma.add(new Aluno("Pedro", 12, List.of(6.0, 7.0, 8.0)));
		turma.add(new Aluno("Ana", 13, List.of(7.0, 8.0, 9.0)));
		
		alunos.put("Alunos", turma);
		
		for(String str : alunos.keySet()) {
			List<Aluno> list = alunos.get(str);
			
			for(Aluno a : list) {
				System.out.println("Média: " + a.calcularMediaFinal());
			}
		}
		

	}

}
