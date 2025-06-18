package problema_7.model.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import problema_7.model.entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		funcionarios.add(new Funcionario("João", 2500.0));
		funcionarios.add(new Funcionario("Paula", 3200.0));
		funcionarios.add(new Funcionario("Igor", 2800.0));
		funcionarios.add(new Funcionario("Carla", 3100.0));

		Consumer<Funcionario> cons = (f) -> {
			if(f.getSalario() < 3000.0) {
				f.setSalario(f.getSalario() * (1.0 + 0.15));
			}
		};
		
		funcionarios.forEach(cons);
		
		for(Funcionario f : funcionarios) {
			System.out.println(String.format("%.2f", f.getSalario()));
		}
	}

}
