package problema_4.model.application;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		set2.add(100);
		set2.add(200);
		
		
		System.out.println(set1.size());
		System.out.println(set2.size());
	}

}
