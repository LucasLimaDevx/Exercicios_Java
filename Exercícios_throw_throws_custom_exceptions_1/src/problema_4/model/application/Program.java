package problema_4.model.application;

import java.util.Locale;
import java.util.Scanner;

import problema_4.model.entities.Conta;
import problema_4.model.exceptions.SaldoInsuficienteException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o nome: " );
		String nome = input.nextLine();
		
		System.out.print("Digite o saldo: ");
		Double saldo = input.nextDouble();
		
		Conta c = new Conta(nome, saldo);
		
		c.depositarSaldo(1000.0);
		
		System.out.println();
		
		System.out.println("CONTA:");
		System.out.println("NOME: " + c.getNome());
		System.out.println("SALDO: " + String.format("%.2f", c.getSaldo()));
		
		System.out.println();
		
		System.out.print("Digite um valor para saque: ");
		saldo = input.nextDouble();
		
		try {
			c.sacarSaldo(saldo);
		}catch(SaldoInsuficienteException e ) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		System.out.println("CONTA:");
		System.out.println("NOME: " + c.getNome());
		System.out.println("SALDO: " + String.format("%.2f", c.getSaldo()));
		
		input.close();
	}

}
