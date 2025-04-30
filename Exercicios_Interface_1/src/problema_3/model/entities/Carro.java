package problema_3.model.entities;

import problema_3.model.interfaces.Veiculo;

public class Carro implements Veiculo{

	@Override
	public void acelerar(Double a) {
		System.out.println("Acelerando carro em " + String.format("%.2f", a));
	}

	@Override
	public void frear(Double f) {
		System.out.println("Freando carro em " + String.format("%.2f", f));
		
	}
	
}
