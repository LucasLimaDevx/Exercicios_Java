package exercicios_poo_h;

public class Conta {
	private TipoDeConta tipoDeConta;
	private String nome;
	protected Double saldo;
	
	public Conta() {
		
	}

	public Conta(TipoDeConta tipoDeConta, String nome, Double saldo) {
		
		this.tipoDeConta = tipoDeConta;
		this.nome = nome;
		
	}

	public TipoDeConta getTipoDeConta() {
		return tipoDeConta;
	}

	public void setTipoDeConta(TipoDeConta tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
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

	
	
	

	
	
}
