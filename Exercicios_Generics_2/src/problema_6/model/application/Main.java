package problema_6.model.application;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(contagemDeOcorrencia(List.of(1, 2, 2, 3), 2));
		System.out.println(contagemDeOcorrencia(List.of("a", "b", "a"), "a"));
		System.out.println(contagemDeOcorrencia(List.of(true, false, true), true));
		System.out.println(contagemDeOcorrencia(List.of(3.3, 1.1, 3.3), 3.3));

	}
	
	public static <U> int contagemDeOcorrencia(List<?> lista, U elemento) {
		int total = 0;
		
		for(Object e : lista) {
			if(e.equals(elemento)) {
				total++;
			}
		}
		
		return total;
	}

}
