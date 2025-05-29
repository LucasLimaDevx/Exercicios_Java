package problema_1.model.application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import problema_1.model.entities.Multiplicacao;
import problema_1.model.entities.Soma;
import problema_1.model.interfaces.OperacaoMatematica;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Map<OperacaoMatematica, Number> operacoes = new HashMap<>();
		Soma s1 = new Soma();
		Soma s2 = new Soma();
		Multiplicacao m1 = new Multiplicacao();
		Multiplicacao m2 = new Multiplicacao();
		
		operacoes.put(s1, s1.calcular(5, 3));
		operacoes.put(s2, s2.calcular(10, 7));
		operacoes.put(m1, m1.calcular(5, 3));
		operacoes.put(m2, m2.calcular(10, 7));
		
		for(OperacaoMatematica operacao : operacoes.keySet()) {
			System.out.println("Resultado: " + String.format("%.2f", operacoes.get(operacao)));
		}
		

	}

}
