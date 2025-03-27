package study;

public class Retangulo2 {
	private double largura;
	private double altura;
	
	public Retangulo2() {
		
		this.largura = 1;
		this.altura = 1;
	}
	
	public Retangulo2(double largura, double altura) {
		
		this.largura = largura;
		this.altura = altura;
	}
	
	public double calcularArea() {
		return largura * altura;
	}
	
	
	
}
/*package application;


import java.util.Locale;
import java.util.Scanner;

import study.Retangulo2;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		Retangulo2 retangulo1 = new Retangulo2(5.0, 4.0);
		Retangulo2 retangulo2 = new Retangulo2(3.0, 7.0);
		Retangulo2 retangulo3 = new Retangulo2();
		
		double area1 = retangulo1.calcularArea();
		double area2 = retangulo2.calcularArea();
		double area3 = retangulo3.calcularArea();
		System.out.println("Area do retângulo 1 = " + area1);
		System.out.println("Area do retângulo 2 = "+ area2);
		System.out.println("Area do retângulo 2 = "+ area3);
		
		sc.close();
	}

}*/