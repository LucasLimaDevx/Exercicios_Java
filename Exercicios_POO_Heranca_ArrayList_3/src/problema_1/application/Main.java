package problema_1.application;

import problema_1.entities.Funcionario;
import problema_1.entities.Gerente;

public class Main {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("João", 3000.0);
		Funcionario f2 = new Funcionario("Ana", 4000.0);
		Funcionario f3 = new Gerente("Carlos", 5000.0);
		
		GerenciamentoDeFuncionarios sistema = new GerenciamentoDeFuncionarios();
		sistema.adicionarFuncionarios(f1);
		sistema.adicionarFuncionarios(f2);
		sistema.adicionarFuncionarios(f3);
		
		sistema.listarFuncionarios();

		
		Double folhaDePagamento= sistema.calcularFolhaDePagamento();
		System.out.println();
		
		System.out.println("Folha total: R$"+String.format("%.2f", folhaDePagamento));

	}

}
