package problema_7.application;

import java.util.Locale;

import problema_7.entities.Pedido;
import problema_7.entities.PedidoDelivery;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Pedido p1 = new Pedido(1, 30.0);
		Pedido p2 = new PedidoDelivery(2, 40.0, 5.0);
		Pedido p3 = new Pedido(3, 25.0);
		
		Pedido p4 = new Pedido(4, 50.0);
		Pedido p5 = new PedidoDelivery(5, 60.0, 10.0);
		
		Pedido p6 = new Pedido(5, 20.0);
		Pedido p7 = new Pedido(6, 35.0);
		Pedido p8 = new PedidoDelivery(7, 45.0, 5.0);
	
		
		SistemaDePedidos sistema1 = new SistemaDePedidos();
		sistema1.adicionarPedido(p1);
		sistema1.adicionarPedido(p2);
		sistema1.adicionarPedido(p3);
		
		SistemaDePedidos sistema2 = new SistemaDePedidos();
		sistema2.adicionarPedido(p4);
		sistema2.adicionarPedido(p5);
		
		SistemaDePedidos sistema3 = new SistemaDePedidos();
		sistema3.adicionarPedido(p6);
		sistema3.adicionarPedido(p7);
		sistema3.adicionarPedido(p8);
		
		Double total1 = sistema1.calcularValorTotal();
		Double total2 = sistema2.calcularValorTotal();
		Double total3 = sistema3.calcularValorTotal();
		
		System.out.println("Total: R$"+String.format("%.2f", total1));
		System.out.println("Total: R$"+String.format("%.2f", total2));
		System.out.println("Total: R$"+String.format("%.2f", total3));
	}

}
