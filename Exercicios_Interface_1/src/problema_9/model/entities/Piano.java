package problema_9.model.entities;

import problema_9.model.interfaces.Instrumento;

public class Piano implements Instrumento{

	@Override
	public void tocar() {
		System.out.println("Som do Piano");
		
	}

	@Override
	public void parar() {
		System.out.println("Silêncio");
		
	}

}
