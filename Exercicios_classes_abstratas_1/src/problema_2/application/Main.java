package problema_2.application;

import java.util.Locale;

import problema_2.entities.Conta;
import problema_2.entities.ContaCorrente;
import problema_2.entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Conta c1 = new ContaPoupanca("João", 1000.0, 1001);
		Conta c2 = new ContaPoupanca("Maria", 500.0, 1002);
		
		Conta c3 = new ContaCorrente("Carlos", 2000.0, 2001);
		Conta c4 = new ContaCorrente("Carlos", 1500.0, 2002);
		
		System.out.println("Saldo final: "+ String.format("%.2f", c1.calcularJuros()));
		System.out.println("Saldo final: "+ String.format("%.2f", c2.calcularJuros()));
		System.out.println("Saldo final: "+ String.format("%.2f", c3.calcularJuros()));
		System.out.println("Saldo final: "+ String.format("%.2f", c4.calcularJuros()));

	}

}
