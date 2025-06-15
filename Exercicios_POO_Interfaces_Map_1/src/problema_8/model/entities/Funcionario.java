package problema_8.model.entities;

public class Funcionario {
	private String nome;
	private Double salario;
	
	public Funcionario(String nome, Double salario) {
		
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void calcularSalario(Double porcentagem) {
		porcentagem /= 100.0;
		salario = salario * (1.0 + porcentagem);
	}
	
	
}
