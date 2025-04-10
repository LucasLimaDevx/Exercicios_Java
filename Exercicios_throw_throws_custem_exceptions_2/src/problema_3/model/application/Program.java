package problema_3.model.application;

import java.util.Locale;
import java.util.Scanner;

import problema_3.model.exception.EmprestimoExcedidoException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		
		try {
			System.out.print("Digite o valor do salário: ");
			Double salario = input.nextDouble();
			
			System.out.print("Digite o valor do empréstimo: ");
			Double emprestimo = input.nextDouble();
			
			verificarEmprestimo(salario, emprestimo);
			
		}
		catch(EmprestimoExcedidoException e) {
			System.out.println(e.getMessage());
		}
		
		input.close();
	}
	
	public static void verificarEmprestimo(Double salario, Double emprestimo) throws EmprestimoExcedidoException {
		if( emprestimo < salario * 5.0 ) {
			throw new EmprestimoExcedidoException("Valor do empréstimo excede o limite de 5 vezes salário");
		}
		System.out.println("Empréstimo aprovado");
	}

}
