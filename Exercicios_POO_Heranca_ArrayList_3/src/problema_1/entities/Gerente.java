package problema_1.entities;

public class Gerente extends Funcionario{
	public Gerente() {
		super();
	}

	public Gerente(String nome, Double salario) {
		super(nome, salario);
		
		this.salario = salario +1000;
	}
	
	
}
