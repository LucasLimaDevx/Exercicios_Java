package problema_2.model.application;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(somaElementos(List.of(1, 2, 3)));
		System.out.println(somaElementos(List.of(2.5, 3.5)));
		System.out.println(somaElementos(List.of(4L, 6L)));
		System.out.println(somaElementos(List.of(1, 2.5, 3L)));

	}
	
	public static Double somaElementos(List<? extends Number> lista) {
		Double soma = 0.0;
		
		for(Number number: lista) {
			soma += number.doubleValue();
		}
		
		return soma;
	}
	

}
