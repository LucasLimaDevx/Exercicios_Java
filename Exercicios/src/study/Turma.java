package study;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private List<Pessoa2> alunos = new ArrayList<Pessoa2>();
	
	public void addAluno(String nome, int idade) {
		
		Pessoa2 aluno = new Pessoa2();
		aluno.setNome(nome);
		aluno.setIdade(idade);
		
		alunos.add(aluno);
		
	}
	
	public List<String> listarAlunos(){
		
		List<String> nomes = new ArrayList<String>();
		
		for(Pessoa2 aluno : alunos) {
			nomes.add(aluno.getNome());
		}
		
		return nomes;
	}
}

/*package application;


import java.util.Locale;
import java.util.Scanner;

import study.Turma;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Turma turma = new Turma();
		
		turma.addAluno("Lucas", 23);
		turma.addAluno("Carlos", 22);
		turma.addAluno("Renan", 19);
		
		System.out.println(turma.listarAlunos());
		
		sc.close();
	}

}*/