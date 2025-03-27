package problema_5.application;

import java.util.ArrayList;
import java.util.List;

import problema_5.entities.ContaBancaria;

public class GerenciamentoDeContas {
	List<ContaBancaria> contasBancarias = new ArrayList<>();
	
	public void adicionarConta(ContaBancaria contaBancaria){
		contasBancarias.add(contaBancaria);
	}
	
	public Double calcularSaldoBancario() {
		Double saldoTotal = 0.0;
		
		for(int i = 0 ; i < contasBancarias.size() ; i++) {
			saldoTotal += contasBancarias.get(i).getSaldo();
		}
		
		return saldoTotal;
	}
}
