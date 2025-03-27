package exercicios_poo_h_2;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoDeCursos {
	List<Curso> cursos = new ArrayList<>();
	
	public void adicionarCurso(Curso curso) {
		cursos.add(curso);
	}
	
	public void listarCursos() {
		for(Curso c : cursos) {
			if(c instanceof Online) {
				System.out.println(c.getNome() + " - Duração: " + c.getDuracao()+"h");
			}
		}
	}
}
