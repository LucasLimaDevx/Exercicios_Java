package problema_8.model.entities;

import problema_8.model.interfaces.Sensor;

public class SensorTemperatura implements Sensor{
	private double temperatura;
	
	public SensorTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}

	public void lerValor(String msg) {
		
		if(msg == "Ler Sensor de Temperatura") {
			System.out.println(String.format("%.2f", temperatura) +"°C");
		}
		
		
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	
	
}
