package problema_5.model.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import problema_5.model.entities.Nota;

public class Main {

	public static void main(String[] args) {
		List<Nota> notas = new ArrayList<Nota>();
		
		notas.add(new Nota("João", 7.0));
		notas.add(new Nota("Ana", 9.0));
		notas.add(new Nota("Pedro", 6.5));
		notas.add(new Nota("Maria", 8.0));
		
		Consumer<Nota> cons = (n) -> n.setValor(n.getValor() + 1.5);
		
		notas.forEach(cons);
		
		for(Nota n : notas) {
			System.out.println(n.getValor());
		}

	}

}
