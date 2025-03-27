package study;

public class Retangulo3 {
	
	private double largura;
	private double altura;
	
	public Retangulo3() {
		
		this.largura = 1;
		this.altura = 1;
	}
	
	public double getLargura() {
		return largura;
	}


	public double getAltura() {
		return altura;
	}


	public Retangulo3(double largura, double altura) {
		
		this.largura = largura;
		this.altura = altura;
	}
	
	public double calcularArea() {
		return largura * altura;
	}
	

	public boolean ehIgual(Retangulo3 retangulo) {
		
		if(this.getLargura() == retangulo.getLargura() && this.getAltura() == retangulo.getAltura()) {
			return true;
		}
		
		
		return false;
	}
}/*package application;


import java.util.Locale;
import java.util.Scanner;

import study.Retangulo3;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo3 ret1 = new Retangulo3(3.0, 4.5);
		Retangulo3 ret2 = new Retangulo3(5.4, 9.0);
		Retangulo3 ret3 = new Retangulo3(3.0, 4.5);
		
		System.out.println(ret1.ehIgual(ret2));
		System.out.println(ret1.ehIgual(ret3));
		
		
		
		
		sc.close();
	}

}*/
