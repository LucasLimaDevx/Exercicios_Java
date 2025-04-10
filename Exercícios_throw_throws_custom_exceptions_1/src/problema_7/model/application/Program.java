package problema_7.model.application;

import java.util.Locale;
import java.util.Scanner;

import problema_7.model.exception.TemperaturaInvalidaException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor para a temperatura em °C: ");
		Double temperatura = input.nextDouble();
		
		try {
			verificarTemperatura(temperatura);
		}
		catch(TemperaturaInvalidaException e) {
			System.out.println(e.getMessage());
		}
		
		input.close();
	}
	
	public static void verificarTemperatura(Double temperatura) throws TemperaturaInvalidaException {
		if(temperatura < -50 || temperatura > 50) {
			throw new TemperaturaInvalidaException("Temperatura inválida. Deve estar entre -50°C e 50°C");
		}
		
		System.out.println("Temperatura válida: " + String.format("%.2f", temperatura));
	}

}
