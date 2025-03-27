package exercicios_matrizes_2;

public class Problema_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz1[][] = {
				{1, 0},
				{0, 1}
		};
		int matriz2[][] = {
				{2, 0},
				{0, 1}
		};
		
		
		String res1 = ehIdentidade(matriz1);
		System.out.println(res1);
		
		String res2 = ehIdentidade(matriz2);
		System.out.println(res2);
	}
	
	public static String ehIdentidade(int[][] matriz) {
		if(matriz[0][0] == 1 && matriz[1][1] == 1 && matriz[0][1] == 0 && matriz[1][0] == 0) {
			return "É identidade";
		}
		
		return "Não é identidade";
	}

}
