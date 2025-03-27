package exercicios_matrizes_2;

import java.util.Scanner;

public class Problema_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[2][4];
		
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[i].length ; j++) {
				
				matriz[i][j] = sc.nextInt();
			}
			
		}
		
		String matrizStr = stringMatriz(matriz);
		
		System.out.println(matrizStr);
		sc.close();
	}
	
	public static String stringMatriz(int[][] matriz) {
		
		String text = "";
		
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[i].length ; j++) {
				
				text += matriz[i][j] + " ";
			}
			
			text += "\n";
			
		}
		
		return text;
	}
}
