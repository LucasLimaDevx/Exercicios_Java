package problema_3.entities;

import problema_3.enums.Cargo;

public abstract class Funcionario {
	private Cargo cargo;
	protected Double salario;
	
	public Funcionario() {	
	}

	public Funcionario(Cargo cargo, Double salario) {
		
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public abstract Double calcularBonus();
}
