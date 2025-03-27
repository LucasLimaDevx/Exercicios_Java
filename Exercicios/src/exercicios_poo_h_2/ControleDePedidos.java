package exercicios_poo_h_2;

import java.util.ArrayList;
import java.util.List;

public class ControleDePedidos {
	List<Pedido> pedidos = new ArrayList<>();
	
	public void adicionarPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	public void listarPedidosOnline() {
		for(Pedido p : pedidos) {
			if(p.getTipoDoPedido() == TipoDoPedido.PEDIDO_ONLINE) {
				System.out.println("Código: " + p.getCodigo() + " - Valor: R$" + String.format("%.2f", p.getValor()));
			}
		}
	}
}
