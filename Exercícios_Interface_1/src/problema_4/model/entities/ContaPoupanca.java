package problema_4.model.entities;

import problema_4.model.interfaces.ContaBancaria;

public class ContaPoupanca implements ContaBancaria{
	private Double saldo = 0.0;

	@Override
	public void depositar(Double deposito) {
		this.saldo += deposito;
		
	}

	@Override
	public void saque(Double saque) {
		this.saldo -= saque;
		
	}

	@Override
	public double verificarSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}
	
	
}
