package exercicios_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Problema_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = {
				{1, 2, 3}, 
				{4, 5, 6}, 
				{7, 8, 9}
			};
		
		int soma = 0;
		
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[i].length ; j++) {
				
				soma += matriz[i][j];
			}
			
		}
		
		System.out.println("SOMA = " + soma);
		sc.close();
	}

}
