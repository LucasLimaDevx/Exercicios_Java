package exercicios_poo;

import java.util.ArrayList;
import java.util.List;

public class SistemaDePedidos {
	List<Pedido> pedidos = new ArrayList<Pedido>();
	
	public void adicionarPedidos(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	public void listarPedidos() {
		
		for(Pedido pedido : pedidos) {
			if(pedido.getValorTotal() > 200.0) {
				System.out.println("Pedido: " + pedido.getNumero()+ " Cliente: " + pedido.getNome() + ", Valor: "+ pedido.getValorTotal());
			}
		}
	}
}
