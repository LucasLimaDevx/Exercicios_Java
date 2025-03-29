package problema_7.model.application;

import problema_7.model.entities.CartaDeBaralho;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CartaDeBaralho c1 = new CartaDeBaralho();
		CartaDeBaralho c2 = new CartaDeBaralho();
		CartaDeBaralho c3 = new CartaDeBaralho();
		CartaDeBaralho c4 = new CartaDeBaralho();
		
		c1.criarCarta("Ás de Espadas");
		c2.criarCarta("Rei de Copas");
		c3.criarCarta("7 de Ouros");
		c4.criarCarta("Dama de Paus");
		
		System.out.println(c1.getNomeDaCarta());
		System.out.println(c2.getNomeDaCarta());
		System.out.println(c3.getNomeDaCarta());
		System.out.println(c4.getNomeDaCarta());
	}

}
