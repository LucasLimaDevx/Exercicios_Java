package problema_2.model.entities;

import problema_2.model.interfaces.Dispositivo;

public class Radio implements Dispositivo{
	private Boolean estadoDoDispostivio;
	
	
	
	public Boolean getEstadoDoDispostivio() {
		return estadoDoDispostivio;
	}

	public void setEstadoDoDispostivio(Boolean estadoDoDispostivio) {
		this.estadoDoDispostivio = estadoDoDispostivio;
	}

	@Override
	public void ligar(String estado) {
		if(estado.equals("Ligar Radio")) {
			estadoDoDispostivio = true;
			System.out.println("Ligado");
		}
	}

	@Override
	public void desligar(String estado) {
		if(estado.equals("Desligar Radio")) {
			estadoDoDispostivio = false;
			System.out.println("Desligado");
		}
		
	}
}
