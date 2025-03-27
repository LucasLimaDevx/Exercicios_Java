package exercicios_matrizes_2;

import java.util.Scanner;

public class Problema_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int matriz[][] = new int[2][6];
		
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[0].length ; j++) {
				
				matriz[i][j] = sc.nextInt();
				
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
