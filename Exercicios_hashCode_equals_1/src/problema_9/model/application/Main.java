package problema_9.model.application;

import problema_9.model.entities.Turma;

public class Main {

	public static void main(String[] args) {
		Turma turmaA = new Turma();
		turmaA.adicionarAluno("João");
		turmaA.adicionarAluno("Ana");
		
		Turma turmaB = new Turma();
		turmaB.adicionarAluno("João");
		turmaB.adicionarAluno("Ana");
		
		
		System.out.println("TURMA A X TURMA B = "+turmaA.equals(turmaB));
		
		Turma turmaC = new Turma();
		turmaC.adicionarAluno("Ana");
		turmaC.adicionarAluno("João");
		
		Turma turmaD = new Turma();
		
		turmaD.adicionarAluno("João");
		turmaD.adicionarAluno("Ana");
		
		System.out.println("TURMA C X TURMA D = " + turmaC.equals(turmaD));
		
		
		Turma turmaE = new Turma();
		turmaE.adicionarAluno("Carlos");
		
		
		Turma turmaF = new Turma();
		turmaF.adicionarAluno("Carlos");
		
		System.out.println("TURMA E X TURMA F = " + turmaE.equals(turmaF));
		
		Turma turmaG = new Turma();
		Turma turmaH = new Turma();
	
		
		System.out.println("TURMA G X TURMA H = " + turmaE.equals(turmaF));
		

	}

}
