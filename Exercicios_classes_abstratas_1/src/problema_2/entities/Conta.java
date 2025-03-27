package problema_2.entities;

public abstract class Conta {
	private String titular;
	protected Double saldo;
	private Integer numeroConta;
	
	public Conta() {
	}

	public Conta(String titular, Double saldo, Integer numeroConta) {
		
		this.titular = titular;
		this.saldo = saldo;
		this.numeroConta = numeroConta;
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

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public abstract Double calcularJuros();
	
	
}
