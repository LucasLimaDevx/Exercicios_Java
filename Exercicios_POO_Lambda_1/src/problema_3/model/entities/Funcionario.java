package problema_3.model.entities;

public class Funcionario {
	private String nome;
	private Double salarioBase;
	
	public Funcionario(String nome, Double salarioDouble) {
		this.nome = nome;
		this.salarioBase = salarioDouble;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
}
