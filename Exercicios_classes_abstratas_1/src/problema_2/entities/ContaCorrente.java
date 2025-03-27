package problema_2.entities;

public class ContaCorrente extends Conta{
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String titular, Double saldo, Integer numeroConta) {
		super(titular, saldo, numeroConta);
	}

	@Override
	public Double calcularJuros() {
		
		return saldo - 10.0;
	}
	
	
	
}
