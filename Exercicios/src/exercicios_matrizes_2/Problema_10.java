package exercicios_matrizes_2;

import java.util.Scanner;

public class Problema_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [][] matriz = new int[5][3];
		
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[0].length ; j++) {
				
				matriz[i][j] = sc.nextInt();
				
			}
			
		}
		
		for(int i = 0 ; i < matriz.length ; i++) {
			
			int somaTotal = 0;
			for(int j = 0 ; j < matriz[0].length ; j++) {
				
				somaTotal += matriz[i][j];
				
			}
			
			System.out.println("Linha " + (i+1)+": " + somaTotal);
		}
		
		sc.close();

	}

}
