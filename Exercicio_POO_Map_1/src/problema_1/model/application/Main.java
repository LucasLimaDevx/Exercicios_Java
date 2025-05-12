package problema_1.model.application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import problema_1.model.entities.Aluno;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Aluno> alunos = new ArrayList<>();
		Map<Integer, Aluno> turma = new HashMap<Integer, Aluno>();
				
		
		for(int i = 0 ; i < 4 ; i++ ) {
			System.out.print("Matrícula: ");
			Integer matricula = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Nome do aluno: ");
			String nome = sc.nextLine();
			
			
			System.out.print("Nota final do aluno: ");
			Double nota = sc.nextDouble();
			sc.nextLine();
			
			
			
			alunos.add(new Aluno(nome, nota, matricula));
			
			System.out.println();
			
			
		}
		
		for(Aluno aluno : alunos) {
			turma.put(aluno.getMatricula(), aluno);
		}
		
		System.out.println(buscarMaiorNota(turma));
		
		
		
		sc.close();
	}
	
	public static String buscarMaiorNota(Map<Integer, Aluno> map) {
		Double maiorNota = null;
		String alunoMaiorNota = null;
		
		for(Integer key : map.keySet()) {
			if(maiorNota == null && map.get(key).getNotaFinal() != null) {
				maiorNota = map.get(key).getNotaFinal();
				alunoMaiorNota = map.get(key).getNome();
			}else {
				
				if(map.get(key).getNotaFinal() > maiorNota) {
					maiorNota = map.get(key).getNotaFinal();
					alunoMaiorNota = map.get(key).getNome();
				}
				
			}
			
			
		}
		
		return alunoMaiorNota;
	}

}
