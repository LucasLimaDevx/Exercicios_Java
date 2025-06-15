package problema_8.model.appliaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import problema_8.model.entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Map<String, List<Funcionario>> funcionarios = new HashMap<String, List<Funcionario>>();
		List<Funcionario> listaDeFuncioanrios = new ArrayList<Funcionario>();
		
		Funcionario f1 = new Funcionario("João", 3000.0);
		Funcionario f2 = new Funcionario("Maria", 4000.0);
		Funcionario f3 = new Funcionario("Pedro", 2500.0);
		Funcionario f4 = new Funcionario("Ana", 5000.0);
		
		f1.calcularSalario(10.0);
		f2.calcularSalario(5.0);
		f3.calcularSalario(15.0);
		f4.calcularSalario(3.0);
		
		listaDeFuncioanrios.add(f1);
		listaDeFuncioanrios.add(f2);
		listaDeFuncioanrios.add(f3);
		listaDeFuncioanrios.add(f4);
		
		funcionarios.put("Funcionarios", listaDeFuncioanrios);
		
		for(String str : funcionarios.keySet()) {
			List<Funcionario> lista = funcionarios.get(str);
			
			for(Funcionario f : lista) {
				System.out.println("Novo salário: " + String.format("%.2f", f.getSalario()));
			}
			
			
		}

	}

}
