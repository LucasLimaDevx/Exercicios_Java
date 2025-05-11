package problema_9.model.application;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, Double> produtos = new HashMap<>();
		
		produtos.put("celular", 1000.0);
		produtos.put("relógio", 500.0);
		produtos.put("fone", 300.0);
		produtos.put("capa", 50.0);
		
		System.out.println(soma(produtos));
		

	}
	
	public static Double soma(Map<String, Double> map) {
		double soma = 0.0;
		for(String key : map.keySet()) {
			soma += map.get(key);
		}
		
		return soma;
	}
}
