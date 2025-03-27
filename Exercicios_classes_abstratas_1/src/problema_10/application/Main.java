package problema_10.application;

import java.util.Locale;

import problema_10.entities.Alimento;
import problema_10.entities.Eletronico;
import problema_10.entities.Produto;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		
		Produto p1 = new Alimento("Arroz", "Alimento", 100.0, 123456789);
		Produto p2 = new Alimento("Feijão", "Alimento", 50.0, 987654321);
		Produto p3 = new Eletronico("Celular", "Eletrônico", 200.0, 456123789);
		Produto p4 = new Eletronico("Notebook", "Eletrônico", 500.0, 789456123);
		
		System.out.println(p1.getNome() + " preço: " + String.format("%.2f", p1.calcularPrecoFinal()));
		System.out.println(p2.getNome() + " preço: " + String.format("%.2f", p2.calcularPrecoFinal()));
		System.out.println(p3.getNome() + " preço: " + String.format("%.2f", p3.calcularPrecoFinal()));
		System.out.println(p4.getNome() + " preço: " + String.format("%.2f", p4.calcularPrecoFinal()));

	}

}
