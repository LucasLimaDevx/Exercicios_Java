package exercicios_poo_h_2;

public class Boleto extends Pagamento{
	private TipoDePagamento tipoDePagamento = TipoDePagamento.BOLETO;
	
	public Boleto() {
		
	}

	public Boleto(Double valor, String data) {
		super(valor, data);
		
	}

	public TipoDePagamento getTipoDePagamento() {
		return tipoDePagamento;
	}
	
}
