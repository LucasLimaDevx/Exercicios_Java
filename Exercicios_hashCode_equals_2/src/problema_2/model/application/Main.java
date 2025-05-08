package problema_2.model.application;

import java.util.HashSet;
import java.util.Set;

import problema_2.model.entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		Set<Pessoa> pessoas1 = new HashSet<>();
		
		Pessoa p1 = new Pessoa("João", 1);
		Pessoa p2 = new Pessoa("João", 1);
		
		pessoas1.add(p1);
		pessoas1.add(p2);
		
		Set<Pessoa> pessoas2 = new HashSet<>();
		Pessoa p3 = new Pessoa("Maria", 2);
		Pessoa p4 = new Pessoa("Maria", 3);
		
		pessoas2.add(p3);
		pessoas2.add(p4);
		
		Set<Pessoa> pessoas3 = new HashSet<>();
		Pessoa p5 = new Pessoa("Ana", 4);
		Pessoa p6 = new Pessoa("Ana", 4);
		
		pessoas3.add(p5);
		pessoas3.add(p6);
		
		Set<Pessoa> pessoas4 = new HashSet<>();
		Pessoa p7 = new Pessoa("Carlos", 5);
		Pessoa p8 = new Pessoa("João", 1);
		
		pessoas4.add(p7);
		pessoas4.add(p8);
		
		System.out.println(pessoas1.size());
		System.out.println(pessoas2.size());
		System.out.println(pessoas3.size());
		System.out.println(pessoas4.size());

		

	}

}
