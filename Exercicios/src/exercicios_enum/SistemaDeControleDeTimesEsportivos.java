package exercicios_enum;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeControleDeTimesEsportivos {
	List<Jogador> jogadores = new ArrayList<>();
	
	public void adicionarJogador(String nome, Posicao posicao, String time) {
		Jogador jogador = new Jogador(nome, posicao, time);
		
		jogadores.add(jogador);
	}
	
	public void buscarJogadores(Posicao posicao) {
		System.out.println("LISTANDO JOGADORES DA POSIÇÃO: " + posicao);
		for(Jogador jogador : jogadores) {
			if(jogador.getPosicao() == posicao) {
				System.out.println("NOME DO JOGADOR: " + jogador.getNome());
				System.out.println("TIME DO JOGADOR: " + jogador.getTime());
				System.out.println();
				System.out.println("-----------------------------");
			}
		}
	}
	
	public void listarJogadores(String time) {
		System.out.println("LISTANDO JOGADORES DO TIME: " + time);
		
		for(Jogador jogador : jogadores) {
			if(jogador.getTime().equals(time)) {
				System.out.println("NOME DO JOGADOR: " + jogador.getNome());
				System.out.println("POSIÇÃO DO JOGADOR: " + jogador.getPosicao());
				
				System.out.println();
				System.out.println("-----------------------------");
			}
		}
	}


}
