package problema_7.model.entities;

import problema_7.model.interfaces.Carta;

public class CartaDeBaralho implements Carta{
	private String nomeDaCarta;

	@Override
	public void criarCarta(String nomeDaCarta) {
		this.nomeDaCarta = nomeDaCarta;
		
	}
	
	public String getNomeDaCarta() {
		return nomeDaCarta;
	}
	
	
}
