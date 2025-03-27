package entities;

public class CombustivelCarro_2 {
	public double distanciaPercorrida;
	public double litrosConsumidos;
	public double consumoDesejados;
	
	public double calcularConsumoMedio() {
		return distanciaPercorrida / litrosConsumidos;
	}
	
	public String verificarConsumoAtingido() {
		if(calcularConsumoMedio() > consumoDesejados) {
			return "O consumo está acima do desejado.";
		}else if(calcularConsumoMedio() == consumoDesejados) {
			return "O consumo está no limite desejado.";
		}
		
		return "O consumo está abaixo do desejado.";
	}
	
}
/*package application;
import java.util.Locale;
import java.util.Scanner;

import entities.CombustivelCarro_2;
import entities.Fatorial;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		CombustivelCarro_2 combCarro = new CombustivelCarro_2();
		System.out.print("Distância percorrida: ");
		combCarro.distanciaPercorrida = sc.nextDouble();
		
		
		System.out.print("Litros consumidos: ");
		combCarro.litrosConsumidos = sc.nextDouble();
		
		System.out.print("Consumo desejado: ");
		combCarro.consumoDesejados = sc.nextDouble();
		
		System.out.printf("Consumo médio: %.2f", combCarro.calcularConsumoMedio());
		System.out.println("");
		System.out.println(combCarro.verificarConsumoAtingido());
		
		sc.close();
	}

}
*/