package exercicios_matrizes_2;

public class Problema_3 {

	public static void main(String[] args) {
		int [][] matriz = {
				{2, 0, 0, 0, 0},
				{0, 3, 0, 0, 0},
				{0, 0, 4, 0, 0},
				{0, 0, 0, 5, 0},
				{0, 0, 0, 0, 6}
		};
		
		int resultado = multiplicarDiagonalPrincipal(matriz);
		
		System.out.println(resultado);
	}
	public static int multiplicarDiagonalPrincipal(int[][] matriz) {
		
		int produto = 1;
		
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[i].length ; j++) {
				
				if(i == j) {
					produto *= matriz[i][j];
				}
				
			}
			
		}
		
		return produto;
		
	}
}
