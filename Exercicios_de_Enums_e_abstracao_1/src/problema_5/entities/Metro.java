package problema_5.entities;

import problema_5.enums.TipoDeTransporte;

public class Metro extends Transporte{
	public Metro() {
		super();
	}

	public Metro(Double distancia, TipoDeTransporte tipoDeTransporte) {
		super(distancia, tipoDeTransporte);
	}

	@Override
	public Double calcularPassagem() {
		
		return distancia * 2.0;
	}
	
	
}
