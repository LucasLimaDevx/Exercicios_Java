package problema_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriz = {
				{1, 2},
				{3, 4}
		};
		int[][] matrizT = new int[2][2];
		
		/*
		 * [1 2] --> [1 3]  [a00 a01] --> [a00 a10]
		 * [3 4]	 [2 4]	[a10 a11]	  [a01 a11]	
		 * 
		 * 
		 * */

		for(int i = 0; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[0].length ; j++) {
				
				matrizT[i][j] = matriz[j][i];
			}
			
			
		}
		
		for(int i = 0 ; i < matrizT.length ; i++) {
			
			for(int j = 0 ; j < matrizT[0].length ; j++) {
				System.out.print(matrizT[i][j] + " ");
			}
			System.out.println();
			
		}
	}

}
