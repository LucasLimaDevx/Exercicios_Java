package problema_4.model.entities;

import problema_4.model.intefaces.Tradutor;

public class Portugues implements Tradutor{

	@Override
	public void traduzir(String sentenca) {
		switch(sentenca) {
			case "Hello":
				System.out.println("Olá");
				break;
			case "Good morning":
				System.out.println("Bom-dia");
				break;
			case "Hola":
				System.out.println("Olá");
				break;
			case "Gracias":
				System.out.println("Obrigado");
				break;
		}
		
	}

}
