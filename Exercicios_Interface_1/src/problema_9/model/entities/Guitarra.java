package problema_9.model.entities;

import problema_9.model.interfaces.Instrumento;

public class Guitarra implements Instrumento{

	@Override
	public void tocar() {
		System.out.println("Som da Guitarra");		
	}

	@Override
	public void parar() {
		System.out.println("Silêncio");
	}
	
}
