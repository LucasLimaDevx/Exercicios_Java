package exercicios_poo_h;

public class PagamentoDebito extends Pagamento{
	public PagamentoDebito() {
		super();
	}

	public PagamentoDebito(Double valor, TipoDePagamento tipoDePagamento) {
		super(valor, tipoDePagamento);
	}
	
	public Double calcularPagamento() {
		return getValor() * (1 - 0.04);
	}

	@Override
	public String toString() {
		
		return "Total a pagar: " + String.format("%.2f", calcularPagamento());
	}
	
	
}

