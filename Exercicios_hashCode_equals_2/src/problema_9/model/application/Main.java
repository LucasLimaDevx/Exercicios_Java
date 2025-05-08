package problema_9.model.application;

import problema_9.model.entities.Cidade;

public class Main {

	public static void main(String[] args) {
		Cidade c1 = new Cidade("São Luís", "MA", 1100000);
		Cidade c2 = new Cidade("São Luís", "MA", 1100000);
		
		System.out.println(c1.equals(c2));
		
		
		Cidade c3 = new Cidade("São Paulo", "SP", 12000000);
		Cidade c4 = new Cidade("São Paulo", "SP", 10000000);
		
		System.out.println(c3.equals(c4));
		
		Cidade c5 = new Cidade("Rio", "RJ", 7000000);
		Cidade c6 = new Cidade("Rio", "RJ", 7000000);
		
		System.out.println(c5.equals(c6));
		
		Cidade c7 = new Cidade("Teresina", "PI", 850000);
		Cidade c8 = new Cidade("TERESINA", "PI", 850000);
		
		System.out.println(c7.equals(c8));
	}

}
