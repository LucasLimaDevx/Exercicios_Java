package entities;

public class ConversorDeVelocidade {
	public double velocidadeKmH;
	public double velocidadeMS;
	
	public double velocidadeMS() {
		return velocidadeKmH / 3.6;
	}
	public double velocidadeKMH() {
		return velocidadeMS * 3.6;
	}
}
/*
 * 
 * package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ConversorDeVelocidade;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		ConversorDeVelocidade convVelocidade = new ConversorDeVelocidade();
		
		System.out.print("Digite km/h para m/s ou m/s para km/h: ");
		String unidadeDeVelocidade = sc.nextLine();
		
		
		
		if(unidadeDeVelocidade.equals("km/h")) {
			
			System.out.print("Digite o valor da velocidade em Km/h: ");
			convVelocidade.velocidadeKmH = sc.nextDouble();
			
			System.out.printf("Velocidade: %.2f m/s", convVelocidade.velocidadeMS());
			System.out.println("");
			if(convVelocidade.velocidadeMS() < 20) {
				System.out.println("A velocidade está abaixo do limite");
			}
			else if(convVelocidade.velocidadeMS() == 20) {
				System.out.println("A velocidade está no limite");
			}else {
				System.out.println("A velocidade está acima do limite");
			}
			
			
			
			
		}else {
			System.out.print("Digite o valor da velocidade em m/s: ");
			convVelocidade.velocidadeMS = sc.nextDouble();
			
			System.out.printf("Velocidade: %.2f Km/h", convVelocidade.velocidadeKMH());
			
			if(convVelocidade.velocidadeMS() < 72) {
				System.out.println("A velocidade está abaixo do limite");
			}
			else if(convVelocidade.velocidadeMS() == 72) {
				System.out.println("A velocidade está no limite");
			}else {
				System.out.println("A velocidade está acima do limite");
			}
		}
		
		
		sc.close();
	}

}

 * 
 * 
 * 
 * 
 * */