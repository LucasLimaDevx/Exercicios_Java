package entities;

public class Cadastro {
	
	private int numeroDaConta;
	private String nomeDoTitular;
	private double saldo;
	
	public Cadastro() {
		
	}
	public Cadastro(int numeroDaConta, String nomeDoTitular) {
		
		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
	}
	
	public Cadastro(int numeroDaConta, String nomeDoTitular, double saldo) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
		this.saldo = saldo;
	}
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		if(this.numeroDaConta == 0 && numeroDaConta != 0) {
			this.numeroDaConta = numeroDaConta;
		}
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double deposito) {
		
		saldo += deposito;
	}
	
	public void saque(double saque) {
		if(saldo >= saque) {
			
			saldo -= saque + 5;
		}
		
	}
	
	
	
	
}
/*/*package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Cadastro;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		
		System.out.print("Enter account holder: ");
		String holder = sc.next();
		sc.next();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		String yesOrNo = sc.next();
		
		
		Cadastro titular = new Cadastro(); 
		
		if(yesOrNo.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			
			titular = new Cadastro(accountNumber, holder, deposit);
			
			
		}else {
			
			titular = new Cadastro(accountNumber, holder);
			
		}
		int account = titular.getNumeroDaConta();
		String name = titular.getNomeDoTitular();
		double saldo = titular.getSaldo();
		
		System.out.println("Account data:");
		System.out.printf("Accout %d, Holder: %s, Balance: $%.2f%n", account, name, saldo);
		System.out.println("--------------------------------------------------------------");
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		titular.depositar(deposit);
		
		account = titular.getNumeroDaConta();
		name = titular.getNomeDoTitular();
		saldo = titular.getSaldo();
		
		System.out.println("Updated account data:");
		System.out.printf("Accout %d, Holder: %s, Balance: $%.2f%n", account, name, saldo);
		System.out.println("--------------------------------------------------------------");
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		titular.saque(withdraw);
		
		account = titular.getNumeroDaConta();
		name = titular.getNomeDoTitular();
		saldo = titular.getSaldo();
		
		System.out.println("Updated account data:");
		System.out.printf("Accout %d, Holder: %s, Balance: $%.2f%n", account, name, saldo);
		System.out.println("--------------------------------------------------------------");
		
		sc.close();
	}

}*/
