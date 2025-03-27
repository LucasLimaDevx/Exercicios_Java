package exercicios_poo_h_2;

public class Cartao extends Pagamento{
	private TipoDePagamento tipoDePagamento = TipoDePagamento.CARTAO;
	
	public Cartao() {
		
	}

	public Cartao(Double valor, String data) {
		super(valor, data);
	
	}

	public TipoDePagamento getTipoDePagamento() {
		return tipoDePagamento;
	}	
	
}
