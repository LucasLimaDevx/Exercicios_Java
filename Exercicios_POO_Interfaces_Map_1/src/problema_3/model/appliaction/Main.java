package problema_3.model.appliaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import problema_3.model.entities.Divisao;
import problema_3.model.entities.Subtracao;
import problema_3.model.interfaces.Operacao;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Map<String, List<Operacao>> operacoes = new HashMap<>();
		List<Operacao> divisoes = new ArrayList<>();
		List<Operacao> subtracoes = new ArrayList<>();
		
		divisoes.add(new Divisao(20.0, 5.0));
		divisoes.add(new Divisao(30.0, 6.0));
		subtracoes.add(new Subtracao(15.0, 3.0));
		subtracoes.add(new Subtracao(50.0, 25.0));
		
		operacoes.put("Divisão", divisoes);
		operacoes.put("Subtracao", subtracoes);
		
		for(String str : operacoes.keySet()) {
			List<Operacao> list = operacoes.get(str);
			
			for(Operacao o : list) {
				System.out.println(o.executarOperacao());
			}
		}
		
		
		

	}

}
