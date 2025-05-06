package problema_8.model.application;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println(calcularMedia(List.of(1, 2, 3)));
		System.out.println(calcularMedia(List.of(2.0, 4.0)));
		System.out.println(calcularMedia(List.of(3L, 3L, 3L)));
		System.out.println(calcularMedia(List.of(5, 10.0, 15L)));

	}
	
	
	public static Number calcularMedia(List<? extends Number> lista) {
		
		Double soma = 0.0;
		
		for(Number number : lista) {
			soma += number.doubleValue();
		}
		
		return soma / lista.size();
	}

}
