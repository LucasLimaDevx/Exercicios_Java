package entities;

public class RendimentoMensal {
	private double capitalInicial;
	private double taxaMensal;
	private int tempo;
	
	public RendimentoMensal(double capitalInicial, double taxaMensal, int tempo) {
	
		this.capitalInicial = capitalInicial;
		this.taxaMensal = taxaMensal / 100.0;
		this.tempo = tempo;
	}

	public double getCapitalInicial() {
		return capitalInicial;
	}

	public void setCapitalInicial(double capitalInicial) {
		this.capitalInicial = capitalInicial;
	}

	public double getTaxaMensal() {
		return taxaMensal;
	}

	public void setTaxaMensal(double taxaMensal) {
		this.taxaMensal = taxaMensal;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	public double calcularValorAcumulador() {
		return getCapitalInicial() * Math.pow(1.0+ getTaxaMensal(), tempo);
	}
	
	public double calcularRedimentoTotal() {
		return calcularValorAcumulador() - getCapitalInicial();
		
	}
	
	public String verificarRendimentoTotal(double redimentoTotalObjetivo) {
		
		double redimentoTotal = calcularRedimentoTotal();
		
		if(redimentoTotal > redimentoTotalObjetivo) {
			return "O rendimento total é maior que o objetivo.";
		}
		if(redimentoTotal == redimentoTotalObjetivo) {
			return "O rendimento total é igual o objetivo.";
		}
		
		return "O rendimento total é menor que o objetivo.";
	}
	

		
	
}
/*package application;
import java.util.Locale;
import java.util.Scanner;

import entities.RendimentoMensal;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Capital inicial: ");
		double capitalInicial = sc.nextDouble();
		
		System.out.print("Taxa mensal: ");
		double taxaMensal = sc.nextDouble();
		
		System.out.print("Tempo: ");
		int tempo = sc.nextInt();
		
		System.out.printf("Rendimento objetivo: ");
		double rendimentoObjetivo = sc.nextDouble();
		
		RendimentoMensal rendMensal = new RendimentoMensal(capitalInicial, taxaMensal, tempo);
		
		double valorAcumulador = rendMensal.calcularValorAcumulador();
		double rendimentoTotal = rendMensal.calcularRedimentoTotal();
		String rendObjetivo = rendMensal.verificarRendimentoTotal(rendimentoObjetivo);
		
		
		System.out.printf("Valor acumulado: %.2f%n", valorAcumulador);
		System.out.printf("Rendimento total: %.2f%n", rendimentoTotal);
		System.out.println(rendObjetivo);
		sc.close();
	}

}
*/