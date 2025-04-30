package problema_8.model.application;

import java.util.Locale;

import problema_8.model.entities.SensorPressao;
import problema_8.model.entities.SensorTemperatura;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		SensorTemperatura st1 = new SensorTemperatura(25.0);
		SensorPressao sp1 = new SensorPressao(990.0);
		SensorTemperatura st2 = new SensorTemperatura(30.0);
		SensorPressao sp2 = new SensorPressao(990.0);
		
		st1.lerValor("Ler Sensor de Temperatura");
		st2.lerValor("Ler Sensor de Temperatura");
		sp1.lerValor("Ler Sensor de Pressão");
		sp2.lerValor("Ler Sensor de Pressão");
	}

}
