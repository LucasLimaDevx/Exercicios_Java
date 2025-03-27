package exercicios_poo_h_2;

public class Funcionario {
	private String nome;
	private Double salario;
	private Departamento departamento;
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, Double salario, Departamento departamento) {
	
		this.nome = nome;
		this.salario = salario;
		this.departamento = departamento;
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

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
	
}
