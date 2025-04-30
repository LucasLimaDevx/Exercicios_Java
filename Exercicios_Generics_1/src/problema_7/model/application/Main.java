package problema_7.model.application;

import problema_7.model.entities.Pilha;

public class Main {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha1 = new Pilha<>();
		Pilha<String> pilha2 = new Pilha<>();
		Pilha<Double> pilha3 = new Pilha<>();
		Pilha<Boolean> pilha4 = new Pilha<>();
		
		pilha1.push(1);
		pilha1.push(2);
		
		System.out.println(pilha1.pop());
		
		pilha2.push("a");
		pilha2.push("b");
		
		System.out.println(pilha2.pop());
		
		pilha3.push(1.1);
		pilha3.push(2.2);
		
		System.out.println(pilha3.pop());
		
		pilha4.push(true);
		pilha4.push(false);
		
		System.out.println(pilha4.pop());

	}

}
