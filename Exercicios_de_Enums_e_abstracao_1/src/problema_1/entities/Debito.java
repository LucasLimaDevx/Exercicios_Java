package problema_1.entities;

import problema_1.enums.FormaDePagamento;

public class Debito extends Pagamento{
	public Debito() {
		super();
	}

	public Debito(Double valor, FormaDePagamento formaDePagamento) {
		super(valor, formaDePagamento);
	}

	@Override
	public Double calcularPagmento() {
		return valor;
	}
	
	
}
