package exercicios_poo_h;

public class Pagamento {
	protected Double valor;
	private TipoDePagamento tipoDePagamento;
	
	public Pagamento() {
		
	}
	
	public Pagamento(Double valor, TipoDePagamento tipoDePagamento) {
	
		this.valor = valor;
		this.tipoDePagamento = tipoDePagamento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public TipoDePagamento getTipoDePagamento() {
		return tipoDePagamento;
	}

	public void setTipoDePagamento(TipoDePagamento tipoDePagamento) {
		this.tipoDePagamento = tipoDePagamento;
	}

	
	
	
	
	
}
