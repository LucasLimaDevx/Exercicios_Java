package problema_5.entities;

import problema_5.enums.TipoDeTransporte;

public class Onibus extends Transporte {
	public Onibus() {
		super();
	}

	public Onibus(Double distancia, TipoDeTransporte tipoDeTransporte) {
		super(distancia, tipoDeTransporte);
	}

	@Override
	public Double calcularPassagem() {
		
		return distancia * 1.50;
	}
	
	
}
