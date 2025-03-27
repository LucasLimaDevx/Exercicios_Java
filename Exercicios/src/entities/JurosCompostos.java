package entities;

public class JurosCompostos {
	public double capital;
	public double taxa;
	public double tempo;
	/*
	 *   1ano ---- 12 meses
	 *     t' ----- t	
	 * 
	 * 		12t' = t
	 * 		  t' = t/12;	
	 * 
	 * 
	 * 
	 * */
	public double calcularMontante() {
		return capital * Math.pow( 1 + taxa , tempo);
	}
}


/*package application;

import java.util.Locale;
import java.util.Scanner;

import entities.JurosCompostos;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		JurosCompostos jCompostos = new JurosCompostos();
		
		System.out.print("Digite o valor do capital: ");
		jCompostos.capital = sc.nextDouble();
		
		System.out.print("Digite o valor do taxa: ");
		jCompostos.taxa = sc.nextDouble();
		
		System.out.print("Digite o valor do tempo: ");
		jCompostos.tempo = sc.nextDouble();
		
		System.out.printf("Montante: %.2f%n", jCompostos.calcularMontante());
		sc.close();
	}

}
*/