package problema_1.application;

import java.util.Locale;
import java.util.Scanner;

import problema_1.entities.Boleto;
import problema_1.entities.Credito;
import problema_1.entities.Debito;
import problema_1.entities.Pagamento;
import problema_1.entities.Pix;
import problema_1.enums.FormaDePagamento;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o tipo de pagamento (DEBITO, CREDITO, PIX OU BOLETO): ");
		String tipoDePagamento = sc.next().toUpperCase();
		
		System.out.print("Informe o valor do pagamento: ");
		Double valorDoPagamento = sc.nextDouble();
		System.out.println(tipoDePagamento);
		Pagamento pagamento;
		
		switch(tipoDePagamento) {
			case "CREDITO":
				pagamento = new Credito(valorDoPagamento, FormaDePagamento.valueOf(tipoDePagamento));
				break;
			case "DEBITO":
				pagamento = new Debito(valorDoPagamento, FormaDePagamento.valueOf(tipoDePagamento));
				break;
			case "PIX":
				pagamento = new Pix(valorDoPagamento, FormaDePagamento.valueOf(tipoDePagamento));
				break;
			case "BOLETO":
				pagamento = new Boleto(valorDoPagamento, FormaDePagamento.valueOf(tipoDePagamento));
				break;
			
		    default:
		    	pagamento =  new Debito(valorDoPagamento, FormaDePagamento.valueOf(tipoDePagamento));
		}
		
		Double valorFinal = pagamento.calcularPagmento();
		
		System.out.println("Valor final: " + String.format("%.2f", valorFinal));
		
		
		sc.close();
	}

}
