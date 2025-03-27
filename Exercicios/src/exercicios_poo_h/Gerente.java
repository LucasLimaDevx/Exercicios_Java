package exercicios_poo_h;

public class Gerente extends Funcionario {
	
	public Gerente() {
		
	}
	
	public Gerente(String nome, Double salarioBase, Cargo cargo) {
		super(nome, salarioBase, cargo);
		
		calcularSalarioBase();
	}


	public void calcularSalarioBase() {
		
		setSalarioBase(this.salarioBase * (1 + 0.2));
	}
}
