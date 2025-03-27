package problema_4.application;

import java.util.Scanner;

import problema_4.entities.Animal;
import problema_4.entities.Cachorro;
import problema_4.entities.Gato;
import problema_4.entities.Passaro;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tipo de animal (CACHORRO, GATO OU PÁSSARO): ");
		String tipoDeAnimal = sc.next().toUpperCase();
		
		Animal animal;
		switch(tipoDeAnimal) {
			case "CACHORRO":
				animal = new Cachorro();
				break;
			case "GATO":
				animal = new Gato();
				break;
			default:
				animal = new Passaro();
				
				
		}
		
		System.out.println(animal.emitirSom());
		
		sc.close();
	}

}
