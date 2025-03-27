package problema_2.application;

import java.util.ArrayList;
import java.util.List;

import problema_2.entities.Carro;
import problema_2.entities.Veiculo;

public class CadastroDeVeiculos {
	List<Veiculo> veiculos = new ArrayList<>();
	
	public void adicionarVeiculos(Veiculo veiculo) {
		veiculos.add(veiculo);
	}
	
	public void listarVeiculos() {
		for(Veiculo v : veiculos) {
			
			if(v instanceof Carro) {
				Carro c = (Carro) v;
				System.out.println(c.getModelo() + " - " + c.getAno() +" ("+c.getNumeroDePortas()+"), portas");
			}else {
				System.out.println(v.getModelo() + " - " + v.getAno());
			}
			System.out.println("-------------------------------------");
		}
	}
	
}
