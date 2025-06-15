package problema_9.model.appliaction;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import problema_9.model.entities.CalculadoraEstatistica;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Double> l1 =  List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		List<Long> l2 =  List.of(10L, 20L, 30L);
		List<Float> l3 =  List.of(5f, 5f, 5f, 5f, 5f);
		List<Double> l4 =  List.of(1.0, 3.0, 5.0, 7.0, 9.0);
		
		List<List<? extends Number>> l = List.of(l1, l2, l3, l4);
		
		Map<String, List<List<? extends Number>>> map = new HashMap<>();
		
		map.put("Numeros", l);
		
		for(String str : map.keySet()) {
			List<List<? extends Number>> listas = map.get(str);
			
			for(List<? extends Number> lista : listas) {
				System.out.println(String.format("%.2f", CalculadoraEstatistica.calcularMedia(lista)));
				System.out.println(String.format("%.2f", CalculadoraEstatistica.calcularDesvioPadrao(lista)));
				System.out.println();
			}
		}
		
		
		
		

	}

}
