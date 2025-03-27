package problema_5.entities;

public class ContaBancaria {
	private Double saldo;
	private String numeroDaConta;
	
	public ContaBancaria() {
		
	}

	public ContaBancaria(Double saldo, String numeroDaConta) {
		
		this.saldo = saldo;
		this.numeroDaConta = numeroDaConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	
	
}
