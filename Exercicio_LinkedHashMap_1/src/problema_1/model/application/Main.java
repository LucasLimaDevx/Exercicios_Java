package problema_1.model.application;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos elementos serão digitados? ");
		int n = input.nextInt();
		
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		
		for(int i = 1 ; i <= n ; i++) {
			System.out.print("Digite o " + i + "° par: ");
			Integer par = input.nextInt();
			
			System.out.print("Digite o valor: ");
			String valor = input.next();
			
			map.put(par, valor);
			
		}
		
		for(Integer par : map.keySet()) {
			System.out.println(par + " = " + map.get(par));
		}
		
		input.close();
	}

}
