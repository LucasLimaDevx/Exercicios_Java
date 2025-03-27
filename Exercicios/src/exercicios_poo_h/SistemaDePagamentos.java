package exercicios_poo_h;

import java.util.ArrayList;
import java.util.List;

public class SistemaDePagamentos {
	List<Pagamento> pagamentos = new ArrayList<>();
	
	public void adicionarPagamento(Pagamento pagamento) {
		pagamentos.add(pagamento);
	}
	
	public void listarPagamentos() {
		for(Pagamento pagamento : pagamentos) {
			System.out.println(pagamento);
		}
	}
}
