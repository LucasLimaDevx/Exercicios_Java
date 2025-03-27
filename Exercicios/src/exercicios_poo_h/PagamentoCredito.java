package exercicios_poo_h;

public class PagamentoCredito extends Pagamento{
	public PagamentoCredito() {
		super();
	}
	public PagamentoCredito(Double valor, TipoDePagamento tipoDePagamento) {
		super(valor, tipoDePagamento);
	}
	public Double calcularPagamento() {
		return getValor() * (1 - 0.05);
	}
	@Override
	public String toString() {
		return "Total a pagar: " + String.format("%.2f", calcularPagamento());
	}
}
