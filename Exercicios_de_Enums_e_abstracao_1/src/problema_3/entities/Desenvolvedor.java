package problema_3.entities;

import problema_3.enums.Cargo;

public class Desenvolvedor extends Funcionario{
	public Desenvolvedor() {
		super();
	}

	public Desenvolvedor(Cargo cargo, Double salario) {
		super(cargo, salario);
	}

	@Override
	public Double calcularBonus() {
		
		return salario * 2;
	}
	
	
}
