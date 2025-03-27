package exercicios_poo_h;

public class Desenvolvedor extends Funcionario{
	
	public Desenvolvedor() {
		
	}
	
	public Desenvolvedor(String nome, Double salarioBase, Cargo cargo) {
		super(nome, salarioBase, cargo);
		
		calcularSalarioBase();
	}

	public void calcularSalarioBase() {
		
		setSalarioBase(this.salarioBase * (1 + 0.1));
	}
}
