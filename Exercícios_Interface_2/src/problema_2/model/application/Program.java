package problema_2.model.application;

import java.util.Locale;

import problema_2.model.entities.Boleto;
import problema_2.model.entities.CartaoCredito;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		CartaoCredito c1 = new CartaoCredito();
		CartaoCredito c2 = new CartaoCredito();
		
		c1.processarPagamento(100.0);
		c2.processarPagamento(250.0);
		
		System.out.println();
		
		Boleto b1 = new Boleto();
		Boleto b2 = new Boleto();
		
		b1.processarPagamento(80.0);
		b2.processarPagamento(120.0);

	}

}
