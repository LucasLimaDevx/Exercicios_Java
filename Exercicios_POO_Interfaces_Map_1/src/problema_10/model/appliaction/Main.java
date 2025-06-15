package problema_10.model.appliaction;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import problema_10.model.entities.Investimento;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Investimento i1 = new Investimento("CDB", 1000.0, 3, 5.0);
		Investimento i2 = new Investimento("Poupança", 2000.0, 2, 3.0);
		Investimento i3 = new Investimento("CDB", 1500.0, 5, 6.0);
		Investimento i4 = new Investimento("Poupanca", 500.0, 1, 2.0);
		
		Map<String, List<Investimento>> investimentos = new HashMap<>();
		List<Investimento> lista = List.of(i1, i2, i3, i4);
		
		
		investimentos.put("Investimento", lista);
		
		
		for(String str : investimentos.keySet()) {
			List<Investimento> listaInvestimentos= investimentos.get(str);
			
			for(Investimento i : listaInvestimentos) {
				System.out.println("Retorno: " + String.format("%.2f", i.calcularMontante()));
			}
		}
	}

}
