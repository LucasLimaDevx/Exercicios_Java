package study;

public class Circulo {
	
	public final double PI = 3.14159;
	private double raio;
	
	
	
	public Circulo(double raio) {
		
		this.raio = raio;
		
	}



	public double calcularArea() {
		return PI * (raio * raio);
	}
	
}

/*package application;


import java.util.Locale;
import java.util.Scanner;

import study.Circulo;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Circulo c1 = new Circulo(3);
		Circulo c2 = new Circulo(5);
		
		double area1 = c1.calcularArea();
		double area2 = c2.calcularArea();
		
		System.out.println("Area do círculo 1 = " + String.format("%.2f", area1));
		System.out.println("Area do círculo 2 = " + String.format("%.2f", area2));
		
		
		sc.close();
	}

}*/
