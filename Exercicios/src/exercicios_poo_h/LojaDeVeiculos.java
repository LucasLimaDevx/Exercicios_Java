package exercicios_poo_h;

import java.util.ArrayList;
import java.util.List;

public class LojaDeVeiculos {
	List<Veiculo> veiculos = new ArrayList<>();
	
	public void adicionarVeiculo(String nome, TipoDoVeiculo tipo) {
		if(tipo == TipoDoVeiculo.CARRO) {
			veiculos.add(new Carro(nome, tipo));
		}else {
			 veiculos.add(new Moto(nome, tipo));
		}
	}
	
	public void listarVeiculos() {
		for(Veiculo veiculo : veiculos) {
			System.out.println(veiculo.toString());
		}
	}
}
