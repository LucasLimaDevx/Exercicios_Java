package exercicios_matrizes;

public class Problema_9 {

	public static void main(String[] args) {
		
		int[][] matriz = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
				
		};
		
		for( int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[i].length ; j++) {
				
				if(i == j) {
					matriz[i][j] = 0;
					break;
				}
				
			}
			
		}
		
		String matrizStr = matrizString(matriz);
		
		System.out.println(matrizStr);

	}
	
	public static String matrizString(int[][] matriz) {
		
		String textMatriz = "";
		
		for( int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[i].length ; j++) {
				textMatriz += matriz[i][j] + " ";
			}
			textMatriz += "\n";
		}
		
		return textMatriz;
	}

}
