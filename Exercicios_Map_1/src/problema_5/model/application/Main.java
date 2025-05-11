package problema_5.model.application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> paises = new HashMap<>();
		
		int k = 4;
		
		for(int i = 0 ; i < k ; i++) {
			System.out.print("Digite a sigla do país: ");
			String sigla = sc.next().toUpperCase();
			sc.nextLine();
			
			System.out.print("Digite o nome do país: ");
			String nomePais = sc.nextLine();
			
			System.out.println();
			
			paises.put(sigla, nomePais);
			
		}
		
		
		for(String pais : paises.keySet()) {
			System.out.println(pais);
		}
		System.out.println();
		System.out.println(paises.size());
		
		paises.clear();
		
		System.out.println(paises.size());
		
		
		
		sc.close();
	}

}
