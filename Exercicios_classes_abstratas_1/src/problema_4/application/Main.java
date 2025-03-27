package problema_4.application;

import java.util.Locale;

import problema_4.entities.Funcionario;
import problema_4.entities.Horista;
import problema_4.entities.Mensalista;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Funcionario f1 = new Horista("Pedro", 30, "Técnico", 20.0, 40);
		Funcionario f2 = new Horista("Lucas", 25, "Operador", 25.0, 30);
		Funcionario f3 = new Mensalista("Ana", 40, "Técnico", 3000.0);
		Funcionario f4 = new Mensalista("Carla", 35, "Técnico", 4500.0);
		
		
		System.out.println("Salário final: " + String.format("%.2f", f1.calcularSalario()));
		System.out.println("Salário final: " + String.format("%.2f", f2.calcularSalario()));
		System.out.println("Salário final: " + String.format("%.2f", f3.calcularSalario()));
		System.out.println("Salário final: " + String.format("%.2f", f4.calcularSalario()));
	}

}
