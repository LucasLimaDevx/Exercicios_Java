package problema_5.model.application;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		set2.add(7);
		set2.add(8);
		set2.add(9);
		
		System.out.println(set1.isEmpty());
		System.out.println(set2.isEmpty());
	}

}
