package problema_1.entities;

import problema_1.enums.FormaDePagamento;

public abstract class Pagamento {
	protected Double valor;
	private FormaDePagamento formaDePagamento;
	
	public Pagamento() {	
	}

	public Pagamento(Double valor, FormaDePagamento formaDePagamento) {
		this.valor = valor;
		this.formaDePagamento = formaDePagamento;
	}
		
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public FormaDePagamento getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public abstract Double calcularPagmento();
}
