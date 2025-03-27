package exercicios_poo_h;

import java.util.ArrayList;
import java.util.List;

public class ControleDePedidosEmRestaurante {
	List<Pedido> pedidos = new ArrayList<>();
	
	public void adicionarPedido(TipoDePedido tipoDePedido, String nome, Integer quantidade) {
		if(tipoDePedido == TipoDePedido.BEBIDA) {
			pedidos.add(new PedidoBebida(tipoDePedido, nome, quantidade));
		}else {
			pedidos.add(new PedidoComida(tipoDePedido, nome, quantidade));
		}
	}
	
	public void listarPedidos() {
		for(Pedido p : pedidos) {
			System.out.println(p);
		}
	}
}
