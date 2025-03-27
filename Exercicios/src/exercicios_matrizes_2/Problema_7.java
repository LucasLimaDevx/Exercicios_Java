package exercicios_matrizes_2;

public class Problema_7 {

	public static void main(String[] args) {
		int[][] m1 = {
				{1, 2},
				{3, 4}
		};
		
		int[][] m2 = {
				{5, 6},
				{7, 8}
				
		};
		
		int[][] m = somaMatriz(m1, m2);
		
		String res = "";
		
		for(int i = 0 ; i < m.length ; i++) {
			
			for(int j = 0 ; j < m[0].length ; j++) {
				
				res += m[i][j] + " ";
			}
			
			res += "\n";
			
		}
		
		System.out.println(res);
	}
	
	public static int[][] somaMatriz(int[][] m1, int[][] m2){
		
		int linhas = m1.length;
		int colunas = m1[0].length;
		
		int[][] novaMatriz = new int[linhas][colunas];
		
		/*
		 * 		[a00 a01] + [b00 b01] = [a00 + b00 a01 + b01]
		 * 		[a10 a11]	[b10 b11]	[a10 + b10 a11 + b11]
		 * 
		 * */
		
		for(int i = 0 ; i < linhas ; i++) {
			
			for(int j = 0 ; j < colunas ; j++) {
				
				int aij = m1[i][j];
				int bij = m2[i][j];
				
				novaMatriz[i][j] = aij + bij;
			}
			
		}
		
		return novaMatriz;
	}

}
