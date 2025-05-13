package problema_4.model.application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import problema_4.model.entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Map<String, Funcionario> funcionarios = new HashMap<>();
		
		for(int i = 0 ; i < 4 ; i++) {
			
			System.out.print("CPF: ");
			String cpf = sc.next();
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Faltas: ");
			Integer faltas = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			
			Funcionario funcionario = new Funcionario(nome, cpf, faltas);
			
			funcionarios.put(funcionario.getCpf(), funcionario);
			
			
		}
		
		listarFuncionario(funcionarios);
		
		sc.close();

	}
	
	public static void listarFuncionario(Map<String, Funcionario> map) {
		for(String key : map.keySet()) {
			Funcionario f = map.get(key);
			
			if(f.getFaltas() > 2) {
				System.out.println(f.getCpf());
			}
		}
	}

}
