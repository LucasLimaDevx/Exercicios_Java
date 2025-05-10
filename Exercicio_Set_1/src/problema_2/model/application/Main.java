package problema_2.model.application;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Set<Integer> inteiros1 = new HashSet<>();
		
		inteiros1.add(10);
		inteiros1.add(20);
		inteiros1.add(30);
		inteiros1.add(40);
		
		
		inteiros1.remove(30);
		
		
		
		Set<Integer> inteiros2 = new HashSet<>();
		
		inteiros2.add(100);
		inteiros2.add(200);
		inteiros2.add(300);
	
		
		
		inteiros2.remove(200);
		
		imprimirInteiros(inteiros1);
		imprimirInteiros(inteiros2);
	
	}
	
	public static void imprimirInteiros(Set<Integer> set) {
		for(Integer i : set ) {
			System.out.println(i);
		}
	}

}
