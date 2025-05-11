package problema_7.model.application;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, String> frutas = new LinkedHashMap<>();
		
		
		frutas.put("vermelha", "maçã");
		frutas.put("amarela", "banana");
		frutas.put("verde", "kiwi");
		frutas.put("roxa", "uva");
		
		Map<String, String> cores = inverterMap(frutas);
		
		for(String fruta : cores.keySet()) {
			System.out.println(fruta + " : " + cores.get(fruta));
		}
		
		

	}
	
	public static Map<String, String> inverterMap(Map<String, String> map){
		Map<String, String> novoMap = new LinkedHashMap<String, String>();
		
		for(String key : map.keySet()) {
			novoMap.put(map.get(key), key);
			
		}
		
		return novoMap;
	}

}
