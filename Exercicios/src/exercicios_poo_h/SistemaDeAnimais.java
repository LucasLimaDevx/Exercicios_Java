package exercicios_poo_h;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeAnimais {
	List<Animal> list = new ArrayList<>();
	
	public void adiconarAnimal(String nome, Tipo tipo) {
		if(Tipo.GATO == tipo) {
			Gato gato = new Gato(nome, tipo);
			
			list.add(gato);
		}else {
			Cachorro cachorro = new Cachorro(nome, tipo);
			
			list.add(cachorro);
		}
	}
	
	public void listarAnimais() {
		for(Animal animal : list) {
			if(animal.getTipo() == Tipo.CACHORRO) {
				Cachorro c = (Cachorro) animal;
				
				System.out.println("SOM EMITIDO: " + c.emitirSom());
			}else {
				Gato g = (Gato) animal;
				
				System.out.println("SOM EMITIDO: " + g.emitirSom());
			}
		}
	}
}
