package exercicios_enum;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeControleDeContasBancárias {
	List<Conta> contas = new ArrayList<>();
	
	public void adicionarConta(Integer numero, String titular, Tipo tipo) {
		Conta conta = new Conta(numero, titular, tipo);
		
		contas.add(conta);
	}
	
	public void filtrarContas(Tipo tipo) {
		System.out.println("LISTANDO CONTAS " + tipo);
		for(Conta conta : contas) {
			if(conta.getTipo() == tipo) {
				System.out.println("Numero: " + conta.getNumero());
				System.out.println("Titular: " + conta.getTitular());
				System.out.println("Tipo da conta: " + conta.getTipo());
				
				System.out.println("-----------------------");
			}
		}
	}
	
	public void listarContas() {
		System.out.println("LISTANDO TODAS AS CONTAS");
		
		for(Conta conta : contas) {
			System.out.println("Numero: " + conta.getNumero());
			System.out.println("Titular: " + conta.getTitular());
			System.out.println("Tipo da conta: " + conta.getTipo());
			System.out.println("-----------------------");
		}
	}
}
