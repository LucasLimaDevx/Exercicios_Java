package problema_7.model.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import problema_7.model.entities.Jogador;

public class Main {

	public static void main(String[] args) {
		Map<String, Jogador> jogadores = new TreeMap<>();
		List<Jogador> arr = new ArrayList<>();
		
		Jogador j1 = new Jogador("Lucas", 200);
		Jogador j2 = new Jogador("Carla", 350);
		Jogador j3 = new Jogador("Ana", 400);
		Jogador j4 = new Jogador("João", 390);
		
		jogadores.put(j1.getNome(), j1);
		jogadores.put(j2.getNome(), j2);
		jogadores.put(j3.getNome(), j3);
		jogadores.put(j4.getNome(), j4);
		
		for(String nome : jogadores.keySet()) {
			arr.add(jogadores.get(nome));
		}
		
		arr.sort((x, y) -> y.getPontuacao() - x.getPontuacao());
		
		for(Jogador j : arr) {
			System.out.println(j.getNome());
		}
		
	}

}
