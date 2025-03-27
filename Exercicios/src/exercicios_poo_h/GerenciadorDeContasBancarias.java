package exercicios_poo_h;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeContasBancarias {
	List<Conta> contas = new ArrayList<>();
	
	public void adicionarConta(TipoDeConta tipoDeConta, String nome, Double saldo) {
		
		if(tipoDeConta == TipoDeConta.CONTA_CORRENTE) {
			ContaCorrente c = new ContaCorrente(tipoDeConta, nome, saldo);
			
			contas.add(c);
		}else {
			ContaPoupanca c = new ContaPoupanca(tipoDeConta, nome, saldo);
			
			contas.add(c);
		}
		
	}
	
	
	public void listarConta() {
		for(Conta c : contas){	
			System.out.println(c);
		}
	}
}
