package exercicios_matrizes;

public class Problema_11 {

	public static void main(String[] args) {
		int[][] matriz = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		
		for(int i = 0 ; i < matriz.length ; i++) {
			
			int soma = 0;
			
			for(int j = 0 ; j < matriz[i].length ; j++) {
				soma += matriz[j][i];
			}
			
			System.out.println("Coluna " + (i+1) +": " + soma);
		}

	}

}
