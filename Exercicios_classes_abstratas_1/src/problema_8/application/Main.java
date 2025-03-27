package problema_8.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import problema_8.entities.Guerreiro;
import problema_8.entities.Mago;
import problema_8.entities.Personagem;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Personagem> personagens = new ArrayList<Personagem>();
		
		
		Personagem p1 = new Guerreiro("Ragnar", 10, 150, 30, 10, 5);
		Personagem p2 = new Guerreiro("Thorin", 12, 180, 25, 15, 3);
		Personagem p3 = new Mago("Merlin", 8 , 100, 50, 4, 12);
		Personagem p4 = new Mago("Morgana", 9, 120, 60, 5, 10);
		
		personagens.add(p1);
		personagens.add(p2);
		personagens.add(p3);
		personagens.add(p4);
		
		for(Personagem personagem : personagens) {
			if(personagem instanceof Guerreiro) {
				System.out.println("O dano causado pelo guerreiro/guerreira " + personagem.getNome() + " foi de: "+ personagem.calcularDano());
				continue;
			}
			System.out.println("O dano causado pelo mago/maga " + personagem.getNome() + " foi de: "+ personagem.calcularDano());
			
			
		}
	
		
	}

}
