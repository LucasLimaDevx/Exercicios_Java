package exercicios_matrizes_2;

public class Problema_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		
		int m1[][] = fun(matriz, 00000);
		int m2[][] = fun(matriz, 10000);
		int m3[][] = fun(matriz, 20000);
		int m4[][] = fun(matriz, 10000);
		
		System.out.println(imprimeMatriz(m1));
		System.out.println(imprimeMatriz(m2));
		System.out.println(imprimeMatriz(m3));
		System.out.println(imprimeMatriz(m4));
		
	}
	
	public static int[][] fun(int[][] matriz, int n ) {
		
		/*
		 * [a00 a01 a02] i = 0 j = 2
		 * [a10 a11 a12] i = 1 j = 1
		 * [a20 a21 a22] i = 2 j = 0	
		 * */
		
		for(int i = 0 , j = matriz[0].length - 1; i < matriz.length ; i++, j--) {
			
			matriz[i][j] = n;
			
		}
		
		return matriz;
	}
	
	public static String imprimeMatriz(int[][] matriz) {
		String res = "";
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[0].length ; j++) {
				res += matriz[i][j] + " ";
			}
			
			res += "\n";
		}
		return res;
	}

}
