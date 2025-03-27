package problema_3.application;

import problema_3.entites.Animal;
import problema_3.entites.Ave;
import problema_3.entites.Mamifero;

public class Main {

	public static void main(String[] args) {
		Animal a1 = new Mamifero("Leão", 5);
		Animal a2 = new Ave("Papagaio", 7);
		Animal a3 = new Mamifero("Onça", 10);
		
		Animal a4 = new Mamifero("Gato",2);
		Animal a5 = new Ave("Galo", 3);
		Animal a6 = new Mamifero("Elefante", 20);
		Animal a7 = new Ave("Águia", 9);
		
		Animal a8 = new Mamifero("Cachorro", 7);
		Animal a9 = new Ave("Coruja", 6);
		
		ControleDeAnimais sistema1 = new ControleDeAnimais();
		ControleDeAnimais sistema2 = new ControleDeAnimais();
		ControleDeAnimais sistema3 = new ControleDeAnimais();
		
		sistema1.adicionarAnimal(a1);
		sistema1.adicionarAnimal(a2);
		sistema1.adicionarAnimal(a3);
		
		sistema1.listarTotalDeAnimais();
		System.out.println();
		
		sistema2.adicionarAnimal(a4);
		sistema2.adicionarAnimal(a5);
		sistema2.adicionarAnimal(a6);
		sistema2.adicionarAnimal(a7);
		
		sistema2.listarTotalDeAnimais();
		System.out.println();
		
		sistema3.adicionarAnimal(a8);
		sistema3.adicionarAnimal(a9);
		
		sistema3.listarTotalDeAnimais();
	}

}
