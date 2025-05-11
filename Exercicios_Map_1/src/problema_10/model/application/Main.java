package problema_10.model.application;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<String, String> estados = new LinkedHashMap<>();
		
		for(int i = 0 ; i < 4 ; i++) {
			System.out.print("Digite o estado: ");
			String estado = input.next().toUpperCase();
			input.nextLine();
			
			System.out.print("Digite a cidade: ");
			String cidade = input.nextLine();
			
			System.out.println();
			
			estados.put(estado, cidade);
		}
		
		System.out.println(gerarChaves(estados));
		input.close();
	}
	
	public static List<String> gerarChaves(Map<String, String> map){
		List<String> chaves = new ArrayList<String>();
		
		for(String key : map.keySet()) {
			chaves.add(key);
		}
		
		return chaves;
	}

}
