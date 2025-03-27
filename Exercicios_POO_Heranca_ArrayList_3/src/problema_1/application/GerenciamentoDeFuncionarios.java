package problema_1.application;

import java.util.ArrayList;
import java.util.List;

import problema_1.entities.Funcionario;

public class GerenciamentoDeFuncionarios {
	List<Funcionario> funcionarios = new ArrayList<>();
	
	public void adicionarFuncionarios(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void listarFuncionarios() {
		for(int i = 0 ; i < funcionarios.size() ; i++) {
			
			Funcionario funcionario = funcionarios.get(i);
			System.out.println("Nome do funcionario: " + funcionario.getNome());
			System.out.println("Salario do funcionario: " + funcionario.getSalario());
			System.out.println("--------------------------");
			
			
		}
	}
	
	public Double calcularFolhaDePagamento() {
		
		Double salarioTotal = 0.0;
		
		for(int i = 0 ; i < funcionarios.size() ; i++) {
			salarioTotal+= funcionarios.get(i).getSalario();
		}
		
		return salarioTotal;
	}
	
}
