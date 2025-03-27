package exercicios_matrizes_2;

public class Problema_2 {

	public static void main(String[] args) {
		
		int [][] matriz = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		
		int soma = somaElementosDaMatriz(matriz); 
		
		System.out.println("SOMA: " + soma);

	}
	
	public static int somaElementosDaMatriz(int[][] matriz) {
		int soma = 0; 
		
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[i].length ; j++) {
				
				soma += matriz[i][j];
			}
			
		}
		
		return soma;
	}

}
