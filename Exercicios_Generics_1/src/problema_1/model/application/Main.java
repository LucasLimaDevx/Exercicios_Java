package problema_1.model.application;

import problema_1.model.entities.Caixa;

public class Main {

	public static void main(String[] args) {
		Caixa<String> c1 = new Caixa<String>("Olá");
		Caixa<Integer> c2 = new Caixa<Integer>(42);
		Caixa<Double> c3 = new Caixa<Double>(3.14);
		Caixa<Boolean> c4 = new Caixa<Boolean>(true);
		
		System.out.println(c1.getItem());
		System.out.println(c2.getItem());
		System.out.println(c3.getItem());
		System.out.println(c4.getItem());
	}

}
