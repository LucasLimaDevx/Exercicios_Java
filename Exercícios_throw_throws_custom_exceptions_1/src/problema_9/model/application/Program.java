package problema_9.model.application;

import problema_9.model.entities.Curso;
import problema_9.model.exception.DuracaoCursoInvalidaException;

public class Program {

	public static void main(String[] args) {
		CadastroDeCurso sistema = new CadastroDeCurso();
		
		try {
			Curso c1 = new Curso("Matemática", 20);
			Curso c2 = new Curso("Física", 8);
			
			sistema.adicionarCurso(c1);
			sistema.adicionarCurso(c2);
			
			sistema.listarCursos();
		}
		catch(DuracaoCursoInvalidaException e) {
			System.out.println(e.getMessage());
		}

	}

}
