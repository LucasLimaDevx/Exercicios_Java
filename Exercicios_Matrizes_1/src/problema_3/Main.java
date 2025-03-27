package problema_3;

public class Main {

	public static void main(String[] args) {
		int[][] matriz = {
				{1, 2},
				{3, 4}
		};
		
		int[][] resultado = multiplicarPorEscalar(matriz, 2);
		
		for(int i = 0 ; i < resultado.length ; i++) {
			for(int j =  0 ; j < resultado.length ; j++) {
				System.out.print(resultado[i][j] + " ");
			}
			System.out.println();
		}

	}
	
	public static int[][] multiplicarPorEscalar(int[][] m, int escalar){
		for(int i = 0 ; i < m.length ; i++) {
			
			for(int j =  0 ; j < m.length ; j++) {
				m[i][j] *= escalar;
			}
		}
		
		return m;
	}

}
