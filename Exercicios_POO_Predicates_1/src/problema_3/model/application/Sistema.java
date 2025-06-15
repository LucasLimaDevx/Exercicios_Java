package problema_3.model.application;

import java.util.ArrayList;
import java.util.List;

import problema_3.model.entities.Carro;
import problema_3.model.enums.Cor;

public class Sistema {
	List<Carro> carros = new ArrayList<Carro>();
	
	public void adicionarCarro(String nome, Integer ano, String cor) {
		Carro carro = new Carro(nome, ano, Cor.valueOf(cor.toUpperCase()));
		
		carros.add(carro);
	}

	public List<Carro> getCarros() {
		return carros;
	}
	
	
}
