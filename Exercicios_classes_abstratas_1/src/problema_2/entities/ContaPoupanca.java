package problema_2.entities;

public class ContaPoupanca extends Conta{
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String titular, Double saldo, Integer numeroConta) {
		super(titular, saldo, numeroConta);
	}

	@Override
	public Double calcularJuros() {
	
		return saldo * (1 + 0.5/100.0);
	}
	
	
}
