package exercicios_matrizes_2;

public class Problema_8 {

	public static void main(String[] args) {
		
		int [][] matriz = {
				{1, 2, 3, 4},
				{2, 1, 5, 6},
				{3, 5, 1, 7},
				{4, 6, 7, 1}
		};
		
		int [][] matrizT = calcularTransposta(matriz);
		
		String txt = "";
		
		for(int i = 0 ; i < matrizT.length ; i++) {
			
			for(int j = 0 ; j < matrizT[i].length ; j++) {
				txt += matrizT[i][j] + " ";
			}
			txt += "\n";
			
		}
		
		System.out.println(txt);
		
		String resultado = ehSimetrica(matriz, matrizT);
		
		System.out.println(resultado);
	}
	
	public static int[][] calcularTransposta(int[][] m){
		int linhas = m[0].length;
		int colunas = m.length;
		
		int[][] novaMatriz = new int[linhas][colunas];
		/*
		 * [a00 a01 a02 a03]		[a00 a10 a20 a30]
		 * [a10 a11 a12 a13] -->	[a01 a11 a21 a31]
		 * [a20 a21 a22 a23]		[a02 a12 a22 a32]
		 * [a30 a31 a32 a33]		[a03 a13 a23 a33]
		 * */
		for(int i = 0 ;  i < linhas ; i++) {
			
			for(int j = 0 ; j < colunas ; j++) {
				
				novaMatriz[i][j] = m[j][i];
			}
			
		}
		
		return novaMatriz;
	}
	public static String ehSimetrica(int[][] m1, int[][] m2){
		boolean flag = true;
		for(int i = 0 ; i < m1.length ; i++ ) {
			
			for(int j = 0 ; j < m1[0].length ; j++) {
				
				if(m1[i][j] == m2[i][j]) {
					continue;
				}else {
					flag = false;
					break;
				}
				
			}
			
			if(flag == false) {
				break;
			}
			
		}
		
			
		return flag ? "É simétrica" : "Não é simétrica";
	}
}
