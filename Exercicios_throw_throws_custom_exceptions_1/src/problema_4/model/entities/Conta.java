package problema_4.model.entities;

import problema_4.model.exceptions.SaldoInsuficienteException;

public class Conta {
	private String nome;
	private Double saldo;
	
	public Conta(String nome, Double saldo) {
		
		this.nome = nome;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void depositarSaldo(Double saldo) {
		this.saldo += saldo;
	}
	
	public void sacarSaldo(Double saldo) throws SaldoInsuficienteException {
		if(saldo > this.saldo) {
			throw new SaldoInsuficienteException("Saldo insuficiente! Disponível: " + String.format("%.2f", this.saldo));
		}
		this.saldo -= saldo;
	}
	
	
}
