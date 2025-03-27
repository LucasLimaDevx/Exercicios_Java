package exercicios_matrizes_2;

public class Problema_4 {

	public static void main(String[] args) {
		int[][] matriz = {
				{10, 20, 5, 15, 30},
				{25, 35, 40, 45, 50}
		};
		
		int menorElemento = encontrarMenorElemento(matriz);
		
		System.out.println("Menor elemento: "+menorElemento);
		
	}
	
	public static int encontrarMenorElemento(int[][] matriz) {
		int menorElemento = matriz[0][0];
		
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[i].length ; j++) {
				
				if(matriz[i][j] < menorElemento) {
					
					menorElemento = matriz[i][j];
					
				}
				
			}
			
		}
		
		return menorElemento;
	}
	
}
