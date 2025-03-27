package entities;

public class ConversorDeTemperatura_2 {
	public double celsius;
	public double temperaturaComparativa;
	public String unidadeComparativa;
	
	public double converterParaF() {
		return celsius * (9.0 / 5.0) + 32;
	}
	public double converterParaK() {
		return celsius + 273.15;
	}
	public String compararUnidadesDeTemperatura() {
		
		if(unidadeComparativa.equals("Kelvin")) {
			double tempCelsius = (temperaturaComparativa - 273.15);
			double tempFahrenheit = tempCelsius * (9.0 / 5.0) + 32;
			
			if(converterParaF() > tempFahrenheit) {
				return "A temperatura em Fahrenheit é maior que a comparativa em Kelvin.";
			}else if(converterParaF() == tempFahrenheit) {
				return "A temperatura em Fahrenheit é igual que a comparativa em Kelvin.";
			}else {
				return "A temperatura em Fahrenheit é menor que a comparativa em Kelvin.";
			}
			
			
		}
		
		
		if(temperaturaComparativa > converterParaF()) {
			return "A temperatura em Fahrenheit é maior que a comparativa em Fahrenheit.";
		}else if(temperaturaComparativa == converterParaF()) {
			return "A temperatura em Fahrenheit é igual que a comparativa em Fahrenheit.";
		}else {
			return "A temperatura em Fahrenheit é menor que a comparativa em Fahrenheit.";
		}
		
		
		
	}
}
/*
 * package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo_2;
import entities.CombustivelCarro;
import entities.ConversorDeTemperatura_2;
import entities.EquacaoQuadratica_2;
import entities.Triangulo_2;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		ConversorDeTemperatura_2 convTemperatura = new ConversorDeTemperatura_2();
		System.out.print("Celsius: ");
		convTemperatura.celsius = sc.nextDouble();
		
		System.out.print("Temperatura comparativa: ");
		convTemperatura.temperaturaComparativa = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Unidade comparativa: ");
		convTemperatura.unidadeComparativa = sc.nextLine();
		
		System.out.println("Fahrenheit: " + convTemperatura.converterParaF());
		System.out.println("Kelvin: " + convTemperatura.converterParaK());
		System.out.println(convTemperatura.compararUnidadesDeTemperatura());
		sc.close();
	}

}
*/
 