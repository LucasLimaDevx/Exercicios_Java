package problema_9.model.application;

import java.util.Locale;
import java.util.Scanner;

import problema_9.model.exception.PagamentoInsuficienteException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor da compra: ");
		Double valorDaCompra = sc.nextDouble();
		
		System.out.print("Valor pago: ");
		Double valorPago = sc.nextDouble();
		
		try {
			verificaPagamento(valorDaCompra, valorPago);
		}
		catch(PagamentoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();

	}
	
	public static void verificaPagamento(Double valorDaCompra, Double valorPago) throws PagamentoInsuficienteException {
		if(valorPago < valorDaCompra) {
			throw new PagamentoInsuficienteException("Pagamento insuficiente. Faltam " + (valorDaCompra - valorPago));
		}
		
		System.out.println("Pagamento aprovado. Troco: " + (valorPago - valorDaCompra));
	}

}
