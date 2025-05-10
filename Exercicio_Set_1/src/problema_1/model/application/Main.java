package problema_1.model.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> inteiros = new HashSet<>();
		
		System.out.print("Quantos elementos serão adicionados? ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n ; i++) {
			
			inteiros.add(sc.nextInt());
		}
		
		System.out.print("Digite um valor inteiro: ");
		int i = sc.nextInt();
		
		
		System.out.println(inteiros.contains(i));
		sc.close();
	}
	
	

}
