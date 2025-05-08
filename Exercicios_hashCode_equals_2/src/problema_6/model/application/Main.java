package problema_6.model.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import problema_6.model.entities.Carro;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Carro> carros = new HashSet<Carro>();
		
		System.out.print("Quantos carros seram inseridos? ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n ; i++) {
			System.out.print("Digite a placa: ");
			String placa = sc.next();
			
			Carro carro = new Carro(placa);
			System.out.println(!carros.contains(carro) ? "Sim" : "Não");
			
			if(!carros.contains(carro)) {
				System.out.println("ADICIONADO PLACA = " + carro.getPlaca());
				carros.add(carro);
			}
		}
		
		
		sc.close();
	}

}
