package problema_4.entities;

public abstract class Funcionario {
	private String nome;
	private Integer idade;
	private String cargo;
	protected Double salarioBase;
	
	public Funcionario() {
	}

	
	public Funcionario(String nome, Integer idade, String cargo, Double salarioBase) {
	
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.salarioBase = salarioBase;
	}
	
	


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public Double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public abstract Double calcularSalario();
	
	
}
