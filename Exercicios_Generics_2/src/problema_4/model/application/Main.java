package problema_4.model.application;

import java.util.List;

import problema_4.model.entities.ConverterParaArray;

public class Main {

	public static void main(String[] args) {
		ConverterParaArray<Integer> ca1 = new ConverterParaArray<>();
		ConverterParaArray<String> ca2 = new ConverterParaArray<>();
		ConverterParaArray<Double> ca3 = new ConverterParaArray<>();
		ConverterParaArray<Boolean> ca4 = new ConverterParaArray<>();
		
		ca1.converterLista(List.of(1, 2), Integer.class);
		ca2.converterLista(List.of("a", "b", "c"), String.class);
		ca3.converterLista(List.of(1.1, 2.2), Double.class);
		ca4.converterLista(List.of(false, true), Boolean.class);
		
		ca1.listarArray();
		System.out.println();
		
		ca2.listarArray();
		System.out.println();
		
		ca3.listarArray();
		System.out.println();
		
		ca4.listarArray();
	}

}
