package exercicios_poo_h_2;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeVeiculos {
	List<Veiculo> veiculos = new ArrayList<>();
	
	public void adicionarVeiculo(Veiculo veiculo) {
		veiculos.add(veiculo);
	}
	
	public void listarVeiculos() {
		for(int i = 0 ; i < veiculos.size() ; i++) {
			Veiculo v = veiculos.get(i);
			
			System.out.println(v.getModelo() + " - Ano: " + v.getAno() +" Preco: " + String.format("%.2f", v.getPreco()));
		}
	}
	
}
