package problema_8.model.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o total de elementos do set1: ");
		int n = sc.nextInt();
		
		System.out.print("Digite o total de elementos do set2: ");
		int m = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Digite os valores para o set1: ");
			int e = sc.nextInt();
			
			set1.add(e);
		}
		System.out.println();
		for(int i = 0 ; i < m ; i++) {
			System.out.print("Digite os valores para o set2: ");
			int e = sc.nextInt();
			
			set2.add(e);
		}
		System.out.println();
		System.out.println(set1.containsAll(set2));
		
		sc.close();

	}

}
