package problema_1.model.entities;

import problema_1.model.interfaces.Animal;

public class Cachorro implements Animal{

	@Override
	public void emitirSom() {
		System.out.println("Latindo");
		
	}

	@Override
	public void mover() {
		System.out.println("Andando");
		
	}
	
}
