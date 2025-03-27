package problema_7.application;

import java.util.ArrayList;
import java.util.List;

import problema_7.entities.Pedido;

public class SistemaDePedidos {
	List<Pedido> pedidos = new ArrayList<>();
	
	public void adicionarPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	public Double calcularValorTotal() {
		Double total = 0.0;
		for(Pedido p : pedidos) {
			total+= p.getValor();
		}
		
		return total;
	}
	
}
