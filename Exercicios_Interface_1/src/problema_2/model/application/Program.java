package problema_2.model.application;

import problema_2.model.entities.Radio;
import problema_2.model.entities.Tv;

public class Program {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		
		tv.ligar("Ligar TV");
		tv.desligar("Desligar TV");
		
		Radio radio = new Radio();
		
		radio.ligar("Ligar Radio");
		radio.desligar("Desligar Radio");
		
		
	}

}
