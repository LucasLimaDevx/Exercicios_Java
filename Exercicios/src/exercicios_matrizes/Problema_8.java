package exercicios_matrizes;

public class Problema_8 {

	public static void main(String[] args) {
		
		int[][] matriz = {
				{1, 2, 3},
				{2, 1, 4},
				{3, 4, 1}
		};
		
		int[][] matrizT = calcularMatrizTransposta(matriz);
		boolean ehSimetrica = verificiaSimetriaDeMatrizes(matriz, matrizT);
		
		
		System.out.println(ehSimetrica ? "É simétrica " : "Não é simétrica");

	}
	
	public static int[][] calcularMatrizTransposta(int[][] matriz){
		
		/*
		 * 		[a00 a01 a02]		[a00 a10 a20]
		 * 		[a10 a11 a12] ---> 	[a01 a11 a21]
		 * 		[a20 a21 a22]		[a02 a21 a22]
		 * 
		 * */
		
		int matrizTamanho = matriz.length;
		
		int[][] matrizTransposta = new int[matrizTamanho][matrizTamanho];
		
		for(int i = 0 ; i < matrizTamanho ; i++) {
			
			for(int j = 0 ; j < matrizTamanho ; j++) {
				
				matrizTransposta[i][j] = matriz[j][i];
			}
			
		}
		
		return matrizTransposta;
	}
	
	public static boolean verificiaSimetriaDeMatrizes(int[][] matriz, int[][] matrizT) {
		boolean flag = true;
		
		for(int i = 0 ; i < matrizT.length ; i++) {
			
			for(int j = 0 ; j < matriz[i].length ; j++) {
				
				if(matriz[i][j] == matrizT[i][j]) {
					continue;
				}
				
				flag = false;
				
			}
			
		}	
		
		return flag;
	}
	
}
