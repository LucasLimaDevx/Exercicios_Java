package study;

public class Grade {
	
	private double[][] notas;

	public Grade(double[][] notas) {
	
		this.notas = notas;
		
	}
	
	public double calcularMedia() {
		
		double soma = 0;

		for(int i = 0 ; i < notas.length ; i++) {
			
			for(int j = 0 ; j < notas[i].length ; j++) {
				
				soma += notas[i][j];
				
			}
			
			
		}
		
		return soma / (notas.length * notas[0].length);
	}
}
/*package application;


import java.util.Locale;
import java.util.Scanner;

import study.Grade;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Grade notas = new Grade(new double[][] {{7, 8}, {9, 6}});
		
		double media = notas.calcularMedia();
		
		System.out.println("Média geral = " + media);
		
		sc.close();
	}

}*/