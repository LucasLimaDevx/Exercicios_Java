package problema_2.application;

import problema_2.entities.Carro;
import problema_2.entities.Veiculo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo v1 = new Veiculo("HB20", 2020);
		Veiculo v2 = new Carro("Corolla", 2019, 4);
		Veiculo v3 = new Veiculo("Fucas", 1975);
		
		Veiculo v4 = new Carro("Civic", 2022, 4);
		Veiculo v5 = new Veiculo("Uno", 2015);
		
		Veiculo v6 = new Veiculo("Palio", 2010);
		Veiculo v7 = new Carro("Hilux", 2021, 4);
		
		
		CadastroDeVeiculos sistema = new CadastroDeVeiculos();
		
		sistema.adicionarVeiculos(v1);
		sistema.adicionarVeiculos(v2);
		sistema.adicionarVeiculos(v3);	
		sistema.adicionarVeiculos(v4);
		sistema.adicionarVeiculos(v5);
		sistema.adicionarVeiculos(v6);
		sistema.adicionarVeiculos(v7);
		
		sistema.listarVeiculos();
		
		
		
		
		
	}

}
