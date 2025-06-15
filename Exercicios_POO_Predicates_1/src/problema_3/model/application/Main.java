package problema_3.model.application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import problema_3.model.entities.Carro;
import problema_3.model.enums.Cor;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Sistema sistema = new Sistema();
		
		for(int i = 0 ; i < 4 ; i++) {
			System.out.print("NOME DO CARRO: ");
			String nome = sc.nextLine();
			
			System.out.print("ANO DO CARRO: ");
			Integer ano = sc.nextInt();
			sc.nextLine();
			
			System.out.print("COR DO CARRO: ");
			String cor = sc.nextLine();
			
			sistema.adicionarCarro(nome, ano, cor);
			
			System.out.println();
			
		}
		
		
		List<Carro> carrosFiltrados = sistema
				.getCarros()
				.stream()
				.filter(carro -> carro.getAno() > 2015 && carro.getCor() == Cor.PRETO )
				.collect(Collectors.toList());
		
		for(Carro carro : carrosFiltrados) {
			System.out.println(carro.getNome());
		}
		
		
		
		
		
		sc.close();
	}

}
