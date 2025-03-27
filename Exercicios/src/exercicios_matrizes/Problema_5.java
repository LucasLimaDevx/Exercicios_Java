package exercicios_matrizes;

public class Problema_5 {

	public static void main(String[] args) {
		
		int[][] matriz = {
				{1, 2, 3},
				{4, 5, 6}
		};
		
		int[][] matrizTransposta = transporMatriz(matriz);
		
		String resultado = "";
		for(int i = 0 ; i < matrizTransposta.length ; i++) {
			
			for(int j = 0 ; j < matrizTransposta[i].length ; j++) {
				
				resultado += matrizTransposta[i][j] + " ";
				
			}
			
			resultado += "\n";
		}
		
		
		System.out.println(resultado);
	}
	
	/*
	 *  [a00 a01 a02]           
	 *  [a10 a11 a12]
	 * 	
	 * 	[a00 a10]
	 * 	[a01 a11]
	 * 	[a02 a12]
	 * 
	 * */
	
	public static int[][] transporMatriz(int[][] matriz){
		
		int[][] novaMatriz = new int[3][2];
		
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[i].length ; j++) {
				
				novaMatriz[j][i] = matriz[i][j];
				
			}
			
		}
		
		return novaMatriz;
		
	}

}
