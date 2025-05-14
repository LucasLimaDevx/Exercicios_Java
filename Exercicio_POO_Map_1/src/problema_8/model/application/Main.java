package problema_8.model.application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import problema_8.model.entities.Pedido;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Map<String, Pedido> pedidos = new HashMap<>();
		
		for(int i = 0 ; i < 4 ; i++) {
			System.out.print("ID: ");
			String id = sc.next();
			
			System.out.print("VALOR: ");
			Double valor = sc.nextDouble();
			
			System.out.print("ENTREGUE: ");
			Boolean entregue = sc.nextBoolean();
			
			Pedido pedido = new Pedido(id, valor, entregue);
			
			pedidos.put(pedido.getId(), pedido);
			
			System.out.println();
			
			
		}
		
		System.out.println(String.format("%.2f", calcularTotal(pedidos)));
		sc.close();
	}
	
	public static Double calcularTotal(Map<String, Pedido> pedidos) {
		Double soma = 0.0;
		
		for(String p : pedidos.keySet()) {
			if(pedidos.get(p).getEntregue() == true) {
				soma += pedidos.get(p).getValor();
			}
		}
		
		return soma;
	}

}
