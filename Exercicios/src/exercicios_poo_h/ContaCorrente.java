package exercicios_poo_h;

public class ContaCorrente extends Conta{
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(TipoDeConta tipoDeConta, String nome, Double saldo) {
		super(tipoDeConta, nome, saldo);
		this.saldo = saldo * (1 - 0.01);
	}

	@Override
	public String toString() {
		return "Saldo final após a taxa: " + getSaldo();
	}

	
	
	
	
}	
