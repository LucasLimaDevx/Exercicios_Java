package problema_2.model.entities;

import problema_2.model.interfaces.Pagamento;

public class Boleto implements Pagamento{

	@Override
	public void processarPagamento(double pagamento) {
		System.out.println("Pagar R$" + String.format("%.2f", pagamento) + " com Boleto");
		
	}

}
