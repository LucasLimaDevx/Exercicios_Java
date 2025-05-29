package problema_2.model.application;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Map<Character, String> frutas = new LinkedHashMap<>();
		
		frutas.put('A', "Abacate");
		frutas.put('B', "Banana");
		frutas.put('A', "Abacaxi");
		frutas.put('C', "Caju");
		
		for(Character c : frutas.keySet()) {
			System.out.println(c + " = " + frutas.get(c));
		}
		
		input.close();
	}

}
