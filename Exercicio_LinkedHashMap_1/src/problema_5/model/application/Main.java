package problema_5.model.application;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<Integer, String> cores = new LinkedHashMap<>();
		Scanner sc = new Scanner(System.in);
		
		
		cores.put(1, "azul");
		cores.put(2, "verde");
		cores.put(3, "amarelo");
		cores.put(4, "vermelho");
		
		System.out.print("Digite uma cor: ");
		String cor = sc.nextLine().toLowerCase();
		
		if(cores.containsValue(cor)) {
			System.out.println(cor);
		}
		else {
			System.out.println("Não encontrado");
		}
		sc.close();
	}

}
