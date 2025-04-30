package problema_8.model.entities;

import problema_8.model.interfaces.Sensor;

public class SensorPressao implements Sensor{
	private double pressao;
	
	public SensorPressao(double pressao) {
	
		this.pressao = pressao;
	}

	@Override
	public void lerValor(String msg) {
		if(msg == "Ler Sensor de Pressão") {
			System.out.println(String.format("%.2f", pressao) +"°hPa");
		}
		
		
	}

	public double getPressao() {
		return pressao;
	}

	public void setPressao(double pressao) {
		this.pressao = pressao;
	}
	
	
	
	
	
	
	
}
