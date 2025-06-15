package problema_5.model.entities;

import problema_5.model.interfaces.Imposto;

public class ImpostoConsumo  implements Imposto {

	
	private Double renda;

	public ImpostoConsumo(Double renda) {
		
		this.renda = renda;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}

	@Override
	public Double calcularImposto() {
	
		return renda * (1.0 - 0.8);
	}
	
	
	
	
}
