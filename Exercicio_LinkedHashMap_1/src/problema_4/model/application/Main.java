package problema_4.model.application;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<Integer , String> map = new LinkedHashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		
		map.put(10, "dez");
		map.put(15, "quinze");
		map.put(20, "vinte");
		map.put(25, "vinte e cinco");
		
		System.out.print("Digite o valor da chave: ");
		Integer chave = sc.nextInt();
		
		if(map.containsKey(chave)) {
			System.out.println(chave);
		}else {
			System.out.println("Não encontrada");
		}
		
		sc.close();
	}

}
