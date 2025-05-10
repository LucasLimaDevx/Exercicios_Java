package problema_10.model.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de n: ");
		int n = sc.nextInt();
		
		System.out.print("Digite o valor de m: ");
		int m = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Digite os valores do set1: ");
			set1.add(sc.nextInt());
			
		}
		System.out.println();
		for(int i = 0 ; i < m ; i++) {
			System.out.print("Digite os valores do set2: ");
			set2.add(sc.nextInt());
		}
		System.out.println();
		System.out.println(set1.equals(set2));
		sc.close();

	}

}
