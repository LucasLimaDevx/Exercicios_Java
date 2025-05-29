package problema_5.model.application;

import java.util.Arrays;

import problema_5.model.entities.OperacaoMatematica;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println(OperacaoMatematica.soma(Arrays.asList(1, 2, 3)));
		System.out.println(OperacaoMatematica.soma(Arrays.asList(4, 5, 6)));
		System.out.println(OperacaoMatematica.soma(Arrays.asList(7, 8)));
		System.out.println(OperacaoMatematica.soma(Arrays.asList(9, 10, 11, 12)));

	}

}
