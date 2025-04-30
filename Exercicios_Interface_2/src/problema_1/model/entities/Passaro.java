package problema_1.model.entities;

import problema_1.model.interfaces.Animal;

public class Passaro implements Animal{

	@Override
	public void emitirSom() {
		System.out.println("Cantando");
		
	}

	@Override
	public void mover() {
		System.out.println("Voando");
		
	}
	
}
