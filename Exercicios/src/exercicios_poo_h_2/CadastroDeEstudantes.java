package exercicios_poo_h_2;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeEstudantes {
	List<Estudante> estudantes = new ArrayList<>();
	
	public void adicionarEstudante(Estudante estudante) {
		estudantes.add(estudante);
	}
	
	public void listarEstudantes() {
		for(int i = 0 ; i < estudantes.size() ; i++) {
			
			if(estudantes.get(i) instanceof PosGraduacao) {
				PosGraduacao estudante = (PosGraduacao) estudantes.get(i);
				System.out.println(estudante.getNome() + " - Curso: " + estudante.getCurso());
			}
			
		}
	}
}
