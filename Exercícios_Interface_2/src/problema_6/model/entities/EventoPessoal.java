package problema_6.model.entities;

import problema_6.model.interfaces.Evento;

public class EventoPessoal implements Evento{

	@Override
	public void agendar() {
		System.out.println("Evento pessoal agedado");
		
	}

	@Override
	public void cancelar() {
		System.out.println("Evento pessoal cancelado");
		
	}

}
