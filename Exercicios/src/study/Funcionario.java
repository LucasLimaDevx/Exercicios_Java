package study;

public class Funcionario {
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		
		this.nome = nome;
		this.salario = salario;
		
	}
	
	public String getNome() {
		return nome;
	}


	public double calcularSalarioAnual() {
		return 12.0 * salario;
	}
	
}
/*package application;


import java.util.Locale;
import java.util.Scanner;

import study.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario("Joana", 3000);
		
		System.out.println("O salário anual de " + funcionario + " é " + funcionario.calcularSalarioAnual());
		
		sc.close();
	}

}*/