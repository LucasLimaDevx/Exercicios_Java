package problema_3.application;

import java.util.Locale;
import java.util.Scanner;

import problema_3.entities.Desenvolvedor;
import problema_3.entities.Estagiario;
import problema_3.entities.Funcionario;
import problema_3.entities.Gerente;
import problema_3.enums.Cargo;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tipo de funcionário: ");
		String tipoDeFuncionario = sc.next().toUpperCase();
		
		System.out.print("Digite o salário do funcionário: ");
		Double salario = sc.nextDouble();
		
		Funcionario funcionario;
		
		switch(tipoDeFuncionario) {
			case "GERENTE":
				funcionario = new Gerente(Cargo.valueOf(tipoDeFuncionario), salario);
				break;
			case "DESENVOLVEDOR":
				funcionario = new Desenvolvedor(Cargo.valueOf(tipoDeFuncionario), salario);
				break;
			default:
				funcionario = new Estagiario(Cargo.valueOf(tipoDeFuncionario), salario);
				
		}
		
		Double salarioFinal = funcionario.calcularBonus();
		
		System.out.println("Salário: " + String.format("%.2f", salarioFinal));
		
		sc.close();
		
	}

}
