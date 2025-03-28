package problema_1.model.application;

import java.util.Locale;

import problema_1.model.entities.Circulo;
import problema_1.model.entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Retangulo r1 = new Retangulo(5.0 , 4.0);
		Retangulo r2 = new Retangulo(6.0, 3.0);
		
		System.out.println("Área do retângulo 1 : " + String.format("%.2f", r1.area()));
		System.out.println("Perímetro do retângulo 1 : " + String.format("%.2f", r1.perimetro()));
		
		System.out.println();
		
		System.out.println("Área do retângulo 2 : " + String.format("%.2f", r2.area()));
		System.out.println("Perímetro do retângulo 2 : " + String.format("%.2f", r2.perimetro()));
		
		Circulo c1 = new Circulo(3.0);
		Circulo c2 = new Circulo(5.0);
		
		System.out.println();
		
		System.out.println("Área do círculo 1 : " + String.format("%.2f", c1.area()));
		System.out.println("Perímetro do círculo 1 : " + String.format("%.2f", c1.perimetro()));
		
		System.out.println();
		
		System.out.println("Área do círculo 2 : " + String.format("%.2f", c2.area()));
		System.out.println("Perímetro do círculo 2 : " + String.format("%.2f", c2.perimetro()));

	}

}
