package exercicios_poo_h;

public class Funcionario {
	private String nome;
	protected Double salarioBase;
	private Cargo cargo;
	
	public Funcionario(){
		
	}

	public Funcionario(String nome, Double salarioBase, Cargo cargo) {
		
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.cargo = cargo;
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

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	
	
}
