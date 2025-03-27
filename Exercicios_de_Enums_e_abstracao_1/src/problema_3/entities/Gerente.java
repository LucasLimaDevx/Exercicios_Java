package problema_3.entities;

import problema_3.enums.Cargo;

public class Gerente extends Funcionario{
	public Gerente() {
		super();
	}

	public Gerente(Cargo cargo, Double salario) {
		super(cargo, salario);
	}

	@Override
	public Double calcularBonus() {
		
		return salario * 3;
	}
	
	
}
