package problema_4.model.application;

import java.util.Locale;

import problema_4.model.entities.ContaCorrente;
import problema_4.model.entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(100.0);
		cc.saque(30.0);
		
		System.out.println("Saldo atual: R$" + String.format("%.2f", cc.verificarSaldo()));
		
		ContaPoupanca cp = new ContaPoupanca();
		
		cp.depositar(50.0);
		cp.saque(20.0);
		
		System.out.println("Saldo atual: R$" + String.format("%.2f", cp.verificarSaldo()));
	}

}
