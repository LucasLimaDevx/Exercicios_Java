package problema_1.model.entities;

import problema_1.model.interfaces.OperacaoMatematica;

public class Multiplicacao implements OperacaoMatematica {

	@Override
	public <T extends Number> Double calcular(T n1, T n2) {
		
		return n1.doubleValue() * n2.doubleValue();
	}

	@Override
	public String toString() {
		return "Multiplicação";
	}
	
	

}
