package problema_3.model.entities;

import problema_3.model.interfaces.Veiculo;

public class Moto implements Veiculo{

	@Override
	public void acelerar(Double a) {
		System.out.println("Acelerando moto em " + String.format("%.2f", a));
		
	}

	@Override
	public void frear(Double f) {
		System.out.println("Freando moto em " + String.format("%.2f", f));
		
	}
	
}
