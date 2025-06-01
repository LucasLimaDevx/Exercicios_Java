package problema_7.model.entities;

import java.util.List;
import java.util.stream.Collectors;

public class Temperatura {
	private List<Double> temperaturas;
	
	public Temperatura(List<Double> temperaturas) {
		this.temperaturas = temperaturas;
	}

	public List<Double> getTemperaturas() {
		return temperaturas;
	}
	
	public List<Double> converterParaFahrenheit(){
		return this.temperaturas
				.stream()
				.map(temperatura -> (9.0/5.0) * temperatura + 32.0)
				.collect(Collectors.toList());
	}
	
}
