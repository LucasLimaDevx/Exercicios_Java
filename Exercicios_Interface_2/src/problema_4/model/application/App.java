package problema_4.model.application;

import problema_4.model.entities.Portugues;

public class App {

	public static void main(String[] args) {
		Portugues p = new Portugues();
		
		p.traduzir("Hello");
		p.traduzir("Good morning");
		
		p.traduzir("Hola");
		p.traduzir("Gracias");
	}

}
