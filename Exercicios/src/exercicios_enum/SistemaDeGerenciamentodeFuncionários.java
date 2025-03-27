package exercicios_enum;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeGerenciamentodeFuncionários {
	
	List<Funcionario> funcionarios = new ArrayList<>();
	
	public void adicionarFuncionario(String nome, Double salario, Cargo cargo) {
		
		Funcionario funcionario = new Funcionario(nome, salario, cargo);
		
		funcionarios.add(funcionario);
	}
	
	public void aumentarSalario(String nome, Double porcentagem) {
		
		for(Funcionario funcionario : funcionarios) {
			
			if(funcionario.getNome().equals(nome)) {
				
				Double novoSalario = funcionario.getSalario() + funcionario.getSalario() * (porcentagem / 100.0);
				funcionario.setSalario(novoSalario);
				
			}
			
		}
	}
	
	public void listarFuncionarios() {
		for(Funcionario funcionario : funcionarios) {
			System.out.println("Nome: " + funcionario.getNome() + "\nSalario: " + funcionario.getSalario());
			System.out.println("-----------------------------");
		}
	}
}
