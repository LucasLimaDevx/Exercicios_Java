package problema_3_1.model.application;

import problema_3_1.model.entities.Lista;

public class Main {

	public static void main(String[] args) {
		Lista<Integer> l1 = new Lista<Integer>();
		l1.getLista().add(10);
		l1.getLista().add(20);
		l1.getLista().add(30);
		
		Lista<String> l2 = new Lista<String>();
		l2.getLista().add("a");
		l2.getLista().add("b");
		l2.getLista().add("c");
		l2.getLista().add("d");
		
		
		Lista<Double> l3 = new Lista<Double>();
		l3.getLista().add(1.1);
		l3.getLista().add(2.2);
		
		Lista<Boolean> l4 = new Lista<Boolean>();
		l4.getLista().add(true);
		
		
		l1.listar();
		System.out.println();
		l2.listar();
		System.out.println();
		l3.listar();
		System.out.println();
		l4.listar();
		

	}

}
