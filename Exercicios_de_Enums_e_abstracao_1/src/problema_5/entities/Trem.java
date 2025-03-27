package problema_5.entities;

import problema_5.enums.TipoDeTransporte;

public class Trem extends Transporte{
	public Trem() {
		super();
	}

	public Trem(Double distancia, TipoDeTransporte tipoDeTransporte) {
		super(distancia, tipoDeTransporte);
	}

	@Override
	public Double calcularPassagem() {
		
		return distancia * 1.75;
	}
	
	
}
