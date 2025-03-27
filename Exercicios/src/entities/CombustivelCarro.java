package entities;

public class CombustivelCarro {
	public double distanciaPercorrida;
	public double litrosConsumidos;
	public double consumoDesejado;
	
	public double consumoMedio() {
		return distanciaPercorrida / litrosConsumidos;
		
	}
	
	public boolean verificaConsumoMedio() {
		return consumoMedio() >= consumoDesejado;
	}
}
/*
 * package application;
import java.util.Locale;
import java.util.Scanner;

import entities.CombustivelCarro;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		CombustivelCarro combCarro = new CombustivelCarro();
		
		System.out.print("Distância percorrida: ");
		combCarro.distanciaPercorrida = sc.nextDouble();
		
		System.out.print("Litros consumidos: ");
		combCarro.litrosConsumidos = sc.nextDouble();
		
		System.out.print("Consumo desejado: ");
		combCarro.consumoDesejado = sc.nextDouble();
		
		double consumoMedio = combCarro.consumoMedio();
		
		System.out.printf("Consumo médio %.2f km/l", consumoMedio);
		System.out.println("");
		if(combCarro.verificaConsumoMedio()) {
			System.out.println("O consumo está dentro do desejado.");
		}else {
			System.out.println("O consumo está fora do desejado.");
		}
		
		
		sc.close();
	}

}
*/
 