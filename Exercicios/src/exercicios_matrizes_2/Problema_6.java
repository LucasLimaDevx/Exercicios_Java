package exercicios_matrizes_2;

public class Problema_6 {

	public static void main(String[] args) {
		
		int[][] m1 = {
				{1, 2, 3},
				{4, 5,6}
		};
		
		int[][] m2 = {
				{7, 8},
				{9, 10},
				{11, 12}
		};
		
		int[][] matriz = multiplicarMatrizes(m1, m2);
		
		String resultado = "";
		
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[i].length ; j++) {
				resultado += matriz[i][j] + " ";
			}
			resultado += "\n";
		}
		
		System.out.println(resultado);

	}
	
	public static int[][] multiplicarMatrizes(int[][] matriz1, int[][] matriz2){
		
		int linhas = matriz1.length;
		int colunas = matriz2[0].length;
		
		int[][] novaMatriz = new int[linhas][colunas];
		
		/*
		 * [a00 a01 a02] * [b00 b01]	[a00 * b00 + a01 * b10 + a02 * b20       a00 * b01 + a01 * b11 + a02 * b21]
		 * [a10 a11 a12]   [b10 b11] = 	[a10 * b00 + a10 * b10 + a12 * b20       a10 * b00 + a11 * b11 + b12 * b21]
		 * 				   [b20 b21]
		 * */
		for(int i = 0 ; i < matriz1.length ; i++) {
			
			for(int j = 0 ; j < matriz2[j].length  ; j++) {
				int soma = 0;
				
				for(int k = 0 ; k < matriz2.length ; k++) {
					
					int a = matriz1[i][k];
					int b = matriz2[k][j];
					
					soma += a * b;
					
				}
				novaMatriz[i][j] = soma;
				
			}
			
		}
		
		
		
		
		
		return novaMatriz;
	}

}
