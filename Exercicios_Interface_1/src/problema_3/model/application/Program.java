package problema_3.model.application;

import java.util.Locale;

import problema_3.model.entities.Carro;
import problema_3.model.entities.Moto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Carro c1 = new Carro();
		Moto m1 = new Moto();
		
		c1.acelerar(10.0);
		m1.acelerar(15.0);
		
		Carro c2 = new Carro();
		Moto m2 = new Moto();
		
		c2.acelerar(5.0);
		m2.acelerar(8.0);
		
	}

}
