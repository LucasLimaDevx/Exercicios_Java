package problema_3.model.application;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> numeros = new LinkedHashMap<String, Integer>();
		
		numeros.put("x", 10);
		numeros.put("y", 20);
		numeros.put("z", 30);
		numeros.put("w", 40);
		
		numeros.remove("z");
		
		
		for(String letra : numeros.keySet()) {
			System.out.print(letra + "=" + numeros.get(letra) + ", ");
		}

	}

}
