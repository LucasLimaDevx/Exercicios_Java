package problema_3.model.application;

import java.util.Arrays;
import java.util.List;

import problema_3.model.entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		List<Funcionario> funcionarios = Arrays.asList(
				new Funcionario("João", 2000.0),
				new Funcionario("Maria", 3500.0),
				new Funcionario("Carlos", 1500.0),
				new Funcionario("Isabela", 5000.0)
		);
		for(int i = 0 ; i < funcionarios.size() ; i++) {
			
			Funcionario f = funcionarios.get(i);
			switch (i) {
				case 0: {
					Double salarioBase = f.getSalarioBase();
					Double bonus = f.getSalarioBase() * 0.1;
					Double salarioFinal = salarioBase + bonus;
					
					System.out.println(salarioBase);
					System.out.println(bonus);
					System.out.println(salarioFinal);
					System.out.println("--------");
					f.setSalarioBase(salarioFinal);
					break;
					
				}
				case 1: {
					Double salarioBase = f.getSalarioBase();
					Double bonus = f.getSalarioBase() * 0.15;
					Double salarioFinal = salarioBase + bonus;
					
					System.out.println(salarioBase);
					System.out.println(bonus);
					System.out.println(salarioFinal);
					System.out.println("--------");
					f.setSalarioBase(salarioFinal);
					break;
					
				}
				case 2: {
					Double salarioBase = f.getSalarioBase();
					Double bonus = f.getSalarioBase() * 0.20;
					Double salarioFinal = salarioBase + bonus;
					
					System.out.println(salarioBase);
					System.out.println(bonus);
					System.out.println(salarioFinal);
					System.out.println("--------");
					f.setSalarioBase(salarioFinal);
					break;
					
				}
				case 3: {
					Double salarioBase = f.getSalarioBase();
					Double bonus = f.getSalarioBase() * 0.05;
					Double salarioFinal = salarioBase + bonus;
					
					System.out.println(salarioBase);
					System.out.println(bonus);
					System.out.println(salarioFinal);
					System.out.println("--------");
					f.setSalarioBase(salarioFinal);
					break;
					
				}
			}
		}
		
		for(Funcionario f : funcionarios) {
			System.out.println(f.getSalarioBase());
		}
	}

}
