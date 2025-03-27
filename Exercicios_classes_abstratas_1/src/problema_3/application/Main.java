package problema_3.application;

import problema_3.entities.Animal;
import problema_3.entities.Cachorro;
import problema_3.entities.Gato;

public class Main {

	public static void main(String[] args) {
		Animal a1 = new Cachorro("Rex", 3, "Cachorro");
		Animal a2 = new Gato("Fifi", 2, "Gato");
		Animal a3 = new Cachorro("Bob", 5, "Cachorro");
		Animal a4 = new Gato("Mimi", 2, "Gato");
		
		System.out.println("O "+ a1.getNome() + " faz "+a1.emitirSom());
		System.out.println("A "+ a2.getNome() + " faz "+a2.emitirSom());
		System.out.println("O "+ a3.getNome() + " faz "+a3.emitirSom());
		System.out.println("A "+ a4.getNome() + " faz "+a4.emitirSom());
	}

}
