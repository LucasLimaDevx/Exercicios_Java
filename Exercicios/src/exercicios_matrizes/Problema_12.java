package exercicios_matrizes;

public class Problema_12 {

	public static void main(String[] args) {
		
		int[][] matriz = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
				
		};
		int totalColunas = matriz[0].length;
		
		String resultado = "";
		/*
		 * [a00 a01 a02] [a10 a11 a12]
		 * [a10 a11 a12] [a00 a01 a02]
		 * [a20 a21 a22] [a20 a21 a22]	
		 * j+1 = 0+1 = 1
		 * 		 1+1
		 * */
		for(int i = 0 ; i < totalColunas ; i++) {
			
			int a = matriz[0][i];
			int b = matriz[1][i];
			
			matriz[0][i] = b;
			matriz[1][i] = a;
			
		}
		
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[i].length ; j++) {
				
				resultado += matriz[i][j] + " ";
			}
			
			resultado += "\n";
			
		}
		
		System.out.println(resultado);

	}

}
