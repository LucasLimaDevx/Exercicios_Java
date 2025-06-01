package problema_9.model.application;

import java.util.Arrays;

import problema_9.model.entities.Palavra;

public class Main {

	public static void main(String[] args) {
		Palavra p1 = new Palavra(Arrays.asList("ovo", "arara", "casa"));
		Palavra p2 = new Palavra(Arrays.asList("radar", "carro", "ana"));
		Palavra p3 = new Palavra(Arrays.asList("mesa", "cadeira", "livro"));
		Palavra p4 = new Palavra(Arrays.asList("mirim", "subus", "reviver"));
		
		System.out.println(p1.verificaPalindormo());
		System.out.println(p2.verificaPalindormo());
		System.out.println(p3.verificaPalindormo());
		System.out.println(p4.verificaPalindormo());

	}

}
