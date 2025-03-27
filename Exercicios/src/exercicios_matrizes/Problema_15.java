package exercicios_matrizes;

public class Problema_15 {

	public static void main(String[] args) {
		
		int [][] matriz = {
				{1, 0, 0},
				{0, 1, 0},
				{0, 0, 1}
		};
		
		int [][] matriz2 = {
				{1, 0, 0},
				{0, 1, 1},
				{0, 0, 1}
		};
		
		System.out.println(ehIdentidade(matriz));
		System.out.println(ehIdentidade(matriz2));
		
		
	}
	
	public static String ehIdentidade(int[][] matriz) {
		boolean flag = true;
		for(int i = 0 ; i < matriz.length ; i++) {
			int totalOne = 0;
			
			for(int j = 0 ; j < matriz[i].length ; j++) {
				
				int n = matriz[i][j];
				
				if((n == 1 || n == 0) && totalOne <= 1) {
					
					if(n == 1) {
						totalOne++;
						
						if(totalOne > 1) {
							flag = false;
							break;
						}
					}
					continue;
				}else {
					flag = false;
					break;
				}
			}
			
			if(totalOne > 1) {
				
				break;
			}
			
		}
		
		return flag ? "É identidade" : "Não é identidade";
		
	}

}
