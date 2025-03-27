package exercicios_poo_h_2;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoDeFuncionarios {
	List<Funcionario> funcionarios = new ArrayList<>();
	
	public void adicionarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void listarGerentes() {
		for(Funcionario f : funcionarios) {
	
			if(f instanceof Gerente) {
				
				if(f.getDepartamento() == Departamento.FINANCEIRO) {
					
					System.out.println(f.getNome() + " - Salário: " + f.getSalario() + " Departamento: Financeiro");
					
				}else {
					
					System.out.println(f.getNome() + " - Salário: " + f.getSalario() + " Departamento: TI");
					
				}
			}
		}
	}
}
