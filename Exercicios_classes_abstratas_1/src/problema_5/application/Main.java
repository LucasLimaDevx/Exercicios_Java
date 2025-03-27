package problema_5.application;

import java.util.Locale;

import problema_5.entities.Carro;
import problema_5.entities.Moto;
import problema_5.entities.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Veiculo v1 = new Carro("Onix", "Chevrolet", 2022, 50.0, 100.0, 10.0);
		Veiculo v2 = new Carro("Corolla", "Toyota", 2021, 55.0, 200.0, 12.0);
		Veiculo v3 = new Moto("CB 500X", "Honda", 2023, 17.0, 100.0, 20.0);
		Veiculo v4 = new Moto("XRE 300", "Honda", 2020, 13.0, 150.0, 25.0);

		System.out.println("Combustível necessário: " + String.format("%.2f", v1.calcularConsumo()));
		System.out.println("Combustível necessário: " + String.format("%.2f", v2.calcularConsumo()));
		System.out.println("Combustível necessário: " + String.format("%.2f", v3.calcularConsumo()));
		System.out.println("Combustível necessário: " + String.format("%.2f", v4.calcularConsumo()));
	}

}
