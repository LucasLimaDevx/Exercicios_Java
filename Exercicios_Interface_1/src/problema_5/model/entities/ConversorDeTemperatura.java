package problema_5.model.entities;

import problema_5.model.interfaces.Conversor;

public class ConversorDeTemperatura implements Conversor{

	@Override
	public double conveter(double temperaturaCelsius) {
		
		return temperaturaCelsius * (9.0 / 5.0) + 32.0;
	}
	
}
