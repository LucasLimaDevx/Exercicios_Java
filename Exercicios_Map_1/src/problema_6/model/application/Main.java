package problema_6.model.application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<String, String> estados = new HashMap<>();
		
		System.out.print("Digite a quantidade de pares: ");
		int n = input.nextInt();
		
		for(int i = 1 ; i <= n ; i++) {
			System.out.print("Digite a sigla do estado: ");
			String estado = input.next();
			input.nextLine();
			
			System.out.print("Digite o nome da capital: ");
			String capital = input.nextLine();
			
			estados.put(estado, capital);
			
			System.out.println();
			
		}
		
		System.out.println(estados.size());
		
		input.close();
	}

}
