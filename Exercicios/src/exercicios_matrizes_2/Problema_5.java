package exercicios_matrizes_2;

public class Problema_5 {

	public static void main(String[] args) {
		int[][] matriz = {
				{1,2},
				{3,4},
				{5,6}
		};
		
		int[][] matrizT = calcularMatrizTransposta(matriz);
		String resultado = "";
		
		for(int i = 0 ; i < matrizT.length ; i++) {
			
			for(int j = 0 ; j < matrizT[i].length ; j++) {
				
				resultado += matrizT[i][j] + " ";
			}
			
			resultado += "\n";
			
		}
		
		System.out.println(resultado);
		
	}
	
	public static int[][] calcularMatrizTransposta(int[][] matriz){
		/*
		 * 	[a00 a01]   [a00 a10 a20]
		 * 	[a10 a11]	[a01 a11 a21]
		 * 	[a20 a21]
		 * 
		 * 
		 * */
		int colunas = matriz.length;
		int linhas = matriz[0].length;
		
		int[][] novaMatriz = new int[linhas][colunas];
		
		for(int i = 0 ; i < linhas ; i++) {
			
			for(int j = 0 ; j < colunas ; j++) {
				
				int n =  matriz[j][i];
				novaMatriz[i][j] = n;
				
			}
			
		}
		
		return novaMatriz;
		
		
	}

}
