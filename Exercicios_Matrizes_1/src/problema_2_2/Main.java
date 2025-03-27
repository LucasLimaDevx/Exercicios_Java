package problema_2_2;

public class Main {

	public static void main(String[] args) {
		int[][] matriz = { {1, 2}, {3, 4}};
		/*
		 * [1 2] -- > [1 3]
		 * [3 4]	  [2 4]
		 * 
		 *       0   1
		 *       
		 * 0 - [a00 a01] --> [a00 a10]
		 * 1 - [a10 a11]	 [a01 a11]
		 * 
		 * 
		 * 	   [a00 a01 a02] --> [a00 a10 a20]
		 * 	   [a10 a11 a12]	 [a01 a11 a21]
		 * 	   [a20 a21 a22]	 [a02 a12 a22]	
		 * */
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = i + 1 ; j < matriz.length ; j++) {
				
				int aij = matriz[i][j];
				int bji = matriz[j][i];
				
				matriz[i][j] = aij;
				matriz[j][i] = bji;
				
				
			}
		
		}
		
		
		for(int i = 0 ; i < matriz.length ; i++) {
			for(int j = 0 ; j < matriz.length ; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

}
