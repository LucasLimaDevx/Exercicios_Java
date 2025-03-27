package problema_2.entities;

import problema_2.enums.TipoDeVeiculo;

public class Moto extends Veiculo{
	public Moto() {
		super();
	}

	public Moto(TipoDeVeiculo veiculo, Double valor) {
		super(veiculo, valor);
	}

	@Override
	public Double calcularImposto() {
		
		return valor * 0.01;
	}
	
	
}
