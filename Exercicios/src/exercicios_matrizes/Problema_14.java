package exercicios_matrizes;

import java.util.Scanner;

public class Problema_14 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[i].length ; j++) {
				
				matriz[i][j] = sc.nextInt();
			}
			
		}
		
		String matrizStr = matrizString(matriz);
		System.out.println(matrizStr);
		sc.close();

	}
	
	public static String matrizString(int[][] matriz) {
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
