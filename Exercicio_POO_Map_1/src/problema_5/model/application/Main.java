package problema_5.model.application;

import java.util.HashMap;
import java.util.Map;

import problema_5.model.entities.Candidato;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> candidatos = new HashMap<>();
		
		Candidato c1 = new Candidato("João", "A");
		Candidato c2 = new Candidato("Carla", "B");
		Candidato c3 = new Candidato("Miguel", "A");
		Candidato c4 = new Candidato("Bianca", "C");
		
		
		candidatos.put(c1.getNome(), 120);
		candidatos.put(c2.getNome(), 150);
		candidatos.put(c3.getNome(), 140);
		candidatos.put(c4.getNome(), 90);
		
		System.out.println(buscarCandidatoMaisVotos(candidatos));

	}
	
	public static String buscarCandidatoMaisVotos(Map<String, Integer> candidatos) {
		String candidato = null;
		Integer maiorVoto = null;
		for(String c : candidatos.keySet()) {
			if(maiorVoto == null) {
				maiorVoto = candidatos.get(c);
			}else {
				
				if(maiorVoto < candidatos.get(c)) {
					maiorVoto = candidatos.get(c);
					candidato = c;
				}
				
				
			}
			
			
		}
		return candidato;
	}

}
