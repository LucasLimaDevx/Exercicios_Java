package problema_1.entities;

import problema_1.enums.FormaDePagamento;

public class Boleto extends Pagamento{
	public Boleto() {
		super();
	}

	public Boleto(Double valor, FormaDePagamento formaDePagamento) {
		super(valor, formaDePagamento);
	}

	@Override
	public Double calcularPagmento() {
		
		return valor * (1 - 0.5);
	}
	
	
}
