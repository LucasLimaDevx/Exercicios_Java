package problema_1.model.entities;

import problema_1.model.interfaces.OperacaoMatematica;

public class Multiplicacao implements OperacaoMatematica{

	@Override
	public Double calcular(Number valor_1, Number valor_2) {
		
		return valor_1.doubleValue() * valor_2.doubleValue();
	}

	@Override
	public String toString() {
		return "Multiplicacao ";
	}
	
	
}
