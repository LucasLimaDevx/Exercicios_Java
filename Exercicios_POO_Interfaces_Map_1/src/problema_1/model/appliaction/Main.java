package problema_1.model.appliaction;

import java.util.HashMap;
import java.util.Map;

import problema_1.model.entities.Multiplicacao;
import problema_1.model.entities.Soma;

public class Main {

	public static void main(String[] args) {
		Map<Double, String> operacoes = new HashMap<>();
		
		Soma s1 = new Soma();
		Soma s2 = new Soma();
		
		Multiplicacao m1 = new Multiplicacao();
		Multiplicacao m2 = new Multiplicacao();
		
		operacoes.put(s1.calcular(5.0, 3.0), s1.toString());
		operacoes.put(s2.calcular(10.0, 7.0), s2.toString());
		operacoes.put(m1.calcular(5.0, 3.0), m1.toString());
		operacoes.put(m2.calcular(10.0, 7.0), m2.toString());
		
		for(Double resultado : operacoes.keySet()) {
			System.out.println(operacoes.get(resultado) + ": " + resultado);
		}

	}

}
