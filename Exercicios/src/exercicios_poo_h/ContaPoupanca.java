package exercicios_poo_h;

public class ContaPoupanca extends Conta{
	public ContaPoupanca() {
		super();
		
	}

	public ContaPoupanca(TipoDeConta tipoDeConta, String nome, Double saldo) {
		super(tipoDeConta, nome, saldo);
		this.saldo = saldo * (1 + 0.02);
	}

	@Override
	public String toString() {
		return "Saldo fi nal após rendimento: " + getSaldo();
	}
	
	
}
