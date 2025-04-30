package problema_6.model.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import problema_6.model.interfaces.Funcionario;
import problema_6.model.entities.Gerente;
import problema_6.model.entities.Vendedor;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Funcionario> gerentes = new ArrayList<>();
		List<Funcionario> vendedores = new ArrayList<>();
		
		Gerente g1 = new Gerente("João", 3000.0);
		Gerente g2 = new Gerente("Maria", 2000.0);
		
		g1.calcularSalario(1000.0);
		g2.calcularSalario(800.0);
		
		gerentes.add(g1);
		gerentes.add(g2);
		
		Vendedor v1 = new Vendedor("Carlos", 1500.0);
		Vendedor v2 = new Vendedor("Bruna", 1800.0);
		
		v1.calcularSalario(500.0);
		v2.calcularSalario(600.0);
		
		vendedores.add(v1);
		vendedores.add(v2);
		
		
		listarFuncionarios(gerentes);
		listarFuncionarios(vendedores);
		
		
	}
	
	
	public static void listarFuncionarios(List<Funcionario> funcionarios) {
		for(Funcionario f : funcionarios) {
			System.out.println("Nome: " + f.getNome());
			System.out.println("Salário: " + String.format("%.2f", f.getSalario()));
			System.out.println("--------------------");
		}
	}
	
	
}
