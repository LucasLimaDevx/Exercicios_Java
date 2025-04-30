package problema_5.model.entities;

import problema_5.model.interfaces.Conversor;

public class ConversorDeDistancia implements Conversor{

	@Override
	public double conveter(double distanciaMilhas) {
		// TODO Auto-generated method stub
		return distanciaMilhas / 1.609;
	}
	
}
