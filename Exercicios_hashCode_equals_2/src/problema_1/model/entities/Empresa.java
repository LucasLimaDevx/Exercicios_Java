package problema_1.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	List<Funcionario> funcionarios = new ArrayList<>();
	
	public void adicionarFuncionario(String nome, String cpf, Double salario) {
		Funcionario funcionario = new Funcionario(nome, cpf, salario);
		
		funcionarios.add(funcionario);
	}
	
	public boolean verificarFuncionario(Funcionario obj) {
		for(Funcionario funcionario : funcionarios) {
			if(funcionario.equals(obj)) {
				return true;
			}
		}
		return false;
	}
}
