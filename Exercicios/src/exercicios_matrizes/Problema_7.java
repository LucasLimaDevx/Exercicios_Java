package exercicios_matrizes;

public class Problema_7 {

	public static void main(String[] args) {
		
		int[][] m1 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int[][] m2 = {
				{9,8,7},
				{6,5,4},
				{3,2,1}
		};
		
		int[][] m3 = somaMatrizes(m1, m2);
		
		String resultado = "";
		
		for(int i = 0 ; i < m3.length ; i++) {
			
			for(int j = 0 ; j < m3[i].length ; j++) {
				resultado += m3[i][j] + " ";
			}
			
			resultado += "\n";
			
		}
		
		System.out.println(resultado);
		
	}
	
	public static int[][] somaMatrizes(int[][] m1 , int[][] m2){
		/*
		 * [a00 a01 a02]	[b00 b01 b02]    [a00 + b00   a01 + b01   a02 + b02]
		 * [a10 a11 a12] + 	[b10 b11 b12] =  [a10 + b10   a11 + b11   a12 + b12] 
		 * [a20 a21 a22]	[b20 b21 b22]	 [a20 + b20   a21 + b21   a22 + b22]
		 * 
		 * */
		
		int linhas = m1.length;
		int colunas = m1[0].length;
		
		
		int[][] novaMatriz = new int[linhas][colunas];
		
		for(int i = 0 ; i < linhas ; i++) {
			
			for(int j = 0 ; j < linhas ; j++) {
				
				novaMatriz[i][j] = m1[i][j] + m2[i][j];
			}
			
		}
		
		return novaMatriz;
	}
}
