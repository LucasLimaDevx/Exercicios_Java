package study;

public class Retangulo {
	private double largura;
	private double altura;
	
	public Retangulo(double largura, double altura) {
		
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

import study.Retangulo;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo1 = new Retangulo(5.0, 4.0);
		Retangulo retangulo2 = new Retangulo(3.0, 7.0);
		
		double area1 = retangulo1.calcularArea();
		double area2 = retangulo2.calcularArea();
		
		System.out.println("Area do retângulo 1 = " + area1);
		System.out.println("Area do retângulo 2 = "+ area2);
		
		sc.close();
	}

}*/