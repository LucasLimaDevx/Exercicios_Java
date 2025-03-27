package entities;

public class ConversorDeDistancia {
	
	public double distanciaKm;
	public double distanciaComparativa;
	public String unidadeComparativa;
	
	public double distanciaConvertidaEmMetros() {
		return distanciaKm * 1000;
	}
	
	public double distanciaConvertidaEmMilhas() {
		return distanciaKm * 0.621371;
	}
	public String compararDistancias(){
		double distanciaEmMilhas = distanciaConvertidaEmMilhas();
		double distanciaComparativaEmMilhas = distanciaComparativa / 1000 * 0.621371;
		
		if(distanciaEmMilhas > distanciaComparativaEmMilhas) {
			return "A distância em milhas é maior que a comparativa em metros.";
		}else {
			return "A distância em milhas é menor que a comparativa em metros.";
		}
	}
}


/*package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ConversorDeDistancia;
import entities.ConversorDeVelocidade;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		ConversorDeDistancia convDistancia = new ConversorDeDistancia();
		
		System.out.print("Distância: ");
		convDistancia.distanciaKm = sc.nextDouble();
		
		System.out.println("Distância comparativa: ");
		convDistancia.distanciaComparativa = sc.nextDouble();
		
		System.out.printf("Distância em metros %.2f%n", convDistancia.distanciaConvertidaEmMetros());
		System.out.printf("Distância em milhas %.2f%n", convDistancia.distanciaConvertidaEmMilhas());
		System.out.println(convDistancia.compararDistancias());
		
		
		sc.close();
	}

}
*/