package entities;

public class JurosSimples {
	
	private double capital;
	private double taxa;
	private int tempo;
	
	public JurosSimples(double capital, double taxa, int tempo) {
	
		this.capital = capital;
		this.taxa = taxa / 100.0;
		this.tempo = tempo;
	}
	

	public double getCapital() {
		return capital;
	}


	public void setCapital(double capital) {
		this.capital = capital;
	}


	public double getTaxa() {
		return taxa;
	}


	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}


	public int getTempo() {
		return tempo;
	}


	public void setTempo(int tempo) {
		this.tempo = tempo;
	}


	public double calcularJurosSimples() {
		return getCapital() * getTaxa() * getTempo();
	}
	
	public double calcularMontanteFinal() {
		return getCapital() + calcularJurosSimples();
	}
	
	public String compararMontateFinalComObjetivo(double montanteObjetivo) {
		
		if(calcularMontanteFinal() > montanteObjetivo) {
			
			return "O montante final é maior que o valor objetivo.";
			
		}else if(calcularMontanteFinal() == montanteObjetivo) {
			
			return "O montante final é maior que o valor objetivo.";
		}
		
		return "O montante final é menor que o valor objetivo.";
	}
	
	
}
/*package application;
import java.util.Locale;
import java.util.Scanner;

import entities.JurosSimples;




public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Capital: ");
		double capital = sc.nextDouble();
		
		System.out.print("Taxa: ");
		double taxa = sc.nextDouble();
		
		
		System.out.print("Tempo: ");
		int tempo = sc.nextInt();
		
		System.out.print("Valor objetivo: ");
		double valorObjetivo = sc.nextDouble();
		
		JurosSimples jurosSimples = new JurosSimples(capital, taxa, tempo);
		
		double juros = jurosSimples.calcularJurosSimples();
		double montante = jurosSimples.calcularMontanteFinal();
		String valorObj = jurosSimples.compararMontateFinalComObjetivo(valorObjetivo);
		
		System.out.printf("Juros: R$ %.2f%n", juros);
		System.out.printf("Montante: R$ %.2f%n", montante);
		System.out.println(valorObj);
		
		sc.close();
	}

}
*/