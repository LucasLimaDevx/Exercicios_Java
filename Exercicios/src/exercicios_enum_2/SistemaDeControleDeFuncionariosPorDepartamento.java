package exercicios_enum_2;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeControleDeFuncionariosPorDepartamento {
	List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public void adicionarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public String buscarPorDepartamento(Departamento departamento) {
		StringBuilder sb = new StringBuilder();
		
		System.out.println("LISTANDO FUNCIONARIOS DO: " + departamento);
		for(Funcionario funcionario : funcionarios) {
			if(funcionario.getDepartamento() == departamento) {
				
				sb.append("Funcionario:" + funcionario.getNome());
				sb.append(" Salario: " + String.format("%.2f", funcionario.getSalario()));
				sb.append(" Departamento: " + funcionario.getDepartamento()  + "\n");
			}
		}
		
		return sb.toString();
	}
	
	
	public String calcularMediaSalarial(Departamento departamento) {
		Double soma = 0.0;
		Integer totalFuncionarios = 0;
		for(Funcionario funcionario : funcionarios) {
			if(funcionario.getDepartamento() == departamento) {
				soma += funcionario.getSalario();
				totalFuncionarios++;
			}
		}
		Double media = soma / totalFuncionarios;
		return "Média salarial do departamento " + departamento + ": " + String.format("%.2f", media);
	}
}
