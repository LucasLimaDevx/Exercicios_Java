package problema_2.entities;

import problema_2.enums.TipoDeVeiculo;

public class Carro extends Veiculo{
	public Carro() {
		super();
	}

	public Carro(TipoDeVeiculo veiculo, Double valor) {
		super(veiculo, valor);
	}

	@Override
	public Double calcularImposto() {
		
		return valor * 0.02;
	}
	
	
}
