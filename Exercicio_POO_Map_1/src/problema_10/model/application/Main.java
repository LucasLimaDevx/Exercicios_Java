package problema_10.model.application;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Map<String, Cidade> cidades = new HashMap<>();
		
		Cidade c1 = new Cidade("São Luís", List.of(30.0, 31.0, 29.0, 32.0));
		Cidade c2 = new Cidade("Teresina", List.of(34.0, 35.0, 36.0, 33.0));
		Cidade c3 = new Cidade("Recife", List.of(28.0, 29.0, 27.0, 30.0));
		Cidade c4 = new Cidade("Belém", List.of(31.0, 32.0, 33.0, 30.0));
		
		cidades.put(c1.getNome(), c1);
		cidades.put(c2.getNome(), c2);
		cidades.put(c3.getNome(), c3);
		cidades.put(c4.getNome(), c4);
		
		for(String cidade : cidades.keySet()) {
			
			System.out.println(cidade + ": " +String.format("%.2f", cidades.get(cidade).calcularTemperaturaMedia()));
			
		}

	}
	

}
