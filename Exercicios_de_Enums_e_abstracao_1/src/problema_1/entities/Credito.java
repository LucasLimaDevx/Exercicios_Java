package problema_1.entities;

import problema_1.enums.FormaDePagamento;

public class Credito extends Pagamento{
	public Credito() {
		super();
	}

	public Credito(Double valor, FormaDePagamento formaDePagamento) {
		super(valor, formaDePagamento);
	}

	@Override
	public Double calcularPagmento() {
		
		return valor * (1 + 0.05);
	}
	
	
}
