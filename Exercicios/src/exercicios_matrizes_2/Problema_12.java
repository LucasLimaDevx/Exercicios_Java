package exercicios_matrizes_2;

import java.util.Scanner;

public class Problema_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[4][4];
		
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[0].length ; j++) {
				
				matriz[i][j] = sc.nextInt();
				
			}
			
		}
		
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[0].length ; j++) {
				
				if(matriz[i][j] < 0) {
					matriz[i][j] = 0;
				}
				
			}
			
		}
		
		String res = "";
		
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[0].length ; j++) {
				
				
				res += matriz[i][j] + " ";
				
			}
			
			res += "\n";
			
		}
		
		System.out.println(res);
		
		
		sc.close();
	}

}
