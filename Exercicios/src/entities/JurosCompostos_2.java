package entities;

public class JurosCompostos_2 {
	public double capital;
	public double taxa;
	public double tempo;
	public double montanteDesejado;
	
	public double calcularMontante() {
		return capital * Math.pow((1+taxa), tempo);
	}
	
	public double calcularTempoDoMontateDesejado() {
		return Math.log10(montanteDesejado/capital) / Math.log10(taxa+1.0);
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
import entities.JurosCompostos_2;
import entities.Triangulo_2;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		JurosCompostos_2 jCompostos = new JurosCompostos_2();
		
		System.out.print("Capital: ");
		jCompostos.capital = sc.nextDouble();
		
		System.out.print("Taxa: ");
		jCompostos.taxa = sc.nextDouble();
		
		System.out.print("Tempo: ");
		jCompostos.tempo = sc.nextDouble();
		
		System.out.print("Montante desejado: ");
		jCompostos.montanteDesejado = sc.nextDouble();
		
		double montante = jCompostos.calcularMontante();
		double montanteDesejado = jCompostos.calcularTempoDoMontateDesejado();
		
		System.out.printf("Montante após %.0f meses: %.2f", jCompostos.tempo, montante);
		System.out.println("");
		System.out.printf("Tempo necessário para atingir R$ %.2f: %.0f meses", jCompostos.montanteDesejado, jCompostos.calcularTempoDoMontateDesejado());
		
		
		
		sc.close();
	}

}
*/
 