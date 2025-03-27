package exercicios_matrizes;

public class Problema_4 {

	public static void main(String[] args) {
		
		int[][] matriz = {
				{10, 12, 5},
				{6, 8, 11},
				{15, 3, 2}
		};
		
		int maiorElemento = encontrarMaiorElemento(matriz);
		
		System.out.println("Maior elemento = " + maiorElemento);

	}
	
	public static int encontrarMaiorElemento(int[][] matriz) {
		int maiorElemento = 0;
		
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[i].length ; j++) {
				
				if(matriz[i][j] > maiorElemento) {
					maiorElemento = matriz[i][j];
				}
				
			}
			
		}
		
		return maiorElemento;
	}

}
