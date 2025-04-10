package problema_9.model.application;

import java.util.ArrayList;
import java.util.List;

import problema_9.model.entities.Curso;

public class CadastroDeCurso {
	List<Curso> cursos = new ArrayList<Curso>();
	
	public void adicionarCurso(Curso curso) {
		cursos.add(curso);
	}
	
	public void listarCursos() {
		for(Curso curso : cursos) {
			System.out.println("Nome do curso: " + curso.getNome());
			System.out.println("Duração do curso: " + curso.getDuracao()+" horas");
			System.out.println("------------------------");
		}
	}
}
