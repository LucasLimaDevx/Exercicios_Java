package problema_8.model.application;

import java.util.Arrays;

import problema_8.model.entities.Validador;

public class Main {

	public static void main(String[] args) {
		Validador v1 = new Validador(Arrays.asList(1, 2, 3, 4, 5));
		Validador v2 = new Validador(Arrays.asList(-1, 0, 2, 3));
		Validador v3 = new Validador(Arrays.asList(10, 20, 30));
		Validador v4 = new Validador(Arrays.asList(-5, -10, -15));
		
		System.out.println(v1.verificaNumerosPositivos() ? "Sim" : "Não");
		System.out.println(v2.verificaNumerosPositivos() ? "Sim" : "Não");
		System.out.println(v3.verificaNumerosPositivos() ? "Sim" : "Não");
		System.out.println(v4.verificaNumerosPositivos() ? "Sim" : "Não");

	}

}
