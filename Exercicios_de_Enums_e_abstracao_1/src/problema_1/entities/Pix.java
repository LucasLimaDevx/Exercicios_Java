package problema_1.entities;

import problema_1.enums.FormaDePagamento;

public class Pix extends Pagamento{
	public Pix() {
		super();
	}

	public Pix(Double valor, FormaDePagamento formaDePagamento) {
		super(valor, formaDePagamento);
	}

	@Override
	public Double calcularPagmento() {
		// TODO Auto-generated method stub
		return valor * (1 - 0.1);
	}
	
	
}
