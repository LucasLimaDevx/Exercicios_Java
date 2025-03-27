package problema_5.application;

import java.util.Locale;

import problema_5.entities.ContaBancaria;
import problema_5.entities.ContaCorrente;
import problema_5.entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		ContaBancaria c1 = new ContaCorrente(2000.0, "0000");
		ContaBancaria c2 = new ContaPoupanca(5000.0, "1111");
		ContaBancaria c3 = new ContaPoupanca(1500.0, "2222");
		
		ContaBancaria c4 = new ContaCorrente(3000.0, "3333");
		ContaBancaria c5 = new ContaPoupanca(4000.0, "4444");
		
		ContaBancaria c6 = new ContaCorrente(1000.0, "5555");
		ContaBancaria c7 = new ContaPoupanca(2000.0, "6666");
		ContaBancaria c8 = new ContaPoupanca(3000.0, "7777");
		
		GerenciamentoDeContas sistema1 = new GerenciamentoDeContas();
		GerenciamentoDeContas sistema2 = new GerenciamentoDeContas();
		GerenciamentoDeContas sistema3 = new GerenciamentoDeContas();
		sistema1.adicionarConta(c1);
		sistema1.adicionarConta(c2);
		sistema1.adicionarConta(c3);
		
		Double total1 = sistema1.calcularSaldoBancario();
		System.out.println("Saldo total: R$" + String.format("%.2f", total1));
		
		sistema2.adicionarConta(c4);
		sistema2.adicionarConta(c5);
	
		
		Double total2 = sistema2.calcularSaldoBancario();
		System.out.println("Saldo total: R$" + String.format("%.2f", total2));
		
		sistema3.adicionarConta(c6);
		sistema3.adicionarConta(c7);
		sistema3.adicionarConta(c8);
		
		Double total3 = sistema3.calcularSaldoBancario();
		System.out.println("Saldo total: R$" + String.format("%.2f", total3));
		
		

	}

}
