package exercicios_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Problema_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = {
				{2, 4, 6},
				{8, 3, 9},
				{5, 7, 1}
		};
		
		
		
		int resultado = fun(matriz);

		
		System.out.println(resultado);
		
		sc.close();
	}
	
	
	public static int fun(int[][] matriz) {
		int resultado = 1;
		
		for(int i  = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[i].length ; j++) {
				
				if(i == j) {
					resultado *= matriz[i][j];
				}
				
			}
			
		}
		
		return resultado;
	}
}
