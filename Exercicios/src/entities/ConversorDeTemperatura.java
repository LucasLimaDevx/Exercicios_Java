package entities;

public class ConversorDeTemperatura {
	public double celsius;
	
	public double converterParaFahrenheit() {
		return celsius * (9.0 / 5.0 ) + 32;
	}
	
	public double converterParaKelvin() {
		return celsius + 273.15;
	}
}
