package exercicios_poo;

import java.util.ArrayList;
import java.util.List;

public class ControleDeTurma {
	List<Turma> turmas = new ArrayList<>();
	
	public void adicionarTurma(Turma turma) {
		
		
		turmas.add(turma);
	}
	
	public void listarTurmas() {
		for(Turma turma : turmas) {
			System.out.println("TURMA: " + turma.getCodigo());
			turma.listarAlunos();
			System.out.println();
		}
	}
}
