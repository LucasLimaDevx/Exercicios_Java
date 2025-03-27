package problema_4;

public class Main {

	public static void main(String[] args) {
		int [][] matriz1 = {{1, 2}, {3, 4}};
		int [][] matriz2 = {{1, 2}, {2, 1}};
		
		System.out.println(ehSimetrica(matriz1));
		System.out.println(ehSimetrica(matriz2));

	}
	
	public static boolean ehSimetrica(int[][] matriz) {
		
		boolean resultado = true;
		
		if(matriz.length != matriz[0].length) {
			
			System.out.println("A matriz não é quadrada");
			
			return !resultado;
		}
		int[][] matrizTransposta = calcularMatrizTransposta(matriz);
		
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz.length ; j++) {
				
				if(matrizTransposta[i][j] != matriz[i][j]) {
					resultado = false;
					break;
				}
			}
			
			if(resultado == false) {
				break;
			}
			
		}
		
		return resultado;
	}
	
	public static int[][] calcularMatrizTransposta(int[][]matriz){
		
		int[][] matrizT = new int[2][2];
		
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz.length ; j++) {
				matrizT[i][j] = matriz[j][i];	
				
			}
			
		}
		
		return matrizT;
	}

}
