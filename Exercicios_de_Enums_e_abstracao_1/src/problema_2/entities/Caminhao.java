package problema_2.entities;

import problema_2.enums.TipoDeVeiculo;

public class Caminhao extends Veiculo{
	public Caminhao() {
		super();
	}

	public Caminhao(TipoDeVeiculo veiculo, Double valor) {
		super(veiculo, valor);
	}

	@Override
	public Double calcularImposto() {
		
		return valor * 0.03;
	}
	
	
}
