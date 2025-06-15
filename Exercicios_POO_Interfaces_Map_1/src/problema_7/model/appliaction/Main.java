package problema_7.model.appliaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import problema_7.model.entities.MatematicaAvancada;

public class Main {

	public static void main(String[] args) {
		Map<String, List<Double>> map = new HashMap<>();
		List<Double> list = new ArrayList<>();
		
		
		list.add(new MatematicaAvancada().calcularFatorial(5.0));
		list.add(new MatematicaAvancada().calcularFatorial(4.0));
		list.add(new MatematicaAvancada().calcularPotencia(2.0, 3.0));
		list.add(new MatematicaAvancada().calcularPotencia(3.0, 2.0));
		
		map.put("Operacao", list);
		
		for(String str : map.keySet()) {
			List<Double> numbers = map.get(str);
			
			for(Double n : numbers) {
				System.out.println("Resultado: " + n);
			}
		}
	}

}
