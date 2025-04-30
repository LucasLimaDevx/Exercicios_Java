package problema_6.model.entities;

import problema_6.model.interfaces.Funcionario;

public class Vendedor implements Funcionario{
	private String nome;
	private double salario;
	
	public Vendedor(String nome, double salario) {
		
		this.nome = nome;
		this.salario = salario;
	}


	@Override
	public void calcularSalario(double bonificacao) {
		
		this.salario += bonificacao;
	}


	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return this.nome;
	}


	@Override
	public double getSalario() {
		
		return this.salario;
	}

	
	
	
}
