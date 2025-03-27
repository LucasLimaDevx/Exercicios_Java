package exercicios_poo_h_2;

import java.util.ArrayList;
import java.util.List;

public class SistemaDePagamento {
	List<Pagamento> pagamentos = new ArrayList<>();
	
	public void adicioanrPagamento(Pagamento pagamento) {
		pagamentos.add(pagamento);
	}
	
	public void listarPagamentos() {
		for(Pagamento p : pagamentos) {
			
			if(p instanceof Boleto) {
				Boleto b = (Boleto) p ;
				
				System.out.println("Valor: " + b.getValor() + " - Data: " + b.getData());
			}
		}
	}
}
