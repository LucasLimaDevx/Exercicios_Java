package problema_4.entities;

public class Mensalista extends Funcionario{
	public Mensalista() {
		super();
	}

	public Mensalista(String nome, Integer idade, String cargo, Double salarioBase) {
		super(nome, idade, cargo, salarioBase);
	}

	@Override
	public Double calcularSalario() {
		// TODO Auto-generated method stub
		return salarioBase;
	}
	
	
}
