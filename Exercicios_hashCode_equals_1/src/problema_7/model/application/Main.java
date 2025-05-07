package problema_7.model.application;

import java.util.LinkedHashSet;
import java.util.Set;

import problema_7.model.entities.Objeto;

public class Main {

	public static void main(String[] args) {
		Objeto obj1 = new Objeto(1);
		Objeto obj2 = new Objeto(1);
		
		System.out.println("OBJ1 / OBJ2");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj1.equals(obj2));
		
		System.out.println();
		
		Objeto obj3 = new Objeto(2);
		Objeto obj4 = new Objeto(3);
		
		System.out.println("OBJ3 / OBJ4");
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
		System.out.println(obj3.equals(obj4));
		
		System.out.println();
		
		Objeto obj5 = new Objeto(4);
		Objeto obj6 = new Objeto(4);
		
		System.out.println("OBJ5 / OBJ6");
		System.out.println(obj5.hashCode());
		System.out.println(obj6.hashCode());
		System.out.println(obj5.equals(obj6));
		
		System.out.println();
		
		Objeto obj7 = new Objeto(5);
		Objeto obj8 = new Objeto(6);
		
		System.out.println("OBJ7 / OBJ8");
		System.out.println(obj7.hashCode());
		System.out.println(obj8.hashCode());
		System.out.println(obj7.equals(obj8));
		
		Set<Objeto> objetos = new LinkedHashSet<>();
		
		objetos.add(obj1);
		objetos.add(obj2);
		objetos.add(obj3);
		objetos.add(obj4);
		objetos.add(obj5);
		objetos.add(obj6);
		objetos.add(obj7);
		objetos.add(obj8);
		
		System.out.println();
		
		for(Objeto o : objetos) {
			System.out.println(o.getId());
		}
		
	}

}
