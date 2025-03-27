package exercicios_enum;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeGerenciamentoDeAlunos {
	List<Aluno> alunos = new ArrayList<>();
	
	public void adicionarAluno(String nome) {
		Aluno aluno = new Aluno(nome);
		
		alunos.add(aluno);
		
	}
	
	public void adicionarAluno(String nome, Double nota, Situacao situacao) {
		Aluno aluno = new Aluno(nome, nota, situacao);
		
		alunos.add(aluno);
		
	}
	
	public void adicionarNotaDoAluno(String nome, Double nota) {
		
		for(Aluno aluno : alunos) {
			
			if(aluno.getNome().equals(nome) && aluno.getNota() == null) {
				aluno.setNota(nota);
				
				if(nota >= 7) {
					aluno.setSituacao(Situacao.APROVADO);
				}else {
					aluno.setSituacao(Situacao.REPROVADO);
				}
				
			}
		}
	}
	
	public void listarAlunos() {
		System.out.println("LISTA DE TODOS OS ALUNOS");
		System.out.println("---------------------");
		for(Aluno aluno : alunos) {
			System.out.println("Nome: "+ aluno.getNome() + "\nNota: " + aluno.getNota() + "\nSituação: " + aluno.getSituacao());
			System.out.println("---------------------");
		}
	}
}
