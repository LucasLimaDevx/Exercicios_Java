package exercicios_poo;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoDeContaBancaria {
	List<Conta> contas = new ArrayList<>();
	
	public void adicionarConta(Integer numero, String titular) {
		Conta conta = new Conta(numero, titular);
		
		contas.add(conta);
	}
	public void adicionarConta(Integer numero, String titular, Double saldo) {
		Conta conta = new Conta(numero, titular, saldo);
		
		contas.add(conta);
	}
	
	public void realizarDeposito(Integer numero, Double saldo) {
		
		for(Conta conta : contas) {
			if(conta.getNumero().equals(numero)) {
				System.out.println(conta);
				System.out.println();
				
				conta.depositar(saldo);
				
				System.out.println(conta);
			}
		}
	}
	public void realizarSaque(Integer numero, Double saldo) {
		
		for(Conta conta : contas) {
			if(conta.getNumero().equals(numero)) {
				System.out.println(conta);
				System.out.println();
				
				conta.saque(saldo);
				
				System.out.println(conta);
			}
		}
	}
}
