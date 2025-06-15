package problema_5.model.appliaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import problema_5.model.entities.ImpostoConsumo;
import problema_5.model.entities.ImpostoRenda;
import problema_5.model.interfaces.Imposto;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Map<String, List<Imposto>> map = new HashMap<String, List<Imposto>>();
		List<Imposto> impostos = new ArrayList<Imposto>();
		
		impostos.add(new ImpostoRenda(5000.0));
		impostos.add(new ImpostoRenda(2000.0));
		impostos.add(new ImpostoConsumo(200.0));
		impostos.add(new ImpostoConsumo(1000.0));
		
		
		map.put("Imposto", impostos);
		
		for(String imposto : map.keySet()) {
			List<Imposto> lista = map.get(imposto);
			
			for(Imposto i : lista) {
				System.out.println("Imposto: " + String.format("%.2f", i.calcularImposto()));
			}
		}
		

	}

}
