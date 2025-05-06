package problema_7.model.application;

import problema_7.model.entities.Pilha;

public class Main {

	public static void main(String[] args) {
		Pilha<Integer> pilha1 = new Pilha<>(2);
		
		
		pilha1.empilhar(1);
		pilha1.empilhar(2);
		
		System.out.println(pilha1.verificarCapacidade());
		
		Pilha<String> pilha2 = new Pilha<>(3);
		
		pilha2.empilhar("a");
		System.out.println(pilha2.verificarCapacidade());
		
		Pilha<Double> pilha3 = new Pilha<>(5);
		
		pilha3.empilhar(1.1);
		pilha3.empilhar(2.2);
		
		System.out.println(pilha3.verificarCapacidade());
		
		Pilha<Boolean> pilha4 = new Pilha<>(2);
		
		pilha4.empilhar(true);
		pilha4.empilhar(false);
		
		System.out.println(pilha4.verificarCapacidade());

	}

}
