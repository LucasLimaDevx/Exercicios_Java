package problema_10.model.application;

import problema_10.model.entities.ConverterColecao;

public class Main {

	public static void main(String[] args) {
		ConverterColecao<Integer> cc1 = new ConverterColecao<Integer>();
		ConverterColecao<String> cc2 = new ConverterColecao<String>();
		ConverterColecao<Double> cc3 = new ConverterColecao<Double>();
		ConverterColecao<Boolean> cc4 = new ConverterColecao<Boolean>();
		
		cc1.conveterColecao(new Integer[]{1, 2, 3, 4});
		cc2.conveterColecao(new String[]{"a", "b"});
		cc3.conveterColecao(new Double[]{2.2, 3.3, 4.4});
		cc4.conveterColecao(new Boolean[]{false, true});
		
		System.out.println(cc1.getLista());
		System.out.println(cc2.getLista());
		System.out.println(cc3.getLista());
		System.out.println(cc4.getLista());

	}

}
