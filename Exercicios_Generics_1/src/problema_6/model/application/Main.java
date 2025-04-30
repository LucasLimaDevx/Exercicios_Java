package problema_6.model.application;

import problema_6.model.entities.Fila;

public class Main {

	public static void main(String[] args) {
		Fila<Integer> fila1 = new Fila<>();
		Fila<String> fila2 = new Fila<>();
		Fila<Double> fila3 = new Fila<>();
		Fila<Boolean> fila4 = new Fila<>();
		
		fila1.enqueue(1);
		fila1.enqueue(2);
		
		System.out.println(fila1.dequeue());
		
		fila2.enqueue("a");
		fila2.enqueue("b");
		
		System.out.println(fila2.dequeue());
		
		fila3.enqueue(3.14);
		fila3.enqueue(1.4);
		
		System.out.println(fila3.dequeue());
		
		fila4.enqueue(true);
		fila4.enqueue(false);
		
		System.out.println(fila4.dequeue());

	}

}
