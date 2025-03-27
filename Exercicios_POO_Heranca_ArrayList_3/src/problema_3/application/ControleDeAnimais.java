package problema_3.application;

import java.util.ArrayList;
import java.util.List;

import problema_3.entites.Animal;
import problema_3.entites.Mamifero;

public class ControleDeAnimais {
	List<Animal> animais = new ArrayList<>();
	
	public void adicionarAnimal(Animal animal) {
		animais.add(animal);
	}
	
	public void listarTotalDeAnimais() {
		
		Integer totalMamiferos = 0;
		Integer totalAves = 0;
		for(Animal a : animais) {
			
			if(a instanceof Mamifero) {
				totalMamiferos++;
				
			}else {
				totalAves++;
			}
		}
		
		System.out.println("Mamíferos: "+ totalMamiferos + ", Aves: " + totalAves);
	}
}
