package problema_1.model.application;

import problema_1.model.entities.Cachorro;
import problema_1.model.entities.Passaro;
import problema_1.model.interfaces.Animal;

public class Program {

	public static void main(String[] args) {
		Animal cachorro = new Cachorro();
		Animal passaro = new Passaro();
		
		cachorro.emitirSom();
		cachorro.mover();
		
		System.out.println();
		
		passaro.emitirSom();
		passaro.mover();

	}

}
