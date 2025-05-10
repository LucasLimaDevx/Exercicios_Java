package problema_3.model.application;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		
		set1.add(5);
		set1.add(10);
		set1.add(15);
		set1.add(5);
		
		
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		
		imprimirSet(set1);
		System.out.println();
		imprimirSet(set2);

	}
	
	public static void imprimirSet(Set<Integer> set) {
		for(Integer i : set) {
			System.out.println(i);
		}
	}

}
