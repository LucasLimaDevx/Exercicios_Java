package problema_7.model.entities;

public class MatematicaAvancada {
	
	
	
	public Double calcularFatorial(Double numero) {
		Double fatorial = 1.0;
		
		while(numero > 1.0) {
			fatorial *= numero;
			numero--;
		}
		return fatorial;
		
	}
	
	public Double calcularPotencia(Double numero, Double expoente) {
		return Math.pow(numero, expoente);
	}
}
