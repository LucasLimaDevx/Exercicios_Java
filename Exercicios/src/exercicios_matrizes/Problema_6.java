package exercicios_matrizes;

public class Problema_6 {

	public static void main(String[] args) {
		
		int[][] m1 = {
				{1, 2},
				{3, 4}
		};
		
		int[][] m2 = {
				{5, 6},
				{7, 8}
		};
		
		int[][] m3 = multiplicarMatrizes(m1, m2);
		
		String resultado = "";
		
		for(int i = 0 ; i < m3.length ; i++) {
			
			for(int j = 0 ; j < m3[i].length ; j++) {
				resultado += m3[i][j] + " ";
			}
			
			resultado += "\n";
			
		}
		
		System.out.println(resultado);
	}
	
	
	public static int[][] multiplicarMatrizes(int[][] m1, int[][] m2){
		
		/*		  j = 0		  j = 1 					k = 0                  k = 1
		 * 
		 * i= 0 [a00 a01] * [b00 b01]  =  [a00 * b00 + a01 * b10   a00 * b01 + a01 * b11]
		 * i= 1 [a10 a11]   [b10 b11]	  [a10 * b00 + a11 * b10   a10 * b01 + a11 * b11]
		 * 
		 * 							 
		 * */
		int numeroDeLinhas = m1.length;
		int numeroDeColunas = m2[0].length;
		
		int[][] novaMatriz = new int[numeroDeLinhas][numeroDeColunas];
		
		for(int i = 0 ; i < m1.length ; i++ ) {
			
			
			
			for(int j = 0 ; j < m2.length ; j++) {
				int soma = 0;
				
				
				
				for(int k = 0 ; k < m2[j].length ; k++) {
					
					int aij = m1[i][k];
					int bkj = m2[k][j];
					
					soma += aij * bkj;
				}
				
				novaMatriz[i][j] = soma;
			}
			
			
		}
		
		
		
		return novaMatriz;
	}

}
