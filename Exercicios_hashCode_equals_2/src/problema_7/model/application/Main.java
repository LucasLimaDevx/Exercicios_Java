package problema_7.model.application;

import problema_7.model.entities.Cliente;
import problema_7.model.entities.Pedido;

public class Main {

	public static void main(String[] args) {
		Pedido p1 = new Pedido(1, new Cliente("João"));
		Pedido p2 = new Pedido(1, new Cliente("João"));
		
		System.out.println(p1.equals(p2));
		
		Cliente c1 = new Cliente("Maria");
		Cliente c2 = new Cliente("Ana");
		
		Pedido p3 = new Pedido(2, c1);
		Pedido p4 = new Pedido(2, c2);
		
		System.out.println(p3.equals(p4));
		
		Pedido p5 = new Pedido(3, new Cliente("Pedro"));
		Pedido p6 = new Pedido(4, new Cliente("Pedro"));
		
		System.out.println(p5.equals(p6));
		
		Cliente c3 = new Cliente("Carlos");
		Cliente c4 = new Cliente("Carlos");
		
		Pedido p7 = new Pedido(2, c3);
		Pedido p8 = new Pedido(2, c4);
		
		System.out.println(p7.equals(p8));
	}

}
