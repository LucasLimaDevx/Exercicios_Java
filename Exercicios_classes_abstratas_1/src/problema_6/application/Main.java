package problema_6.application;

import java.util.Locale;

import problema_6.entities.Instrumento;
import problema_6.entities.Piano;
import problema_6.entities.Violino;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Instrumento i1 = new Violino("Stradivarius", "Madeira", 60.0);
		Instrumento i2 = new Piano("Yamaha C3", "Madeira", 1.5);
		Instrumento i3 = new Violino("Cremona", "Madeira", 58.0);
		Instrumento i4 = new Piano("Steinway D", "Madeira", 2.0);
		
		System.out.println(i1.tocar());
		System.out.println(i2.tocar());
		System.out.println(i3.tocar());
		System.out.println(i4.tocar());

	}

}
