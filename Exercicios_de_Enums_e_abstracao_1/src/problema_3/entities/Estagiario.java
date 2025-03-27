package problema_3.entities;

import problema_3.enums.Cargo;

public class Estagiario extends Funcionario{
	public Estagiario() {
		super();
	}

	public Estagiario(Cargo cargo, Double salario) {
		super(cargo, salario);
	}

	@Override
	public Double calcularBonus() {
		// TODO Auto-generated method stub
		return salario;
	}
	
	
}
