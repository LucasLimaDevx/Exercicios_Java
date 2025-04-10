package problema_6.model.application;

import problema_6.model.entities.EventoCorporativo;
import problema_6.model.entities.EventoPessoal;
import problema_6.model.interfaces.Evento;

public class App {

	public static void main(String[] args) {
		Evento e1 = new EventoPessoal();
		Evento e2 = new EventoCorporativo();
		
		e1.agendar();
		e2.agendar();
		
		e1.cancelar();
		e2.cancelar();
	}

}
