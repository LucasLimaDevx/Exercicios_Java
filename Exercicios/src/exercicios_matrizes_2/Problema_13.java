package exercicios_matrizes_2;

public class Problema_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz1 = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		int[][] matriz2 = {
				{2, 5, 3},
				{1, 4, 6},
				{7, 8, 9}
		};
		
		int determinante1 = calcularDeterminante(matriz1);
		System.out.println("Determinante: " + determinante1);
		
		int determinante2 = calcularDeterminante(matriz2);
		System.out.println("Determinante: " + determinante2);
	}
	
	
	public static int calcularDeterminante(int[][] matriz) {
		
		int soma = 0;
		/*
		 * [a00 a01 a02]
		 * [a10 a11 a12]
		 * [a20 a21 a22]
		 * */
		for(int i = 0, j = 0 ; j < matriz.length ; j++) {
			if(i == 0 && j == 0) {
				int det00 = matriz[1][1] * matriz[2][2] - matriz[2][1] * matriz[1][2];
				soma += det00 * matriz[0][0];
			}
			if(i == 0 && j == 1) {
				int det01 = matriz[1][0] * matriz[2][2] - matriz[2][0] * matriz[1][2];
				soma -= det01 * matriz[0][1];
			}
			if(i == 0 && j == 2) {
				int det02 = matriz[1][0] * matriz[2][1] - matriz[2][0] * matriz[1][1];
				soma += det02 * matriz[0][2];
			}
			
		}
		
		return soma;
		
	}
}
