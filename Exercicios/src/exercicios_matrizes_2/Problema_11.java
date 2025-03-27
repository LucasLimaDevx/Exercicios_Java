package exercicios_matrizes_2;

public class Problema_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15}
		};
		
		for(int i =  0 ; i < matriz[0].length ; i++) {
			
			int somaTotal = 0;
			
			for(int j = 0 ; j < matriz.length ; j++) {
				
				somaTotal += matriz[j][i];
				
			}
			
			System.out.println("Coluna " + (i+1) + ": " + somaTotal);
			
		}
	}

}
