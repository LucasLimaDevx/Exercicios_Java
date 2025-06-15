package problema_6.model.entities;

public class ContaBancaria {
	private String nome;
	private Double saldo = 0.0;
	
	public ContaBancaria(String nome, Double saldo) {
		this.nome = nome;
		this.saldo = saldo;
		calcularJuros();
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

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void saque(Double saque) {
		this.saldo -= saque;
	}
	
	public void deposito(Double deposito) {
		this.saldo += deposito;
	}
	
	public void calcularJuros() {
		this.saldo = this.saldo * (1.0 + 0.05);
	}
}
