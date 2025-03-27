package exercicios_poo;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeFuncionarios {
	List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public void adicionarFuncionario(String nome, String cargo, Double salario) {
		Funcionario funcionario = new Funcionario(nome, cargo, salario);
		
		funcionarios.add(funcionario);
	}
	
	public void exibirFuncionario() {
		
		for(Funcionario funcionario : funcionarios) {
			if(funcionario.getSalario() > 3000) {
				System.out.println(funcionario.getNome());
			}
		}
	}
}
