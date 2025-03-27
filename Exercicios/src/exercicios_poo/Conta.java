package exercicios_poo;

public class Conta {
	private Integer numero;
	private String titular;
	private Double saldo;
	
	public Conta(Integer numero, String titular) {
		
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0.0;
	}
	
	public Conta(Integer numero, String titular, Double saldo) {
		
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void depositar(Double saldo) {
		this.saldo += saldo;
	}
	
	public void saque(Double saldo) {
		this.saldo -= saldo;
	}

	@Override
	public String toString() {
		return "Conta: " + numero + ", titular=" + titular + ", saldo=" + saldo;
	}
	
	
	
	
	
}
