package exercicios_poo;

import java.util.ArrayList;
import java.util.List;

public class ControleDeAlunos {
	List<Aluno> alunos = new ArrayList<>();
	
	public void adicionarAluno(String nome, Integer matricula, Double nota) {
		Aluno aluno = new Aluno(nome, matricula, nota);
		
		alunos.add(aluno);
	}
	
	public void filtrarAlunos() {
		for(Aluno aluno : alunos) {
			if(aluno.getNota() > 7) {
				System.out.println(aluno.getNome());
			}
		}
	}
}
