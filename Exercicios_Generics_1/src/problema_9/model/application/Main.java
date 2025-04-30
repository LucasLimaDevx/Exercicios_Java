package problema_9.model.application;

import problema_9.model.entities.Par;

public class Main {

	public static void main(String[] args) {
		Par<Integer, String> p1 = new Par<Integer, String>(1, "um");
		Par<String, String> p2 = new Par<String, String>("nome", "João");
		Par<Integer, Double> p3 = new Par<Integer, Double>(2, 3.14);
		Par<String, Boolean> p4 = new Par<String, Boolean>("Ativo", true);
		
		System.out.println(p1.getValor());
		System.out.println(p2.getValor());
		System.out.println(p3.getValor());
		System.out.println(p4.getValor());
		
		

	}

}
