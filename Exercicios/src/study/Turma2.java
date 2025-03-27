package study;

import java.util.ArrayList;
import java.util.List;

public class Turma2 {
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
	
	public List<String> listarAlunosMaiorDeIdade(){
		
		List<String> nomes = new ArrayList<String>();
		
		for(Pessoa2  aluno : alunos) {
			
			if(aluno.getIdade() >= 18) {
				nomes.add(aluno.getNome());
			}
			
		}
		
		return nomes;
	}
}
/*package application;


import java.util.Locale;
import java.util.Scanner;

import study.Turma2;




public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Turma2 turma = new Turma2();
		
		turma.addAluno("Lucas", 24);
		turma.addAluno("Rafael", 17);
		turma.addAluno("Maria", 18);
		turma.addAluno("Carlos", 30);
		turma.addAluno("Rebeca", 11);
		
		System.out.println(turma.listarAlunosMaiorDeIdade());
		
		sc.close();
	}

}*/