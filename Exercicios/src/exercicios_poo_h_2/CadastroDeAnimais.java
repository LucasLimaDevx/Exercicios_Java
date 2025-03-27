package exercicios_poo_h_2;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeAnimais {
	List<Animal> animais = new ArrayList<>();
	
	public void adicionarAnimal(Animal animal) {
		animais.add(animal);
	}
	
	public void listarGatos() {
		for(Animal animal : animais) {
			if(animal instanceof Gato) {
				Gato gato = (Gato) animal;
				System.out.println(gato.getNome() + " - Idade: " + gato.getIdade() + " -  Soma: "+ gato.getSom());
			}
		}
	}
}
