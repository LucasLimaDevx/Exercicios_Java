package exercicios_enum;

import java.util.ArrayList;
import java.util.List;

public class SistemaDePedidos {
	List <Pedido> pedidos = new ArrayList<>();
	
	public void adicionarPedido(Integer id, Double valor, Status_2 status) {
		Pedido pedido = new Pedido(id, valor, status);
		
		pedidos.add(pedido);
	}
	
	public void alterarStatus(Integer id, Status_2 status) {
		for(Pedido pedido : pedidos) {
			
			if(pedido.getId() == id) {
				pedido.setStatus(status);
			}
		}
	}
	
	public void listarPedidos() {
		System.out.println("LISTA DE PEDIDOS");
		for(Pedido pedido : pedidos) {
			System.out.println("ID: " + pedido.getId() +"\nValor: " + pedido.getValor() + "\nStatus: " + pedido.getStatus());
			System.out.println("-------------------------------------");
		}
	}
}
