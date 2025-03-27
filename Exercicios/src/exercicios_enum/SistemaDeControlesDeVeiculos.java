package exercicios_enum;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeControlesDeVeiculos {
	List<Veiculo> veiculos = new ArrayList<>();
	
	public void adicionarVeiculos(String placa, String modelo, Status_3 status) {
		Veiculo veiculo = new Veiculo(placa, modelo, status);
		
		veiculos.add(veiculo);
	}
	
	public void alterarStatus(String placa, Status_3 status) {
		
		for(Veiculo veiculo : veiculos) {
			if(veiculo.getPlaca().equals(placa)) {
				veiculo.setStatus(status);
				break;
			}
		}
	}
	
	public void listarVeiculos(Status_3 status) {
		for(Veiculo veiculo : veiculos) {
			if(veiculo.getStatus() == status) {
				System.out.println("Placa " + veiculo.getPlaca() + "\nModelo: " + veiculo.getModelo() + "\nStatus: " + veiculo.getStatus());
				System.out.println("----------------------");
			}
		}
	}
}
