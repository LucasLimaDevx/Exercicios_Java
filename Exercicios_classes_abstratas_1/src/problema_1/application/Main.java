package problema_1.application;

import java.util.Locale;

import problema_1.entities.Circulo;
import problema_1.entities.Figura;
import problema_1.entities.Retangulo;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Figura c1 = new Circulo("Azul", "Círculo 1", 3.0);
		Figura c2 = new Circulo("Vermelho", "Círculo 2", 5.0);
		
		Figura r1 = new Retangulo("Verde", "Retângulo 1", 4.0, 6.0);
		Figura r2 = new Retangulo("Verde", "Retângulo 2", 7.0, 3.0);
		
		System.out.println("Area de c1: " + String.format("%.2f", c1.calcularArea()));
		System.out.println("Area de c2: " + String.format("%.2f", c2.calcularArea()));
		System.out.println("Area de r1: " + String.format("%.2f", r1.calcularArea()));
		System.out.println("Area de r2: " + String.format("%.2f", r2.calcularArea()));

	}

}
