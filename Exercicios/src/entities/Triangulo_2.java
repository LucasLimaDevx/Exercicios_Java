package entities;

public class Triangulo_2 {
	public double base;
	public double altura;
	public double lado;
	
	public double areaDoTriangulo() {
		return (base * altura) / 2 ; 
	}
	
	public double perimetroDoTriangulo() {
		return base + altura + lado;
	}
	
	public String verificaTipoDoTriangulo(){
		
		if(base == altura && base == lado && altura == lado) {
			return "Equilátero";
		}
		
		if(base == altura || base == lado || altura == lado) {
			return "Isósceles";
		}
		
		return "Escaleno";
		
	}
}

/*
 * package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo_2;
import entities.CombustivelCarro;
import entities.Triangulo_2;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo_2 tri = new Triangulo_2();
		System.out.print("Digite a base do triângulo: ");
		tri.base = sc.nextDouble();
		
		System.out.print("Digite a altura do triângulo: ");
		tri.altura = sc.nextDouble();
		
		System.out.print("Digite a lado do triângulo: ");
		tri.lado = sc.nextDouble();
		
		double areaDoTriangulo = tri.areaDoTriangulo();
		double perimetroDoTriangulo = tri.perimetroDoTriangulo();
		String tipoDoTriangulo = tri.verificaTipoDoTriangulo();
		
		System.out.printf("Área: %.2f", areaDoTriangulo);
		System.out.println("");
		System.out.printf("Perímetro: %.2f", areaDoTriangulo);
		System.out.println("");
		System.out.println("Tipo: "+ tipoDoTriangulo);
		
		sc.close();
	}

}
*/
