package problema_6.model.entities;

import problema_6.model.interfaces.Evento;

public class EventoCorporativo implements Evento {

	@Override
	public void agendar() {
		System.out.println("Evento corporativo agendado");
		
	}

	@Override
	public void cancelar() {
		System.out.println("Evento corporativo cancelado");
		
	}
	
}
