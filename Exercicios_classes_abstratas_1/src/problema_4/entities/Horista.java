package problema_4.entities;

public class Horista extends Funcionario{
	private Integer horas;

	
	public Horista() {
		
	}
	
	public Horista(String nome, Integer idade, String cargo, Double salarioBase, Integer horas) {
		super(nome, idade, cargo, salarioBase);
		this.horas = horas;
	}

	@Override
	public Double calcularSalario() {
		// TODO Auto-generated method stub
		return horas * salarioBase;
	}
	
	
}
