package entities;

public class EquacaoQuadratica_2 {
	public double a;
	public double b;
	public double c;
	
	public String calcularRaizes() {
		double delta = b*b - 4 * a * c ;
		double raiz1 = (-b-Math.sqrt(delta)) / (2.0 * a);
		double raiz2 = (-b+Math.sqrt(delta)) / (2.0 * a);
		
		return "x1 = " + raiz1 +", x2 = " + raiz2;
	}
	public String calcularVerticieDaEquacao() {
		return "x = " + -b / (2 * a); 
	}
	
	public String eConcava() {
		if(a > 0) {
			return "A parábola é côncava para cima.";
		}
		
		return "A parábola é côncava para baixo.";
	}
}
/*
 * 
 * 
 * package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo_2;
import entities.CombustivelCarro;
import entities.EquacaoQuadratica_2;
import entities.Triangulo_2;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		EquacaoQuadratica_2 eq = new EquacaoQuadratica_2();
		System.out.print("Digite o valor de a: ");
		eq.a = sc.nextDouble();
		
		System.out.print("Digite o valor de b: ");
		eq.b = sc.nextDouble();
		
		System.out.print("Digite o valor de c: ");
		eq.c = sc.nextDouble();
		
		System.out.println("Raízes: " + eq.calcularRaizes());
		System.out.println("Vértice: " + eq.calcularVerticieDaEquacao());
		System.out.println(eq.eConcava());
		sc.close();
	}

}
*/
