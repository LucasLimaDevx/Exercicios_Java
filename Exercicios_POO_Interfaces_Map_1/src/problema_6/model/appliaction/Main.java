package problema_6.model.appliaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import problema_6.model.entities.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Map<String , List<ContaBancaria>> contasBancarias = new HashMap<>();
		List<ContaBancaria> contas = new ArrayList<>();
		
		contas.add(new ContaBancaria("João", 1000.0));
		contas.add(new ContaBancaria("Maria", 800.0));
		
		contasBancarias.put("Contas", contas);
		
		for(String str : contasBancarias.keySet()) {
			List<ContaBancaria> lista = contasBancarias.get(str);
			
			for(ContaBancaria c : lista) {
				System.out.println("Saldo: " + c.getSaldo());
			}
		}
	}

}
