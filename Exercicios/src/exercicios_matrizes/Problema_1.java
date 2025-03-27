package exercicios_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Problema_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[i].length ; j++) {
				
				matriz[i][j] = sc.nextInt();
			}
			
		}
		String result = "";
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[i].length ; j++) {
				
				result +=  matriz[i][j] + " ";
				
			}
			result.trim();
			result += "\n";
		}
		
		System.out.println(result);
		
		sc.close();
	}

}
