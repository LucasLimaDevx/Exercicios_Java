package problema_9.model.entities;

import java.util.List;

public class CalculadoraEstatistica{
	
	public static Double calcularMedia(List<? extends Number> numeros) {
		Double soma = 0.0;
		
		for(Number numero : numeros ) {
			soma += numero.doubleValue();
		}
		
		return soma / numeros.size();
	}
	
	public static Double calcularDesvioPadrao(List<? extends Number> numeros) {
		
		Double soma = 0.0;
		Double mediaDosValores = calcularMedia(numeros);
		
		for(Number numero : numeros) {
			
			soma += Math.pow((numero.doubleValue() - mediaDosValores), 2);
		}
		
		Double desvioPadrao = Math.sqrt(soma / numeros.size());
		
		return desvioPadrao;
	}
}
