package entities;

public class ConversorDeDistancia_2 {
	public double distanciaKm;
	public double distanciaComparativa;
	public String unidadeComparativa;
	
	public double converterParaMetros() {
		return distanciaKm * 1000.0;
	}
	
	public double converterParaMilhas() {
		return distanciaKm * 0.621371;
	}
	
	public String compararDistancias() {
		
		
		
		if(unidadeComparativa.equals("m")) {
			
			double distanciaComparativaMilhas = (distanciaComparativa / 1000.0) * 0.621371;
			double distanciaEmMilhas = converterParaMilhas();
			
			
			
			if(distanciaEmMilhas > distanciaComparativaMilhas) {
				return "A distância em milhas é maior que a comparativa em milhas";
			}else if(distanciaEmMilhas == distanciaComparativaMilhas) {
				return "A distância em milhas é igual que a comparativa em milhas";
			}else {
				return "A distância em milhas é menor que a comparativa em milhas";
			}
			
			
		}
		
		if(converterParaMilhas() > (distanciaComparativa / 1000.0) * 0.621371) {
			return "A distância em milhas é maior que a comparativa em milhas";
		}else if(converterParaMilhas() == (distanciaComparativa / 1000.0) * 0.621371 ) {
			return "A distância em milhas é igual que a comparativa em milhas";
		}
		
		return "A distância em milhas é menor que a comparativa em milhas";
		
	}
}

/*package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo_2;
import entities.CombustivelCarro;
import entities.ConversorDeDistancia_2;
import entities.ConversorDeTemperatura_2;
import entities.ConversorDeVelocidade_2;
import entities.EquacaoQuadratica_2;
import entities.JurosCompostos_2;
import entities.Triangulo_2;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		ConversorDeDistancia_2 convDistancia= new ConversorDeDistancia_2();
		System.out.print("Distância (em km): ");
		convDistancia.distanciaKm = sc.nextDouble();
		
		System.out.print("Distância comparativa: ");
		convDistancia.distanciaComparativa = sc.nextDouble();
		
		System.out.print("Unidade comparativa (Metros ou Milhas): ");
		convDistancia.unidadeComparativa = sc.next();
		sc.nextLine();
		
		System.out.println("Distância em metros: "+ convDistancia.converterParaMetros());
		System.out.println("Distância em milhas: "+ convDistancia.converterParaMilhas());
		System.out.println(convDistancia.compararDistancias());
		
		
		sc.close();
	}

}
*/
