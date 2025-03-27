package problema_2.application;

import java.util.Locale;
import java.util.Scanner;

import problema_2.entities.Caminhao;
import problema_2.entities.Carro;
import problema_2.entities.Moto;
import problema_2.entities.Veiculo;
import problema_2.enums.TipoDeVeiculo;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tipo de veículo (Carro, Moto ou Caminhão): ");
		String tipoDoVeiculo = sc.next().toUpperCase();
		
		System.out.print("Digite o valor do veículo: ");
		Double valor = sc.nextDouble();
		
		Veiculo veiculo;
		
		switch(tipoDoVeiculo) {
			case "CARRO":
				veiculo = new Carro(TipoDeVeiculo.valueOf(tipoDoVeiculo), valor);
				break;
			case "MOTO":
				veiculo = new Moto(TipoDeVeiculo.valueOf(tipoDoVeiculo), valor);
				break;
			case "CAMINHAO":
				veiculo = new Caminhao(TipoDeVeiculo.valueOf(tipoDoVeiculo), valor);
				break;
				
			default:
				veiculo = new Carro(TipoDeVeiculo.valueOf(tipoDoVeiculo), valor);
		
		}
		
		Double valorDoImposto = veiculo.calcularImposto();
		
		System.out.println("Valor do imposto: " + String.format("%.2f", valorDoImposto));
		
		sc.close();
	}

}
