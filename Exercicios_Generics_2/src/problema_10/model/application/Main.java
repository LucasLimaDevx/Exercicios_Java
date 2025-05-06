package problema_10.model.application;

import problema_10.model.entities.Cache;

public class Main {

	public static void main(String[] args) {
		Cache<String> c1 = new Cache<String>();
		
		c1.armazenar("abc");
		System.out.println(c1.get());
		
		Cache<Integer> c2 = new Cache<Integer>();
		
		c2.armazenar(10);
		c2.armazenar(20);
		System.out.println(c2.get());
		
		
		Cache<Double> c3 = new Cache<Double>();
		
		c3.armazenar(3.14);
		System.out.println(c3.get());
		
		
		Cache<Boolean> c4 = new Cache<Boolean>();
		
		c4.armazenar(true);
		c4.armazenar(false);
		
		System.out.println(c4.get());
		
		Cache<Boolean> c5 = new Cache<Boolean>();
		
		System.out.println(c5.get());

	}

}
