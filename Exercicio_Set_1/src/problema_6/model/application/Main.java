package problema_6.model.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite a quantidade de elementos para o primeiro set: ");
		int n = sc.nextInt();
		
		System.out.print("Digite a quantidade de elementos para o segundo set: ");
		int  m = sc.nextInt();
		
		for(int i = 0 ; i < n  ; i++) {
			System.out.print("Digite o " + (i+1) + "° elemento: ");
			Integer e = sc.nextInt();
			
			set1.add(e);
		}
		
		for(int j = 0 ; j < m ; j++) {
			System.out.print("Digite o " + (j+1) + "° elemento: ");
			Integer e = sc.nextInt();
			
			set1.add(e);
		}
		
		System.out.print("Digite um elemento para remover do primeiro set: ");
		set1.remove(sc.nextInt());
		
		System.out.print("Digite um elemento para remover do segundo set: ");
		set2.remove(sc.nextInt());
		
		imprimirElementos(set1);
		
		System.out.println();
		
		imprimirElementos(set2);
		
		sc.close();
		
		

	}
	
	public static void imprimirElementos(Set<Integer> set) {
		for(Integer i : set) {
			System.out.println(i);
		}
	}

}
