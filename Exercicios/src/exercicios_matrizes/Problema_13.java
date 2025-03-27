package exercicios_matrizes;

public class Problema_13 {

	public static void main(String[] args) {
		int[][] matriz = {
				{3, 8},
				{4, 6}
		};
		
		int determinante = calcularDeterminanteMatriz2x2(matriz);
		
		System.out.println("DETERMINANTE = " + determinante);
	}
	
	public static int calcularDeterminanteMatriz2x2(int[][] matriz) {
		
		return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
		
	}

}
