package entities;

public class Financiamento {
	private double valorPrincipal;
	private double taxaMensal;
	private int numeroParcelas;
	
	public Financiamento(double valorPrincipal, double taxaMensal, int numeroParcelas) {
		
		this.valorPrincipal = valorPrincipal;
		this.taxaMensal = taxaMensal;
		this.numeroParcelas = numeroParcelas;
	}

	public double getValorPrincipal() {
		return valorPrincipal;
	}

	public void setValorPrincipal(double valorPrincipal) {
		this.valorPrincipal = valorPrincipal;
	}

	public double getTaxaMensal() {
		return taxaMensal;
	}

	public void setTaxaMensal(double taxaMensal) {
		this.taxaMensal = taxaMensal;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(int numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}
	
	public double calcularParcela() {
		
		double i = getTaxaMensal() / 100.0;
		System.out.println(getValorPrincipal());
		System.out.println(i);
		System.out.println(getNumeroParcelas());
		
		return (getValorPrincipal() * i) / (1 - Math.pow(1 + i, -getNumeroParcelas()));
	}
	
	public double calcularMontanteTotal() {
		return getNumeroParcelas() * calcularParcela();
	}
	
	public String compararMontantes(double montanteMinimo) {
		if(calcularMontanteTotal() > montanteMinimo) {
			
			return "O montante total é maior que o valor limite.";
			
		}else if(calcularMontanteTotal() == montanteMinimo) {
			
			return "O montante total é igual que o valor limite.";
			
		}
		
		return "O montante total é menor que o valor limite.";
		
	}
}
/*package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Financiamento;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor principal: ");
		double valorPrincipal = sc.nextDouble();
		
		System.out.print("Taxa mensal: ");
		double taxaMensal = sc.nextDouble();
		
		System.out.print("Número de parcelas: ");
		int numeroDeParcelas = sc.nextInt();
		
		System.out.print("Valor limite: ");
		double valorLimite = sc.nextDouble();
		
		Financiamento fin = new Financiamento(valorPrincipal, taxaMensal, numeroDeParcelas);
		
		double valorDaParcela = fin.calcularParcela();
		double montantePago = fin.calcularMontanteTotal();
		String compValorLimite = fin.compararMontantes(valorLimite);
		
		
		System.out.printf("Valor da parcela: %.2f%n", valorDaParcela);
		System.out.printf("Montante total pago: %.2f%n", montantePago);
		System.out.printf(compValorLimite);
		
		sc.close();
	}

}
*/