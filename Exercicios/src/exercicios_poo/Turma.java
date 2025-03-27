package exercicios_poo;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private String codigo;
	private List<Aluno> alunos = new ArrayList<>();
	
	
	
	public Turma(String codigo) {

		this.codigo = codigo;
	
	}

	public String getCodigo() {
		return codigo;
	}
	
	public void adicionarAluno(String nome, Integer matricula, Double nota) {
		Aluno aluno = new Aluno(nome, matricula, nota);
		
		alunos.add(aluno);
	}
	
	public void listarAlunos() {
		for(Aluno aluno : alunos) {
			System.out.println(aluno.getNome());
		}
	}
	
	
	
	
}
