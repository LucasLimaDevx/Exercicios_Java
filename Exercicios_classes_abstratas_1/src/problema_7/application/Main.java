package problema_7.application;

import java.util.Locale;

import problema_7.entities.Eletronico;
import problema_7.entities.Geladeira;
import problema_7.entities.Televisao;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Eletronico e1 = new Geladeira("Brastemp", "Brastemp", 150.0, 110.0, 24);
		Eletronico e2 = new Geladeira("Consul", "Consul", 200.0, 220.0, 20);
		Eletronico e3 = new Televisao("LG Smart", "LG", 100.0, 110.0, 5);
		Eletronico e4 = new Televisao("Samsung 4K", "Samsung", 120.0, 220.0, 4);
		
		System.out.println(e1.getModelo() + " - Consumo: " + String.format("%.2f", e1.calcularConsumo()));
		System.out.println(e2.getModelo() + " - Consumo: " + String.format("%.2f", e2.calcularConsumo()));
		System.out.println(e3.getModelo() + " - Consumo: " + String.format("%.2f", e3.calcularConsumo()));
		System.out.println(e4.getModelo() + " - Consumo: " + String.format("%.2f", e4.calcularConsumo()));
		

	}

}
